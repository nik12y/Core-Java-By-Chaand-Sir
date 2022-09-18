package com.comparator;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsTypes {

	public static void main(String[] args) {
	//	Set<Integer> set=new HashSet<>();//1 2 3 4 5 6 7 8 9 ...30 in sequence
	//	Set<Integer> set=new LinkedHashSet<>();//30 29 28 27 26 25 24 ...till 1 in reverse order
	//	Set<Integer> set=new TreeSet<>();//1 2 3 4 5 6 7 8 9 ...30 in sequence by natural order
	//	Set<String> set=new TreeSet<>();//A1=A10...A19 and A2=A20...A29 and A3=A30...A1
	//	Set<String> set=new HashSet<>();//A21 A22 A23 A24 A25 A26 A27 A28 A29 A1A 2A3A4A5A6A7A8A9A30A10A11A12A13A14A15A16A17A18A19A20
		Set<String> set=new LinkedHashSet<>();//A30A29A28A27A26A25A24A23A22A21A20A19A18A17A16A15A14A13A12A11A10A9A8A7A6A5A4A3A2A1
		for(int i=30;i>0;i--) {
		  set.add("A"+i);
		}
		
		for(String i:set) {
			System.out.print(i);
		}
	}
}
