package com.ds.dqueue;

public interface Queue<T> {

	public void enqueue(Object data);

	void enqueue();
	
	void dqueue();
}
