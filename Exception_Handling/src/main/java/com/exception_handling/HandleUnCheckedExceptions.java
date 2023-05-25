package com.exception_handling;

public class HandleUnCheckedExceptions {

	public static void main(String[] args) {
		System.out.println("Program is Started");
		int a = 20;
		try {
			System.out.println(a / 0); // Arithmetic Exception
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		}
		String s = null;
		try {
			System.out.println(s.length());// NullPointer Exception
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Program is Inprogress");
		System.out.println("Program is Completed");
	}

}
