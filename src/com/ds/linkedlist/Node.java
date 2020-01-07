package com.ds.linkedlist;

public class Node<T> {

	Node<T> next;
	T data;

	@Override
	public String toString() {
		return (String) this.data;
	}
}
