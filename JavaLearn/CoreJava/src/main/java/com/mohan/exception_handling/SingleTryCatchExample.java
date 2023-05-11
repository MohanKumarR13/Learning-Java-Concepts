package com.mohan.exception_handling;

public class SingleTryCatchExample {

	public static void main(String[] args) {
		try {
			int number_1 = 0;
			int number_2 = 3;
			int result = number_2 / number_1;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Don't divide a number by zero");
		}
	}

}
