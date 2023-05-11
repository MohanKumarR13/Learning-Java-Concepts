package com.mohan.constructors;

public class ChildClass extends ParentClass {
	public ChildClass() {
		super();
		System.out.println("Child Class Constructor");
	}

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
	}

}
