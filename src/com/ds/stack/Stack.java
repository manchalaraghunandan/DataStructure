package com.ds.stack;

@SuppressWarnings("unchecked")
public class Stack<T> {

	private int top = 0;
	int capacity;
	private T stack[];

	public Stack() {
		this(2);
	}

	public Stack(int capacity) {
		stack = (T[]) new Object[capacity];
		this.capacity = capacity;
	}

	public void push(T data) {
		if (top == capacity)
			increaseCapacity();
		stack[top] = data;
		top++;
	}

	private void increaseCapacity() {
		Object[] newStack = new Object[capacity * 2];
		capacity = capacity * 2;
		System.arraycopy(stack, 0, newStack, 0, top);
		stack = (T[]) newStack;
	}

	public void pop() {
		Object newArray[] = new Object[capacity - 1];
		for (int i = 0; i < capacity - 1; i++) {
			if (i != top - 1) {
				newArray[i] = stack[i];
			} else {
				newArray[i] = null;
			}
		}
		stack = (T[]) newArray;
		top--;
		capacity--;
	}

	public void pop(int index) {
		Object newArray[] = new Object[capacity - 1];
		for (int i = 0; i < capacity - 1; i++) {
			if (i != index) {
				newArray[i] = stack[i];
			}
		}
		stack = (T[]) newArray;
		top--;
		capacity--;
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		if (top <= 0) {
			return true;
		}
		return false;
	}

	public void show() {
		for (T i : stack) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
