package com.ds.linkedlist;

public class Main {

	public static void main(String[] args) {

		LinkedListImpl list = new LinkedListImpl();
		list.insert("Raghu");
		list.insert("sai");
		list.insert("teja");
		list.insertAtStart("Manchala");
		list.insertAt(2, "Medam");
		System.out.println(list.contains("manchala"));
		System.out.println(list);
		list.insert(12);
		list.insert(2348);
		System.out.println(list.contains(12));
		System.out.println(list);
		Object[] array = list.toArray();
		for (Object s : array) {
			System.out.println(s);
		}
	}

}
