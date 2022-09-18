package com.collectionFramework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CompareToMethods {

	public static void main(String[] args) {
 
		//If Part1==Part2-----> 0
		//if Part1>Part2 ----->  1
		//if Part1<Part2 -----> -1
		
		
		String x="a";//Part1
		String y="b";//Part2
		System.out.println(x.compareTo(y));
		
		String m="b";//Part1
		String n="b";//Part2
		System.out.println(m.compareTo(n));
		
		String p="c";//Part1
		String q="b";//Part2
		System.out.println(p.compareTo(q));
		
		
		//Now i want int data type then 
		Integer z=4;
		Integer k=5;
		System.out.println(z.compareTo(k));
	}
}
