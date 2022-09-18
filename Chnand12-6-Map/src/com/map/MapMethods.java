package com.map;

import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.LinkedBlockingDeque;

// Queue is FIFO(First In First Out)condition
// Stack is LIFO(Last In First Out) condition
// queue.poll()  == queue.remove();
// queue.offer(1)== queue.add(1);
// queue.peek()  == queue.element();
public class MapMethods {

	public static void main(String[] args) {
// if we use duplicate key it will delete one of the same key from inputs
		Map<Integer, String> student = new HashMap<>();
		student.put(3, "PriyankaChopda");
		student.put(6, "Rahul");
		student.put(1, "Naina");
		student.put(2, "Ramesh");
		student.put(4, "Jamnik");
		student.put(2, "Jagdhane");

	/*	for (Map.Entry<Integer, String> entry : student.entrySet()) {
//			System.out.println(entry); //1=Naina2=Ramesh3=PriyankaChopda4=Jamnik5=Jagdhane6=Rahul
			System.out.print("Key :" + entry.getKey() + " Value :" + entry.getValue()); // Key :1 Value :Naina
			                                                                            // Key :2 Value :Ramesh
																					    // Key :3 Value :PriyankaChopda
																						// Key :4 Value :Jamnik
																						// Key :5 Value:Jagdhane
																						// Key :6 Value :Rahul
		}*/
		
		/*	for(Integer key:student.keySet()) {
			System.out.println("Key :" + key+ " Value :" + student.get(key));   //Key :1 Value :Naina
																				//Key :2 Value :Ramesh
																				//Key :3 Value :PriyankaChopda
																				//Key :4 Value :Jamnik
																				//Key :5 Value :Jagdhane
																				//Key :6 Value :Rahul
		}*/
		
		Iterator<Entry<Integer , String>> entry=student.entrySet().iterator();
		while(entry.hasNext()) {
			Entry<Integer, String> temp=entry.next();
			//This will select only some input from map to resolve this error use Entry<K,V> 
		//System.out.println(" Key :"+entry.next().getKey()+" Value :" +entry.next().getValue());// Key :1   Value :Ramesh
																								   // Key :3   Value :Jamnik
																								   // Key :5   Value :Rahul
			System.out.println(" Key :"+temp.getKey()+" Value :" +temp.getValue()); // Key :1 Value :Naina
																					//			 Key :2 Value :Jagdhane
																					//			 Key :3 Value :PriyankaChopda
																					//			 Key :4 Value :Jamnik
																					//			 Key :6 Value :Rahul

		}
		
	}
}











