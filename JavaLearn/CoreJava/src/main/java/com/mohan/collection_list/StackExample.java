package com.mohan.collection_list;

import java.awt.Taskbar.State;
import java.util.Stack;

public class StackExample {
	/*
	 * Stack-> child class of vector Follows LIFO((Last In First Out))
	 */
	public void stackExample() {
		//Create Object
		Stack<String>stack=new Stack<String>();
		
		//Insert the element->Push
		stack.push("A");
		stack.add("B");
		stack.add("C");
		//Print and see the stack
		System.out.println("stack Elemets :"+stack);
		//delete an element ->pop
		stack.pop();//Lifo,So the last inserted elemeted is deleted
		//To get the top element->peek
		System.out.println("Top Element :"+stack.peek());
		//Search returns the offse value offset is the position counted from top
		System.out.println("Search the Element A :"+stack.search("A"));
		//if element is not present then value is -1
		System.out.println("Searching an element which is not present :"+stack.search("x"));
	}
	public static void main(String[] args) {
		StackExample stackExample=new StackExample();
		stackExample.stackExample();
	}

}
