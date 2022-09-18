package com.collectionFramework;

import java.util.ArrayList;

class intWrapper{
	public int intValue;

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public intWrapper(int intValue) {
		super();
		this.intValue = intValue;
	}
	
	
}
public class AutoBoxingAndUnboxing{

	public static void main(String[] args) {
		
		//Autoboxing
		ArrayList<Integer> intArray=new ArrayList<Integer>();
		intArray.add(250);
		System.out.println(intArray.get(0));//this is done by Autoboxing
		
		
		//Unboxing
		ArrayList<intWrapper> unboxing=new ArrayList<intWrapper>();
		unboxing.add(new intWrapper(15));//this is done by unboxing
		System.out.println(unboxing.get(0).intValue);
		
		
		ArrayList<Double> doubleArray=new ArrayList<Double>();
	//	doubleArray.add(20.65);         //this is done by autoboxing
	//	doubleArray.add(new Double(21.6d));
		doubleArray.add(Double.valueOf(45.687));
		System.out.println(doubleArray.get(0).doubleValue());    //this is done by unboxing
	}
}














