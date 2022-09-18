package com.map;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Code implements Comparable<Code> {

	private String searchNo;
	private String leactureNO;

	public String getSearchNo() {
		return searchNo;
	}

	public String getLeactureNO() {
		return leactureNO;
	}

	public Code(String searchNo, String leactureNO) {

		this.searchNo = searchNo;
		this.leactureNO = leactureNO;
	}

	@Override
	public int hashCode() {
		return Objects.hash(leactureNO, searchNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		return Objects.equals(leactureNO, other.leactureNO) && Objects.equals(searchNo, other.searchNo);
	}

	@Override
	public String toString() {
		return "Code [searchNo=" + searchNo + ", leactureNO=" + leactureNO + "]";
	}

	@Override
	public int compareTo(Code o) {
		String code1 = searchNo.concat(leactureNO);
		String code2 = o.getSearchNo() + o.getLeactureNO();
		return code1.compareTo(code2);
	}

}

public class TreeMapMethods {

	public static void main(String[] args) {
		Map<Code, String> student = new TreeMap<>();
		student.put(new Code("S01", "L03"), "PriyankaChopda");
		student.put(new Code("S01", "L05"), "Rahul");
		student.put(new Code("S05", "L02"), "Naina");
		student.put(new Code("S03", "L01"), "Ramesh");
		student.put(new Code("S04", "L02"), "Jamnik");
		student.put(new Code("S01", "L03"), "Jagdhane");
		// Now i want key from value
		Code code = null;
		for (Map.Entry<Code, String> entry : student.entrySet()) {
			// System.out.println(" Key :" + entry.getKey() + " Value :" +
			// entry.getValue());
			if (entry.getValue().equals("Rahul")) {
				code = entry.getKey();
			}
		}
		System.out.println("The key of Nihal is "+code);
		// we will get value by passing key
		System.out.println(student.get(new Code("S01", "L03")));
	}
}
