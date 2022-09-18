package com.lambdaWithStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ThreadDemo {

	public static void main(String[] args) {

		String names[]= {"Nik","Mohan","Rohan"};
		
		//Stream<String> streamObject=Stream.of(names);
//		Stream.of(names).forEach(e->System.out.println(e));
		Stream.of("Nik","Mohan","Rohan").forEach(e->System.out.println(e));
		
		IntStream stream = Arrays.stream(new int [] {2,5,6,78,9,4,5});
		stream.forEach(e->System.out.print(e));
		
		
	List<Integer> list2=new ArrayList<Integer>();
	list2.add(55);
	list2.add(548);
	list2.add(41);
	list2.add(65);
	list2.add(69);
	
	Stream<Integer> stream2 = list2.stream();
	stream2.forEach(e->{System.out.println(e);});
	
	
	List<String> names1= List.of("Nik","Mohan","Rohan","Nihal","Nilesh","Nilam");
	//using filter
	List<String> collect = names1.stream().filter(e->e.startsWith("N")).collect(Collectors.toList());
		
	System.out.println(collect);
		
	
	//using map
	List<Integer> num=List.of(2,6,4,5,8,7,1,3,22,56);
	List<Integer>number=num.stream().map(e->e*e).collect(Collectors.toList());
	System.out.println(number);
	
	System.out.println("Sorted");
	num.stream().sorted().forEach(e->System.out.println(e));
	System.out.println("\n");
	
	System.out.println("Sorted with square");
	num.stream().sorted().forEach(e->System.out.println(e*e));
	
	System.out.println("Sorted without e");
	num.stream().sorted().forEach(System.out::println);
	}
}















