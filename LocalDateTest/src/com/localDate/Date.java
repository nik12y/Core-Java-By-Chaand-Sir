package com.localDate;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Calendar;

	 /* <p>
	 * This class is the datatype representation for Date. These Date will have date component All variables in OBP which
	 * will map to Date column in database should use this datatype.
	 * <p>
	 * Date is thread-safe and immutable.Internally it implements the joda LocalDate class. A date needs to be constructed
	 * always using the constructor and then every field modification will result in new object
	 * <p>
	 */
	@XmlRootElement
	@XmlType(namespace = "http://datatype.fc.ofss.com")
	public class Date implements Serializable, Comparable<Date> {

	    private static final String CANNOT_CHANGE_THE_DEFAULT_DATE = "Cannot Change the Default Date.";

	    /**
	     * generated serial id
	     */
	    private static final long serialVersionUID = -7160179932778396866L;

	    /**
	     * This attribute holds adapter of date implementation
	     */
	    protected IDateAdapter dateAdapter;

	    /**
	     * This attribute holds the Factory to generate the Adapters of DateImplementation
	     */
	    protected transient DateAdapterFactory dFactory = DateAdapterFactory.getInstance();

	    /**
	     * This constant indicates some future date. It is used in the cases where end date is unknown. So some maximum
	     * future date is being used here
	     */
	    public static final Date NO_EFFECTIVE_DATE = new Date(2099);

	    /**
	     * This constant indicates the default date.
	     */
	    public static final Date BLANK_DATE = new Date(1800);

	    /**
	     * This constant indicates the default date.
	     */
	    public static final Date DEFAULT_DATE = new Date(1800);

	    /**
	     * This constant indicates the null date.
	     */
	    public static final Date NULL_DATE = new Date(1950);

	    private boolean isLazyLoaded = false;

	    private int defaultYear = 0;

	    private long localTime = 0;

	    private Date(int year) {
	        this.defaultYear = year;
	        this.isLazyLoaded = true;
	    }

	    public Date(IDateAdapter idateAdapter) {
	        dateAdapter = idateAdapter;
	    }

	    /**
	     * Constructs a Date object from a String in a valid date format
	     *
	     * @param time
	     *            String
	     */
	    public Date(String time) {
	        dateAdapter = dFactory.loadDateAdapter(time);
	    }

	    /**
	     * Constructs a Date object from a String in a valid date format and pattern
	     *
	     * @param time
	     *            String
	     */
	    public Date(String time, String pattern) {
	        dateAdapter = dFactory.loadDateAdapter(time, pattern);
	    }

	    /**
	     * Constructs a Date object from a String in a valid date format
	     *
	     * @param day
	     *            int
	     * @param month
	     *            int
	     * @param year
	     *            int
	     */
	    public Date(int day, int month, int year) {
	        dateAdapter = dFactory.loadDateAdapter(day, month, year);
	    }

	    /**
	     * @param day
	     * @param month
	     * @param year
	     * @param hour
	     * @param minutes
	     * @param seconds
	     * @deprecated use {@link DateTime}
	     */
	    @Deprecated
	    public Date(int day, int month, int year, int hour, int minutes, int seconds) {
	        dateAdapter = dFactory.loadDateAdapter(day, month, year, hour, minutes, seconds);
	    }

	    /**
	     * @param day
	     * @param month
	     * @param year
	     * @param hour
	     * @param minutes
	     * @param seconds
	     * @param timezone
	     */
	    public Date(int day, int month, int year, int hour, int minutes, int seconds, String timezone) {
	        dateAdapter = dFactory.loadDateAdapter(day, month, year, hour, minutes, seconds, timezone);
	    }

	    /**
	     * Constructs a Date object with current local time
	     */
	    public Date() {
	        localTime = System.currentTimeMillis();
	        isLazyLoaded = true;
	    }

	    /**
	     * Construct a date object from a java.util.Date object
	     */
	    public Date(java.util.Date date) {
	        dateAdapter = dFactory.loadDateAdapter(date);
	    }

	    /**
	     * Constructor which takes Calendar instance.
	     */
	    public Date(Calendar calendar) {
	        dateAdapter = dFactory.loadDateAdapter(calendar);
	    }

	    /**
	     * Constructs a Date object from a String in a valid date format. This constructor has been added for backward
	     * compatibility.
	     */
	    public Date(String time, boolean isTimestamp) {
	        this(time);
	    }

	    /**
	     * @param time
	     *            Time in milliseconds
	     */
	    public Date(long time) {
	        dateAdapter = dFactory.loadDateAdapter(time);
	    }

	    /**
	     * @param time
	     * @param timeZone
	     */
	    public Date(long time, String timeZone) {
	        dateAdapter = dFactory.loadDateAdapter(time, timeZone);
	    }

	    /**
	     * @param time
	     * @param timeZone
	     */
	    public Date(Date date, String timeZone) {
	        dateAdapter = dFactory.loadDateAdapter(date, timeZone);
	    }

	    /**
	     * Moves the current date forward by given number of days and returns and gives new date object The date object
	     * invoking this method is unchanged
	     *
	     * @param days
	     *            int
	     * @return Date
	     */
	    public Date plusDays(int days) {
	        Date date = this.deepCopy();
	        date.fetchAdapter().plusDays(days);
	        return date;
	    }

	    /**
	     * Moves the current date backward by given number of days and returns and gives new date object The date object
	     * invoking this method is unchanged
	     *
	     * @param days
	     *            int
	     * @return Date
	     */
	    public Date minusDays(int days) {
	        Date date = this.deepCopy();
	        date.fetchAdapter().minusDays(days);
	        return date;
	    }

	    /**
	     * gets the implementation adapter
	     *
	     * @return
	     */
	    public IDateAdapter fetchAdapter() {
	        if (isLazyLoaded) {
	            if (dFactory == null) {
	                dFactory = DateAdapterFactory.getInstance();
	            }
	            if (defaultYear != 0) {
	                dateAdapter = dFactory.loadDateAdapter(01, 01, defaultYear);
	            } else {
	                dateAdapter = dFactory.loadDateAdapter(localTime);
	            }
	            isLazyLoaded = false;
	        }
	        return dateAdapter;
	    }

	    /**
	     * gets the implementation adapter
	     *
	     * @return
	     */
	    public IDateAdapter fetchAdapter(String dateTimeText) {
	        if (StringHelper.isNotNull(dateTimeText)) {
	            if (isLazyLoaded) {
	                if (dFactory == null) {
	                    dFactory = DateAdapterFactory.getInstance();
	                }
	                dateAdapter = dFactory.loadDateAdapter(dateTimeText);
	            }
	            isLazyLoaded = false;
	        } else {
	            fetchAdapter();
	        }
	        return dateAdapter;
	    }

	    /**
	     * gets the month and day part of the date for e.g., for a date 2008-07-13 it will return 713
	     *
	     * @return int
	     */
	    @XmlTransient
	    public int getMonthDate() {
	        return fetchAdapter().getMonthDate();
	    }

	    /**
	     * gets the month part of the date for e.g., for a date 2008-07-13 it will return 7
	     *
	     * @return int
	     */
	    @XmlTransient
	    public int getMonth() {
	        return fetchAdapter().getMonth();
	    }

	    /**
	     * gets the day part of the date for e.g., for a date 2008-07-13:05:50:32 it will return 13
	     *
	     * @return int
	     */
	    @XmlTransient
	    public int getDayOfMonth() {
	        return fetchAdapter().getDayOfMonth();
	    }

	    /**
	     * gets the day part of the week The return values are DateTimeConstants.MONDAY , DateTimeConstants.TUESDAY etc
	     *
	     * @return int
	     */
	    @XmlTransient
	    public int getDayOfWeek() {
	        return fetchAdapter().getDayOfWeek();
	    }

	    /**
	     * returns day of week as per java.util.Calendar constants
	     *
	     * @return
	     */
	    @XmlTransient
	    public DayOfWeekType getCalendarDayOfWeek() {
	        int jodaDayofWeek = getDayOfWeek();
	        DayOfWeekType dayOfWeekType = null;
	        switch(jodaDayofWeek) {
	            case DateTimeConstants.MONDAY:
	                dayOfWeekType = DayOfWeekType.MONDAY;
	                break;
	            case DateTimeConstants.TUESDAY:
	                dayOfWeekType = DayOfWeekType.TUESDAY;
	                break;
	            case DateTimeConstants.WEDNESDAY:
	                dayOfWeekType = DayOfWeekType.WEDNESDAY;
	                break;
	            case DateTimeConstants.THURSDAY:
	                dayOfWeekType = DayOfWeekType.THURSDAY;
	                break;
	            case DateTimeConstants.FRIDAY:
	                dayOfWeekType = DayOfWeekType.FRIDAY;
	                break;
	            case DateTimeConstants.SATURDAY:
	                dayOfWeekType = DayOfWeekType.SATURDAY;
	                break;
	            case DateTimeConstants.SUNDAY:
	                dayOfWeekType = DayOfWeekType.SUNDAY;
	                break;
	            default:
	        }
	        return dayOfWeekType;
	    }

	    /**
	     * gets the day part of the date for e.g., for a date 2008-07-13:05:50:32 it will return 13
	     *
	     * @return int
	     */
	    @XmlTransient
	    public int getDayOfYear() {
	        return fetchAdapter().getDayOfYear();
	    }

	    /**
	     * gets the month, day and time part of the date for e.g., for a date 2008-07-13:05:50:32 it will return 713055032
	     *
	     * @return long
	     * @deprecated use {@link DateTime}
	     */
	    @Deprecated
	    @XmlTransient
	    public long getMonthDateTime() {
	        return fetchAdapter().getMonthDateTime();
	    }

	    /**
	     * gets the year,month and day part of the date for e.g., for a date 2008-07-13:05:50:32 it will return 20080713
	     *
	     * @return long
	     */
	    @XmlTransient
	    public long getYearMonthDate() {
	        return fetchAdapter().getYearMonthDate();
	    }

	    /**
	     * gets the year and month part of the date for e.g., for a date 2008-07-13:05:50:32 it will return 200807
	     *
	     * @return long
	     */
	    @XmlTransient
	    public long getYearMonth() {
	        return fetchAdapter().getYearMonth();
	    }

	    /**
	     * gets the time part of the date for e.g., for a date 2008-07-13:05:50:32 it will return 55032
	     *
	     * @return long
	     * @deprecated use {@link DateTime}.
	     */
	    @Deprecated
	    @XmlTransient
	    public long getTime() {
	        return fetchAdapter().getTime();
	    }

	    /**
	     * gets the year part of the date for e.g., for a date 2008-07-13:05:50:32 it will return 2008
	     *
	     * @return long
	     */
	    @XmlTransient
	    public int getYear() {
	        return fetchAdapter().getYear();
	    }

	    /**
	     * @return hour of day
	     */
	    @XmlTransient
	    public int getHourOfDay() {
	        return this.dateAdapter.getHourOfDay();
	    }

	    /**
	     * @return minute of hour
	     */
	    @XmlTransient
	    public int getMinuteOfHour() {
	        return this.dateAdapter.getMinuteOfHour();
	    }

	    /**
	     * @return second of minute
	     */
	    @XmlTransient
	    public int getSecondOfMinute() {
	        return this.dateAdapter.getSecondOfMinute();
	    }

	    /**
	     * gets the week of the year
	     *
	     * @return long
	     */
	    @XmlTransient
	    public int getWeekOfYear() {
	        return fetchAdapter().getWeekOfYear();
	    }

	    @XmlTransient()
	    public String getTimeZone() {
	        return fetchAdapter().getTimeZone();
	    }

	    public Object fetchAdapterDate() {
	        return fetchAdapter().fetchAdapterDate();
	    }

	    /**
	     * returns true if this date is before the given date, else false
	     *
	     * @param date
	     *            Date
	     * @return boolean
	     */
	    public boolean isBefore(Date date) {
	        return fetchAdapter().isBefore(date);
	    }

	    /**
	     * returns true if this date is before or equals the given date, else false
	     *
	     * @param date
	     *            Date
	     * @return boolean
	     */
	    public boolean isBeforeOrEqual(Date date) {
	        return (fetchAdapter().isBefore(date) || (fetchAdapter().compareTo(date) == 0));
	    }

	    /**
	     * returns true if this date is after the given date, else false
	     *
	     * @param date
	     *            Date
	     * @return boolean
	     */
	    public boolean isAfter(Date date) {
	        return fetchAdapter().isAfter(date);
	    }   

	    /**
	     * returns true if this date is after or equals the given date, else false
	     *
	     * @param date
	     *            Date
	     * @return boolean
	     */
	    public boolean isAfterOrEqual(Date date) {
	        return isAfterOrEqualExt(date);
	    }

	    /**
	     * returns true if this date is after or equals the given date, else false
	     *
	     * @param date
	     *            Date
	     * @return boolean
	     */
	    public boolean isAfterOrEqualExt(Date date) {
	        return (fetchAdapter().isAfter(date) || (fetchAdapter().compareTo(date) == 0));
	    }

	    /**
	     * returns true if the 2 dates are equal
	     *
	     * @param arg
	     *            Date
	     * @return boolean
	     */
	    public boolean  equals(Date arg) {
	        if (arg != null && this.compareTo(arg) == 0) {
	            // NOPMD by nitinmor on 7/16/08 10:43 AM
	            return true;
	        } else {
	            return false;
	        }
	    }

	    /**
	     * returns true if the 2 dates are equal
	     *
	     * @param arg
	     *            Object
	     * @return boolean
	     */
	    @Override
	    public boolean equals(Object arg) {
	        return (arg != null && this.compareTo((Date) arg) == 0);
	    }

	    /**
	     * returns unique hashcode
	     *
	     * @return int
	     */
	    @Override
	    public int hashCode() {
	        int hash = 0;
	        hash += Float.floatToIntBits(fetchAdapterDate().hashCode());
	        return hash == 0 ? System.identityHashCode(this) : hash;
	    }

	    /**
	     * Compares 2 dates. Returns -1 if given date is after this date. Returns 1 if given date is before this date.
	     * Returns 0 if given date is equal to this date
	     *
	     * @param date
	     *            Date
	     * @return int
	     */
	    public int compareTo(Date date) {
	        return fetchAdapter().compareTo(date);
	    }

	    /**
	     * converts to string with the format given in root.properties file
	     *
	     * @return String
	     */
	    @Override
	    public String toString() {
	        return fetchAdapter().toString();
	    }

	    /**
	     * converts to string with the given string format.
	     *
	     * @return String
	     */
	    public String toString(String pattern) {
	        return fetchAdapter().toString(pattern);
	    }

	    /**
	     * Returns the time in milliseconds from the epoch.
	     *
	     * @return long
	     */
	    @XmlTransient
	    public long getMillis() {
	        return fetchAdapter().getMillis();
	    }

	    /**
	     * Copies the given date to this date.
	     *
	     * @param date
	     *            Date
	     */
	    public void copy(Date date) {
	        this.fetchAdapter().copy(date);
	    }

	    public Date deepCopy() {
	        Date dt = new Date();
	        dt.copy(this);
	        return dt;
	    }

	    /**
	     * Sets the month
	     *
	     * @param month
	     *            int
	     */
	    public void withMonth(int month) {
	        if (this.equals(DEFAULT_DATE) || this.equals(BLANK_DATE)) {
	            throw new InfraException(CANNOT_CHANGE_THE_DEFAULT_DATE + this);
	        }
	        this.fetchAdapter().setMonth(month);
	    }

	    /**
	     * Sets the year of this date e.g. if 2007 is passes then year=2007
	     *
	     * @param year
	     *            int
	     */
	    public void withYear(int year) {
	        if (this.equals(DEFAULT_DATE) || this.equals(BLANK_DATE)) {
	            throw new InfraException(CANNOT_CHANGE_THE_DEFAULT_DATE + this);
	        }
	        this.fetchAdapter().setYear(year);
	    }

	    /**
	     * Returns the java calendar timestamp.
	     *
	     * @return the timestamp
	     * @deprecated
	     */
	    @Deprecated
	    @XmlTransient
	    public Calendar getTimestamp() {
	        return fetchAdapter().fetchJavaCalendar();
	    }

	    /**
	     * Indicates the date as SQL Date
	     */
	    @XmlTransient
	    public java.sql.Date getSqlDate() {
	        return new java.sql.Date(getMillis());
	    }

	    /**
	     * This method is retained from old Date for backward compatibility
	     *
	     * @param auditBuffer
	     * @param enumerateAll
	     */
	    public void toAuditXml(StringBuilder auditBuffer, boolean enumerateAll) {
	        /* Begin Template Expansion{C4B40112-A728-44CD-8C0C-F9492AA6513A} */
	        if (enumerateAll) {
	            auditBuffer.append("<month-date>").append(getMonthDate()).append("</month-date>");
	        }
	        if (enumerateAll) {
	            auditBuffer.append("<month-date-time>").append(getMonthDateTime()).append("</month-date-time>");
	        }
	        if (enumerateAll) {
	            auditBuffer.append("<year>").append(getYear()).append("</year>");
	        }
	        if (enumerateAll && getTimestamp() != null) {
	            auditBuffer.append("<timestamp>").append(getTimestamp()).append("</timestamp>");
	        }
	    }

	    /**
	     * Returns the java calendar for this date.
	     *
	     * @return Calendar
	     * @deprecated
	     */
	    @Deprecated
	    public Calendar fetchJavaCalendar() {
	        /* End Template Expansion{C4B40112-A728-44CD-8C0C-F9492AA6513A} */
	        return fetchAdapter().fetchJavaCalendar();
	    }

	    /**
	     * Returns the java date initialized to the timestamp of this date.
	     *
	     * @return java.util.Date
	     * @deprecated
	     */
	    @Deprecated
	    public java.util.Date fetchJavaDate() {
	        return fetchAdapter().fetchJavaDate();
	    }

	    /**
	     * Moves the current date forward by given number of months and returns and gives new date object The date object
	     * invoking this method is unchanged
	     *
	     * @param days
	     *            int
	     * @return Date
	     */
	    public Date plusMonths(int months) {
	        Date date = this.deepCopy();
	        date.fetchAdapter().plusMonths(months);
	        return date;
	    }

	    /**
	     * Moves the current date forward by given number of years and returns and gives new date object The date object
	     * invoking this method is unchanged
	     *
	     * @param days
	     *            int
	     * @return Date
	     */
	    public Date plusYears(int years) {
	        Date date = this.deepCopy();
	        date.fetchAdapter().plusYears(years);
	        return date;
	    }

	    /**
	     * Moves the current date backward by given number of month and returns and gives new date object The date object
	     * invoking this method is unchanged
	     *
	     * @param days
	     *            int
	     * @return Date
	     */
	    public Date minusYears(int years) {
	        Date date = this.deepCopy();
	        date.fetchAdapter().minusYears(years);
	        return date;
	    }

	    /**
	     * Moves the current date backward by given number of month and returns and gives new date object The date object
	     * invoking this method is unchanged
	     *
	     * @param days
	     *            int
	     * @return Date
	     */
	    public Date minusMonths(int months) {
	        Date date = this.deepCopy();
	        date.fetchAdapter().minusMonths(months);
	        return date;
	    }

	    /**
	     * This will drop the time component from time stamp <br>
	     * i.e. 12-03-2006 11:34:56 AM will become 12-03-2006 00:00:00 AM
	     *
	     * @deprecated use {@link DateTime}
	     */
	    @Deprecated
	    public Date zeroiseTimeComponent() {
	        int year = getYear();
	        int month = getMonth();
	        int day = getDayOfMonth();
	        return new Date(day, month, year);
	    }

	    /**
	     * This will return the last dat of the month of the given date i.e For 12-03-2006 11:34:56 AM it will return 31 as
	     * march has 31 days
	     *
	     * @return int
	     */
	    @XmlTransient
	    public int getLastDayOfMonth() {
	        return fetchAdapter().getLastDayOfMonth();
	    }

	    /**
	     * Returns the {@code java.sql.Timestamp} representation of this {@code Date} object.
	     *
	     * @return java.sql.Timestamp
	     * @deprecated use {@link DateTime}
	     */
	    @Deprecated
	    @XmlTransient
	    public Timestamp getSQLTimestamp() {
	        return new Timestamp(getMillis());
	    }

	    /**
	     * This will return the last date of the month of the given date i.e For 12-03-2006 it will return 31-03-2006 as
	     * march has 31 days
	     *
	     * @return Date
	     */
	    public Date fetchLastDateOfMonth() {
	        return new Date(this.getLastDayOfMonth(), this.getMonth(), this.getYear());
	    }

	    /**
	     * this method return true, if the date is a part of leap year, else returns false.
	     *
	     * @return boolean
	     */
	    @XmlTransient
	    public boolean isLeapYear() {
	        int year = this.getYear();
	        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
	    }

	    /**
	     * Returns the date in appropriate printable understandable format. This can be used for display purposes in
	     * messages.
	     * <p>
	     * NOT TO BE USED AS A REPLACEMENT TO toString()
	     * </p>
	     *
	     * @return
	     */
	    public String toFormattedString() {
	        return fetchAdapter().toFormattedString();
	    }

	    /**
	     * Verifies if the date is conceptually representing a NULL.
	     *
	     * @return
	     */
	    @XmlTransient
	    public boolean isNull() {
	        if (NULL_DATE.equals(this) || BLANK_DATE.equals(this)) {
	            return true;
	        }
	        return false;
	    }

	    /**
	     * Verifies if the date is conceptually representing a INFINITE
	     *
	     * @return
	     */
	    @XmlTransient
	    public boolean isInfinite() {
	        if (NO_EFFECTIVE_DATE.equals(this)) {
	            return true;
	        }
	        return false;
	    }

	    /**
	     * Returns the Date string
	     *
	     * @return String
	     */
	    public String getDateString() {
	        return fetchAdapter().toString();
	    }

	    /**
	     * Sets the Date string
	     *
	     * @param String
	     *            dateString
	     */
	    public void setDateString(String dateString) {
	        fetchAdapter(dateString);
	    }

	    /**
	     * Returns formatted string as per Full, Long, Medium or Short Date Formats.<br>
	     * see{@link DateTimeConstants#FULL} <br>
	     * see {@link DateTimeConstants#LONG} <br>
	     * see{@link DateTimeConstants#MEDIUM}<br>
	     * see{@link DateTimeConstants#SHORT}
	     *
	     * @param format
	     * @return
	     */
	    public String format(int format) {
	        return fetchAdapter().format(format);
	    }
	}

	
}
