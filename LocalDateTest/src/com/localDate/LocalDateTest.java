package com.localDate;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {

	public static void main(String[] args) {
		LocalDate lacalDate1 = LocalDate.now();
		System.out.println(lacalDate1);

		LocalDate lacalDate2 = LocalDate.of(2022, Month.APRIL, 12);
		System.out.println(lacalDate2);
		
		System.out.println(lacalDate1.isAfter(lacalDate2));
		System.out.println(lacalDate1.isBefore(lacalDate2));
		
		LocalDate localDate = lacalDate1.plus(2, ChronoUnit.DAYS);
		System.out.println(localDate);
		
		LocalDate localDate1 = lacalDate1.plus(1, ChronoUnit.DECADES);
		System.out.println(localDate1);
		
		LocalDate localDate2 = lacalDate1.plus(1, ChronoUnit.HOURS);
		System.out.println(localDate2);
		
	}
	public static void localDate() {
		LocalDate lacalDate1 = LocalDate.from(LocalDate.now());
		System.out.println(lacalDate1);
		
		LocalDate lacalDate2 = LocalDate.now();
		System.out.println(lacalDate2);
		                                  //Clock.fixed(Instant.ofEpochMilli(2), ZoneId.systemDefault())
		LocalDate lacalDate3 = LocalDate.now(Clock.system(ZoneId.of("Asia/Kolkata")));
		System.out.println(lacalDate3);
		
		LocalDate lacalDate4 = LocalDate.of(2022, Month.APRIL, 12);
		System.out.println(lacalDate4);
		
		LocalDate lacalDate5 = LocalDate.ofEpochDay(11);
		System.out.println(lacalDate5);
		
		LocalDate lacalDate6 = LocalDate.ofInstant(Instant.ofEpochMilli(0), ZoneId.systemDefault());
		System.out.println(lacalDate6);
		
		LocalDate lacalDate7 = LocalDate.ofYearDay(2022, 365-150);
		System.out.println(lacalDate7);
		
		LocalDate lacalDate8 = LocalDate.parse("2020-03-15");
		
		System.out.println(lacalDate8.getDayOfMonth());
		System.out.println(lacalDate8.getYear());
		System.out.println(lacalDate8.getDayOfYear());
		
		System.out.println(lacalDate2.isAfter(lacalDate4));
		System.out.println(lacalDate4.isAfter(lacalDate2));
		System.out.println("iS Before :"+lacalDate4.isBefore(lacalDate2));
		System.out.println(lacalDate2.isAfter(lacalDate3));
//		LocalDate lacalDate9 = LocalDateTime.ofInstant(Instant.ofEpochSecond(Long.valueOf(20220503)).format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
//		System.out.println(lacalDate9);
		
		
	}
}
















