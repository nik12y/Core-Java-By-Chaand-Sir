package com.innerClass;

public class Door {

	public boolean isLocked(String key) {
		//nested class
		class Lock{
			public boolean isLocked(String key) {
				if(key.equals("closed")) {
					return true;
				}else {
					return false;
				}
			}
		}
		return new Lock().isLocked(key);
	}

}
