package com.forLoop;

public class SoficticatedForLoop {

	public static void main(String[] args) {
 
//		for(int i=1,j=1;i<10 && j<10;i++,j++) {
	/*	System.out.println("OR || operator");
		for(int i=1,j=1;i<10 || j<10;i++,j++) {
		//	i++;,j++;
			j++;
			System.out.println("i="+i +"And j="+j);
		}
		System.out.println("\n----------\n");
		System.out.println("AND && operator");
		for(int i=1,j=1;i<10 && j<10;i++,j++) {
			//	i++;,j++;
				j++;
				System.out.println("i="+i +"And j="+j);
			}
		int i=1, j=1;
		while(i<10 && j<10) {
			i++;
			j++;
			System.out.println("i="+i +"And j="+j);
		}*/
		int i=1, j=1;
		do {
			i++;
			j++;
			System.out.println("i="+i +"And j="+j);
		}	while(i<10 && j<10) ;
	}
}
