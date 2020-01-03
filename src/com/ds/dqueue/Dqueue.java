package com.ds.dqueue;

@SuppressWarnings("unchecked")
public class Dqueue<T> implements Queue<T> {

	private int front = 0;

	private int rear = 0;

	private int capacity;

	private T[] queue;

	int temp = 0;

	public Dqueue() {
		this(5);
	}

	public Dqueue(int capacity) {
		queue = (T[]) new Object[capacity];
		this.capacity = capacity;
	}

	public void showResults() {
		for (T i : queue) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	@Override
	public void dqueue() {

		queue[front] = null;
		front++;
	}

	@Override
	public void enqueue(Object data) {
		if (rear < capacity) {
			if (rear > capacity && temp < front) {
				for (int i = temp; i < front; i++) {
					queue[i] = (T) data;
					temp++;
				}
			} else {
				queue[rear] = (T) data;
				rear++;
			}
		} else
			System.out.println("Queue is full");
	}

}
