package com.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


class Data<K, V> {
	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}

	public V getValue() {
		return value;
	}

	public Data(K key, V value) {

		this.key = key;
		this.value = value;
	}

}

public class ComparatorSorting {

	public static void main(String[] args) {

		Comparator<Data<Integer, String>> COMPARE_KEY = new Comparator<Data<Integer, String>>() {

			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if (obj1.getKey() < obj2.getKey()) {
					return -1;
				} else if (obj1.getKey() > obj2.getKey()) {
					return 1;
				} else
					return 0;
			}
		};
		// It is for Key sorting //it is optional <Data<Integer, String>>
		Set<Data<Integer, String>> setKey = new TreeSet<>(COMPARE_KEY);
		setKey.add(new Data<Integer, String>(1, "Chaand")); // output //Data [key=1, value=Chaand]
		setKey.add(new Data<Integer, String>(5, "Eid")); // Data [key=2, value=Diva]
		setKey.add(new Data<Integer, String>(7, "Mafia")); // Data [key=5, value=Eid]
		setKey.add(new Data<Integer, String>(8, "Nahur")); // Data [key=7, value=Mafia]
		setKey.add(new Data<Integer, String>(5, "Asalpha"));// Data [key=8, value=Nahur]
		setKey.add(new Data<Integer, String>(2, "Diva"));

		for (Data<Integer, String> elements : setKey) {
			System.out.println(elements);
		}
		System.out.println("*****");

		Comparator<Data<Integer, String>> COMPARE_Value = new Comparator<Data<Integer, String>>() {

			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if (obj1.getValue().length() < obj2.getValue().length()) {
					return -1;
				} else if (obj1.getValue().length() > obj2.getValue().length()) {
					return 1;
				} else
					return 0;
			}
		};

		Set<Data<Integer, String>> setValue = new TreeSet<>(COMPARE_Value);
		setValue.add(new Data<Integer, String>(1, "Chaand"));
		setValue.add(new Data<Integer, String>(5, "Eid"));
		setValue.add(new Data<Integer, String>(7, "Mafia"));
		setValue.add(new Data<Integer, String>(8, "Nahur"));
		setValue.add(new Data<Integer, String>(5, "Asalpha"));
		setValue.add(new Data<Integer, String>(2, "Diva"));
		for (Data<Integer, String> elements : setValue) {
			System.out.println(elements);
		}
	}
}
