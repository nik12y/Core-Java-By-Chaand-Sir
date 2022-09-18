package com.innerClass;

public class MainRunner {

	public static void main(String[] args) {
		Door door=new Door();
	   door.shopLock();
	   
	   door.getLock().setLock(false);
	   door.shopLock();
	}
}
