/*Purpose::Lets create a simple Linked List of 56, 30 and 70.
 *File Name::Linked_List
 *Author::Kishlay Kishan
 *Date::05 Apr 2022
 */

package com.bridgelabz.linkedlist;

import java.util.Scanner;

public class LinkedListMain {
	public static void main(String[] args) {
		System.out.println("Welcome to linkedList DataStructure Program");
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter 1 to add the data at the start");
			System.out.println("Enter 2 to add the data at the end");
			System.out.println("Enter 3 to insert data inBetween");
			System.out.println("Enter 4 to delete data of first node");
			System.out.println("enter 5 to delete data of last node");
			System.out.println("Enter 6 to find index number,node with value 30 in linked list");
			System.out.println("Enter 7 to Add data after searching required data");
			System.out.println("Enter 8 to delete  after data after searching required data");
			System.out.println("Enter 9 to Sort the data in LinkedList");
			switch (scanner.nextInt()) {
			case 1:
				Operations.addDataAtStart();
				break;
			case 2:
				Operations.addDataAtEnd();
				break;
			case 3:
				Operations.insertInBetween();
				break;
			case 4:
				Operations.deleteFirstNode();
				break;
			case 5:
				Operations.deleteLastNode();
				break;
			case 6:
				Operations.findNodeBasedOnValue();
			case 7:
				Operations.insertAfterSearchNode();
				break;
			case 8:
				Operations.deleteAfterNodeAfterSearchNode();
			case 9:
				Operations.sortList();
			}
		}
	}
}