package com.inheritance;

public class MainRunner {

	public static void main(String[] args) {
		Bike bike=new Bike("short",4,25,5,"Diesel","LED");
		System.out.println(bike.getEngine());//to print it in proper way we use toString() method
		System.out.println("Bike Handle:"+bike.getHandle());
		System.out.println("No of Wheels :"+bike.getWheels());
		System.out.println("Fule Remaining in Tank :"+bike.getFuleTank());
		System.out.println("No. of Seats :"+bike.getSeat());
		
		System.out.println("Type of Engine :"+bike.getEngine());
		System.out.println("Types Of Lights :" +bike.getLights());
		
		Car car=new Car();
		System.out.println(car.getFuleTank());
		System.out.println(car.getEngine());
		System.out.println(car.getSeat());
		
		Truck truck=new Truck();
		System.out.println(truck.getContiner());
		System.out.println(truck.getFuleTank());
		
	}

}
