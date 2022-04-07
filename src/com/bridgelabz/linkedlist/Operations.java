package com.bridgelabz.linkedlist;

/*
 * @author::Kishlay Kishan
 * @date 05-Apr-2022
 */

public class Operations {
	public static void addDataAtStart() {
		LinkedList linkedList = new LinkedList();
		linkedList.push(70);
		linkedList.push(30);
		linkedList.push(56);
		linkedList.print();
	}

	public static void addDataAtEnd() {

		LinkedList linkedList = new LinkedList();
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);
		linkedList.print();
	}

	public static void insertInBetween() {
		LinkedList linkedList = new LinkedList();
		MyNode secondNode = linkedList.push(70);
		MyNode firstNode = linkedList.push(56);
		MyNode newNode = new MyNode(30);
		System.out.println("Before:");
		linkedList.print();
		linkedList.insertInBetween(firstNode, newNode);
		System.out.println("\nAfter:");
		linkedList.print();

	}

	public static void deleteFirstNode() {
		// TODO Auto-generated method stub

	}
}