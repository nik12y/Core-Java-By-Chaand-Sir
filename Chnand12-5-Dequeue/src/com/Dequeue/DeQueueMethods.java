package com.Dequeue;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

// Queue is FIFO(First In First Out)condition
// Stack is LIFO(Last In First Out) condition
// queue.poll()  == queue.remove();
// queue.offer(1)== queue.add(1);
// queue.peek()  == queue.element();
public class DeQueueMethods {

	public static void main(String[] args) {

		Deque<Integer> dequeue=new LinkedBlockingDeque<Integer>();
		dequeue.offer(1);
		dequeue.offer(2);
		dequeue.offer(3);
		dequeue.offer(4);
		dequeue.offer(5);
		dequeue.offer(6);
		dequeue.offer(7);
		
		for(Integer num:dequeue) {
			System.out.println(num);
		}
		System.out.println("after adding**********************");
		dequeue.addFirst(0);
		for(Integer num:dequeue) {
			System.out.println(num);
		}
		System.out.println("after adding in last**********************");
		dequeue.addLast(8);
		for(Integer num:dequeue) {
			System.out.println(num);
		}
		System.out.println("after after removing last**********************");
		dequeue.removeLast();
		for(Integer num:dequeue) {
			System.out.println(num);
		}
	}
}
