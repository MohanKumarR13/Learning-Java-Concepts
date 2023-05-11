package com.mohan.collection_list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public void linkedListExample() {
		// Create simple linkedList
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(4);
		System.out.println("Linked List:" + linkedList);
//Add an element to the firs position
		linkedList.addFirst(1);
		System.out.println("Linked List after adding first :" + linkedList);
//Add an element last position
		linkedList.addLast(5);
		System.out.println("Linked List after adding last :" + linkedList);
//Get the first value
		System.out.println("First value :" + linkedList.getFirst());
//Get the first value using index position
		System.out.println("First value using index:" + linkedList.get(0));
//Get the third value
		System.out.println("Third value using index :" + linkedList.get(3));
//Remove first and Remove lase
		System.out.println("Remove First :" + linkedList.removeFirst());
		System.out.println(linkedList);
		System.out.println("Remove Last :" + linkedList.removeLast());
		System.out.println(linkedList);
//Poll method and poll first() deletes the first element in the list
		System.out.println(linkedList.poll());
		System.out.println(linkedList);
//Poll last deletes the last
		linkedList.pollLast();
		System.out.println(linkedList);
//remove deletes the last
		linkedList.remove();
		System.out.println(linkedList);
//Adding
		linkedList.addFirst(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);
//Remove first occurance
		linkedList.removeFirstOccurrence(2);
		System.out.println("After removing first occurance of 2" + linkedList);
//Remove last occurance
		linkedList.removeLastOccurrence(6);
		System.out.println("After removing last occurance of 6" + linkedList);
		System.out.println("********************************************");
	}

//Simple For Loop
	public void iterateLinkedListWithSimpleForLoop() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		System.out.println("Simple For Loop");
		for (int index = 0; index < linkedList.size(); index++) {
			System.out.println("Elements in Linked List are" + linkedList.get(index));
		}
		System.out.println("********************************************");
	}

//While Loop
	public void iterateLinkedListWithSimpleWhileLoop() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		int number = 0;
		System.out.println("Simple While Loop");
		while (linkedList.size() > number) {
			System.out.println("Elements in Linked List are :" + linkedList.get(number));
			number++;
		}
		System.out.println("********************************************");
	}

//Iterator
	public void iterateLinkedListWithIterator() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		Iterator<String> iterator = linkedList.iterator();
		System.out.println("Iterator");
		while (iterator.hasNext()) {
			System.out.println("Elements in Linked List are :" + iterator.next());
		}
		System.out.println("********************************************");
	}

//Advance For Loop
	public void iterateLinkedListWithAdvanceForLoop() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		System.out.println("For Each Loop");
		for (String string : linkedList) {
			System.out.println("Elements in Linked List are" + string);
		}
		System.out.println("********************************************");
	}

	public static void main(String[] args) {
		LinkedListExample linkedListExample=new LinkedListExample();
		linkedListExample.linkedListExample();
		linkedListExample.iterateLinkedListWithSimpleForLoop();
		linkedListExample.iterateLinkedListWithAdvanceForLoop();
		linkedListExample.iterateLinkedListWithIterator();
		linkedListExample.iterateLinkedListWithSimpleWhileLoop();
		

	}

}
