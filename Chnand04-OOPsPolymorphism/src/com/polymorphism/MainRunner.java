package com.polymorphism;

import com.polymorphism.phones.Nokia;
import com.polymorphism.phones.Phone;
import com.polymorphism.phones.SamsungNote8;

public class MainRunner {

	public static void main(String[] args) {
		
		Phone phone=new Phone("Nokia 2695");
		System.out.println(phone.getModel());
		phone.features();
		
		SamsungNote8 note8= new SamsungNote8("Note 8");
		System.out.println(note8.getModel());
		note8.features();
		
		Phone methodToCall=new MainRunner().phone(1);
		System.out.println(methodToCall.getModel());
		methodToCall.features();
		
		Phone noteSeries=new SamsungNote8("M30s");
		System.out.println(noteSeries.getModel());
		noteSeries.features();
	}
	
	public Phone phone(int dailyDrive) {
		switch(dailyDrive) {
		case 1: return new Nokia("Nokia 3310");
		case 2: return new SamsungNote8("Samsung");
		}
		return null;
	}
}
