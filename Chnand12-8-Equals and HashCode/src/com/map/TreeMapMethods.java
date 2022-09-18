package com.map;

import java.io.Serial;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
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
		
		String name1= "Chad";
		String name2= "Chad";
		System.out.println(name1==name2); //  o/p is true
		//if
		String name3= new String("Chad");
		String name4= new String("Chad");
		System.out.println(name3==name4); // o/p false
		System.out.println("Name1 hashCode "+name1.hashCode() +"\"Name2 hashCode \""+name2.hashCode());
		System.out.println(name3.equals(name4)); // o/p true because it prefer same hashCode value
		
		//while Using Custom String
		Code code1= new Code("S01", "L03");
		Code code2= new Code("S01", "L03");
        System.out.println(code1==code2);// o/p false
        
        System.out.println("\n" +code1.equals(code2));// o/p false to resolve it we use hashCode and Equals methods in custom class
        System.out.println("\n" +code1.equals(code2));// o/p true because we use hashCode() and Equals()
 	}
}











