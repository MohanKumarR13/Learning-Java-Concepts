package com.mohan.constructors;

public class Student {
	String student_Name;
	int rollNo;

//Example for Default Constructor
	/*
	 * Do you see any constructors here? Nope! then you have special powers.
	 * Compiler has created one here !!! Believe me!!!
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		System.out.println(student.student_Name);
		System.out.println(student.rollNo);
	}

}
