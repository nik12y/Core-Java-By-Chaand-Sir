package com.innerClass;

public class MainRunner {

	public static void main(String[] args) {
	Door door=new Door();
	System.out.println(door.isLocked("open"));
	if(door.isLocked(args[0])) {
		System.out.println("Shop has Closed , please visite later");
	}else {
		System.out.println("Shop is open");
	}
	System.out.println(door.isLocked(args[1]));
	System.out.println(door.isLocked(args[2]));
	}
	
}
