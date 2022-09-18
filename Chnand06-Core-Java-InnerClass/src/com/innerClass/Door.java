package com.innerClass;

public class Door {

	private Lock lock;//it is object of lock
	
	public Door() {
		lock=new Lock(true);
	}
	
	//to change the value of lock i.e false then use getMethod of lock
	public Lock getLock() {
		return lock;
	}

	
	
	public void shopLock() {

		if(lock.isLock()) {
			System.out.println("Shop is Lock, Please Come Later");
		}else {
			System.out.println("Welcome to shop");
		}
	}
	

	//inner Class of lock
	class Lock{
		private boolean lock;//it is local VAriable of lock

		public Lock(boolean lock) {
			this.lock = lock;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}
		
		
	}

}
