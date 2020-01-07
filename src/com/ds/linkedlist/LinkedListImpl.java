package com.ds.linkedlist;

public class LinkedListImpl implements LinkedList {

	private Node<Object> head;

	private Node<Object> tail;

	private Integer size = 0;

	@Override
	public void insert(Object data) {

		Node<Object> node = new Node<>();
		node.data = data;
		Node<Object> n = null;
		if (head == null) {
			head = node;
		} else {

			n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
		size++;
		tail = node;
	}

	@Override
	public void insertAtStart(Object data) {
		Node<Object> node = new Node<>();
		node.data = data;
		node.next = head;
		head = node;
		size++;
	}

	public void printData() {
		Node<Object> n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

	@Override
	public void insertAt(int index, Object data) {

		Node<Object> node = new Node<>();
		Node<Object> n = head;

		if (index == 1) {
			insertAtStart(data);
		}
		for (int i = 1; i < index - 1; i++) {
			n = n.next;
		}
		node.next = n.next;
		node.data = data;
		n.next = node;
		size++;
	}

	@Override
	public Object find(Object data) {
		Node<Object> current = head;
		while (current.next != null) {
			if (current.data.equals(data)) {
				return current.data;
			}
		}
		return null;
	}

	@Override
	public boolean contains(Object data) {
		Node<Object> current = head;
		while (current.next != null) {
			if (current.data.equals(data)) {
				return true;
			} else if (current.data == data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public String toString() {
		String result = "{";
		Node<Object> n = head;
		while (n != null) {
			result = result + n.data + " ";
			n = n.next;
			result = result + (n.next != null ? ", " : "");
		}
		result = result + "}";
		return result;
	}

	public Object element() {
		return head.data;
	}

	public Integer size() {
		Node<Object> current = head;
		int count = 1;
		while (current.next != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	@Override
	public Object[] toArray() {
		Object[] array = new Object[size()];
		int count = 0;
		for (Node<Object> current = head; current != null; current = current.next) {
			array[count] = current.data;
			count++;
		}
		return array;
	}

}
