package com.mohan.polymorphism;

public class Son extends Parents {
	// This class is illustrates method Overriding with practical example

	@Override
	public void marriage() {
		System.out.println("My Life My Rules");
	}

	public static void main(String[] args) {
		Parents parents = new Son();// Parent Class Reference new Child Class
		parents.properties();
	}
}
