package com.ds.stack;

public class Main {
	public static void main(String[] args) {

		Stack st = new Stack();
		System.out.println(st.isEmpty());
		st.push(1);
		st.push(55);
		st.push(13);
		st.push(57);
		System.out.println("Size is " + st.size());
		System.out.println("Size is " + st.size());
		st.push(875);
		st.pop();
		st.push(23490);
		st.push(23491);
		st.push(23492);
		st.push("23493");
		st.push(2349);
		st.push(23494);
		st.push(23495);
		st.push(23496);
		st.push(23497);
		st.push(23498);
		st.push(23499);
		st.push(234);
		st.pop(2);
		System.out.println("Size is " + st.size());
		st.show();
	}
}
