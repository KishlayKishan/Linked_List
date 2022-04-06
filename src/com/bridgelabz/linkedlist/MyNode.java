package com.bridgelabz.linkedlist;

public class MyNode {

	public int data;
	public Node next;

	public MyNode(int data) {
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return "Node{" + "data=" + data + ", next=" + next + '}';
	}
}
