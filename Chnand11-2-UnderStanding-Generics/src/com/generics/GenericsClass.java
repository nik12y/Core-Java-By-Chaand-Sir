package com.generics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data<T> {
	private T myVariable;

	public Data(T data) {
		this.myVariable = data;
	}



	public T getMyVariable() {
		return myVariable;
	}



	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}
	
}

public class GenericsClass {

	public static void main(String[] args) {
   /*Object is the superMost class of all class 
		List<Data<Object>> elements=new LinkedList<>();
		elements.add(new Data<Object>("Some Impl text"));
		elements.add(new Data<Object>(10.65));
		elements.add(new Data<Object> ('*'));
		elements.add(new Data<Object>(1.065f));
		elements.add(new Data<Object>(5));
		
		GenericsClass gc=new GenericsClass();
		gc.printList(elements); 
	 */	
		
	/*//Now I want String value	
		List<Data<String>> elements=new LinkedList<>();
		elements.add(new Data<String>("Some Impl text"));
		elements.add(new Data<String>("I am Learning Generics "));
		elements.add(new Data<String> ("By chaand Sir"));
		elements.add(new Data<String>("Hi chaad sir its amazing Session"));
		elements.add(new Data<String>("Your teaching strategy is awesome"));
		
		GenericsClass gc=new GenericsClass();
		gc.printList(elements); 
	*/
		List<Data<Integer>> elements=new LinkedList<>();
		elements.add(new Data<Integer>(1));
		elements.add(new Data<Integer>(2));
		elements.add(new Data<Integer>(3));
		elements.add(new Data<Integer>(4));
		elements.add(new Data<Integer>(5));
		
		GenericsClass gc=new GenericsClass();
		gc.printList(elements); 
	
	}
	
	
/*	void printList(List<Data<Object>> list) {
		Iterator<Data<Object>> iterator=list.listIterator();
		while(iterator.hasNext()) {
		//	System.out.println(iterator.next());//by doing iterator.next() ---->O/p  Data [myVariable=Some Impl text]
		                                                                      //  |  Data [myVariable=10.65]
			                                                                  //   	 Data [myVariable=*]
																			  //     Data [myVariable=1.065]
																		      // 	 Data [myVariable=5]

		System.out.println("Elements :" + iterator.next().getMyVariable()); // ---> Elements :Some Impl text
																			// Elements :10.65
																			// Elements :*
																			// Elements :1.065
		}																	//Elements :5      */
	
	/*void printList(List<Data<String>> list) {
		Iterator<Data<String>> iterator=list.listIterator();
		while(iterator.hasNext()) {
		//	System.out.println(iterator.next());//by doing iterator.next() ---->

		System.out.println("Elements :" + iterator.next().getMyVariable()); //Elements :Some Impl text
																			//		Elements :I am Learning Generics 
																			//		Elements :By chaand Sir
																			//		Elements :Hi chaad sir its amazing Session
																			//		Elements :Your teaching strategy is awesome

		}*/
	void printList(List<Data<Integer>> list) {
		Iterator<Data<Integer>> iterator=list.listIterator();
		while(iterator.hasNext()) {
		//	System.out.println(iterator.next());//by doing iterator.next() ---->O/p  Data [myVariable=Some Impl text]
		                                                                      //  |  Data [myVariable=10.65]
			                                                                  //   	 Data [myVariable=*]
																			  //     Data [myVariable=1.065]
																		      // 	 Data [myVariable=5]

		System.out.println("Elements :" + iterator.next().getMyVariable()*10);  // Elements :10
																				//		Elements :20
																				//		Elements :30
																				//		Elements :40
																				//		Elements :50

		}
	}
																		  		
} 																		  	














