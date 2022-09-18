package com.generics;
class Generic<T>{
	private T data;
 
	public Generic(T data) {
		this.data = data;
	}
 
	@Override
	public String toString() {
		return "Generic [data=" + data + "]";
	}
 
	public T getData() {
		return data;
	}
	
	
}
 
public class TestGenercis {
 
	public static void main(String[] args) {
 
		Generic<Integer> gData = new Generic<Integer>(2);//correct use wrapper class
	//	Generic<int> gData = new Generic<int>(2);        // wrong 
		int data =gData.getData();
		System.out.println("Integer value is "+data);
		
	}
}
