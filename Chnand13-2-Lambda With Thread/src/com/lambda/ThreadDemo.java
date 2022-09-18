package com.lambda;

public class ThreadDemo {

	public static void main(String[] args) {

		Runnable t = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("The value of i is :" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t1 = new Thread(t);
		t1.setName("Mohan");
		t1.start();
	
	Runnable t2=()->{
		for(int i=1;i<=10;i++) {
			System.out.println("Table of 2 is "+i*2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			System.out.println(e);
				e.printStackTrace();
			}
		}
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};
	Thread t3=new Thread(t2);
	t3.start();
	}
}
