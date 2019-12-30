package com.ds.dqueue;

public class Main {

	public static void main(String[] args) {

		Dqueue<Integer> queue = new Dqueue<>();
		queue.enqueue(123);
		queue.enqueue(39);
		queue.enqueue(93);
		queue.showResults();
		queue.dequeue();
		queue.enqueue(34);
		queue.showResults();
		queue.dequeue();
		queue.enqueue(45);
		queue.enqueue(98);
		// queue.enqueue(85);
		// queue.enqueue(46);
		queue.showResults();

	}

}
