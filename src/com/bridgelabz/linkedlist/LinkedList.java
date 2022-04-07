package com.bridgelabz.linkedlist;

public class LinkedList {
	MyNode head;
	MyNode tail;

	public void push(int data) {
		MyNode newNode = new MyNode(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			MyNode temp = head;
			this.head = newNode;
			newNode.next = temp;
		}
	}

	public void print() {
		if (head == null) {
			System.out.println("Linked List is Empty");
		} else {
			MyNode temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}

		}
	}

	public void append(int i) {

	}

}