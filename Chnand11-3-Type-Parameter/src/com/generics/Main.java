package com.generics;
/* the naming convention of Type Parameter
 * T  = Type
 * E  = Element
 * K  = Key
 * V  = Value
 * N  = Number
 */

class Data<K, V> {

	private K key;
	private V value;

	public Data(K key, V value) {

		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	public <E , N> void values(E elements, N number) {
		System.out.println("Elements :"+elements+" Number :"+ number);
	}

}

public class Main {
	public static void main(String[] args) {

//		Data data =new Data(1,"Chaand");
//		System.out.println(data);  //--->o/p Data [key=1, value=Chaand]
		
		Data<Integer, String> data =new Data<Integer, String>(1,"Chaand");
		System.out.println("Key :"+data.getKey()+" Value :"+data.getValue());//--->o/p   Key :1 Value :Chaand

		data.values("Sonu", 25);
		
	}
}


























