package com.core.java.main;

import com.core.java.inteface.Apple;
import com.core.java.inteface.OnePlus5;
import com.core.java.inteface.Phone;

public class MainInterfaceRunner {

	public static void main(String[] args) {
		Phone phone=new OnePlus5();
		System.out.println(phone.processor());
		
		System.out.println(phone.spaceInGB());
		Phone apple=new Apple();
		System.out.println("\n");
		System.out.println(apple.processor());
		
	}
}
