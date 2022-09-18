package com.queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
// Queue is FIFO(First In First Out)condition
// Stack is LIFO(Last In First Out) condition
// queue.poll()  == queue.remove();
// queue.offer(1)== queue.add(1);
// queue.peek()  == queue.element();
public class QueueMethods {

	public static void main(String[] args) {

		Queue<Integer> queue = new ArrayBlockingQueue<Integer>(6);
	//	Queue<Integer> queue = new LinkedBlockingQueue<Integer>();
//		System.out.println(queue.isEmpty());----> o/p true
		try {
			queue.element();
		} catch (NoSuchElementException e1) {
			System.out.println("NoSuchElementException is found"+e1);
		}

		try {
			System.out.println(queue.remove());
		} catch (NoSuchElementException e1) {
			System.out.println("NoSuchElementException is found while removing");
		}
//		System.out.println(queue.poll());
//		System.out.println(queue.peek());
		try {
			queue.offer(1); // queue.add(1);
			queue.offer(2); // queue.add(2);
			queue.offer(3); // queue.add(3);
			queue.offer(4); // queue.add(4);
			queue.offer(5); // queue.add(5);
			queue.offer(6); // queue.add(6);
			queue.offer(7); // queue.add(7);
		} catch (IllegalStateException e) {
			System.out.println("Queue is Full because our limit is 6 and we using 7");
		}

		for (Integer num : queue) {
			System.out.println(num);
		}
		System.out.println("Retrieve the top element from the queue :"+queue.peek());
		System.out.println("\nRemoving elemen in the queue***************");
		System.out.println(queue.poll());
		
		System.out.println("The queue is empty :" +queue.isEmpty());
		System.out.println("\nTop elemen in the queue***************");
		// queue.element() it show first element in the row
		System.out.println("The top element in the queue :" + queue.element());

		System.out.println("\nRemoving elemen in the queue***************");
		System.out.println(queue.remove());

		System.out.println("\nAfter Removing element from the queue***************");
		for (Integer num : queue) {
			System.out.println(num);
		}

		System.out.println("The top element in the queue :" + queue.element());
	}
}
