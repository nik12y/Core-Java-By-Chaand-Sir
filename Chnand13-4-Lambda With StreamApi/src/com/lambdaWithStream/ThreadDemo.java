package com.lambdaWithStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThreadDemo {

	public static void main(String[] args) {

		// without Stream Api
		System.out.println("WithOut Using Stream and Lambda Expression ");
		List<Integer> list1 = List.of(22, 2, 55, 45, 86, 99, 47, 11, 33, 66);

		List<Integer> listEven = new ArrayList<Integer>();

		for (Integer i : list1) {
			// if (i % 2 == 1) { odd
			if (i % 2 == 0) { // even
				listEven.add(i);
			}
		}
		System.out.println(list1);
		System.out.println(listEven);

		// Using Stream
		// create Stream Object
		System.out.println("Using Stream and Lambda Expression ");
		Stream<Integer> stream = list1.stream();

		List<Integer> evenList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);
		
	//3rd way Only in one line
		List<Integer> collect = list1.stream().filter(i->i%2==0).collect(Collectors.toList());	
		System.out.println(collect);
		                                                //(22, 2, 55, 45, 86, 99, 47, 11, 33, 66);
		List<Integer> andOperator = list1.stream().filter(i->i>10 && i<55).collect(Collectors.toList());	
		System.out.println("By ANd Operator :"+andOperator);  //[22, 45, 47, 11, 33]
		
		List<Integer> orOperator = list1.stream().filter(i->i>10 || i<22).collect(Collectors.toList());	
		System.out.println("By or Operator ;"+orOperator);//[22, 2, 55, 45, 86, 99, 47, 11, 33, 66]
		
		
	}
}















