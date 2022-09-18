package com.map;

import java.io.Serial;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
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
	public String toString() {
		return "Code [searchNo=" + searchNo + ", leactureNO=" + leactureNO + "]";
	}

	@Override
	public int compareTo(Code o) {
		String code1= searchNo.concat(leactureNO);
		String code2= o.getSearchNo()+o.getLeactureNO();
		return code1.compareTo(code2);
	}

}

public class TreeMapMethods {

	public static void main(String[] args) {
		Map<Code, String> student = new TreeMap<>();
		student.put(new Code("S01","L03"), "PriyankaChopda");
		student.put(new Code("S01","L05"), "Rahul");
		student.put(new Code("S05","L02"), "Naina");
		student.put(new Code("S03","L01"), "Ramesh");
		student.put(new Code("S04","L02"), "Jamnik");
		student.put(new Code("S01","L03"), "Jagdhane");

		for (Map.Entry<Code, String> entry : student.entrySet()) {
			System.out.println(" Key :" + entry.getKey() + " Value :" + entry.getValue());
		}

	}
}











