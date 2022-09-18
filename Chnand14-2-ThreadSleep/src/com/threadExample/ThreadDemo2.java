package com.threadExample;

class MyThread extends Thread {

	public void run() {
		// System.out.println("Hello this is my first Thread Practice");
		Thread th1 = Thread.currentThread();
		String name = th1.getName();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " " + name);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}

	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		MyThread th = new MyThread();
		// MyThread th1=new MyThread();
		th.start();

		Thread th1 = Thread.currentThread();
		String name = th1.getName();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " " + name);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}
		

	}

}
