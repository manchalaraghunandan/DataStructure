package com.ds.dqueue;

@SuppressWarnings("unchecked")
public class Dqueue<T> implements Queue {

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

	public void dequeue() {

		queue[front] = null;
		front++;
	}

	@Override
	public void enqueue((Object)T data) {
		if (rear < capacity) {
			if (rear > capacity && temp < front) {
				for (int i = temp; i < front; i++) {
					queue[i] = data;
					temp++;
				}
			} else {
				queue[rear] = data;
				rear++;
			}
		} else
			System.out.println("Queue is full");		
	}

	


	}
