package com.ds.linkedlist;

public class LinkedList {

	Node head;

	public void insert(String data) {

		Node node = new Node();
		node.data = data;
		Node n = null;
		if (head == null) {
			head = node;
		} else {
			n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void insertAtStart(String data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}

	public void printData() {
		Node n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

	public void insertAtStart(int index, String data) {
		Node node = new Node();
		Node n = head;

		if (index == 1) {
			insertAtStart(data);
		}
		for (int i = 1; i < index - 1; i++) {
			n = n.next;
		}
		node.next = n.next;
		node.data = data;
		n.next = node;
	}
}
