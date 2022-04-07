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
			switch (scanner.nextInt()) {
			case 1:
				Operations.addDataAtStart();
				break;
			case 2:
				Operations.addDataAtEnd();
				break;
			}
		}

	}
}
