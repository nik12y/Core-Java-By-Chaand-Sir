package com.generics;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
	private int vehicleId;

	public int getVehicleId() {
		return vehicleId;
	}

	public Vehicle(int vehicleId) {
		super();
		this.vehicleId = vehicleId;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + "]";
	}
	
	void info() {
		System.out.println("Vehicle id is : "+getVehicleId());
	}

}
class Car extends Vehicle{
	private String carModel;

	public String getCarModel() {
		return carModel;
	}

	public Car(int vehicleId, String carModel) {
		super(vehicleId);
		this.carModel = carModel;
	}

	@Override
	public String toString() {
		return "Car [carModel=" + carModel + "]";
	}

	@Override
	void info() {
		System.out.println("Car Model is :"+getCarModel() );
	}

}

public class App {

	public static void main(String[] args) {

		List<Vehicle> list=new ArrayList<Vehicle>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(20));
		list.add(new Vehicle(30));
		list.add(new Vehicle(40));
		list.add(new Vehicle(50));
		list.add(new Car(50, "A505"));
		display(list);
		
	}
//	//this is the example of wildcards in generics(?)
//	public static void display(List<?> elements) {
//		for(Object data:elements) {
//			System.out.println(data);
//		}
//	}
//	//this is the example of upper Bond in generics(?)
//	public static void display(List<? extends Vehicle> elements) {
//		for(Vehicle data:elements) {
//			System.out.println(data);
//		}
//	}
//	//this is the example of Lower Bond in generics(?) in car we use Object class 
//		public static void display(List<? super Car> elements) {
//			for(Object data:elements) {
//				System.out.println(data);
//			}
//		}
	//this is the example of Lower Bond in generics(?) in car we use Object class 
			public static void display(List<? extends Vehicle> elements) {
				for(Vehicle data:elements) {
				data.info();
				}
			}
}



















