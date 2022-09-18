package com.threadExample;

class MyThread extends Thread {

	public void run() {
		// System.out.println("Hello this is my first Thread Practice");
		for (int i = 1; i <= 10; i++) {
       System.out.println(i);
		}
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		MyThread th = new MyThread();
		MyThread th1=new MyThread();
		th.start();
		th1.start();

	}

}
