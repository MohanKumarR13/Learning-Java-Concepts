package com.exception_handling;

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("Started");
		//Thread.sleep(5000);//InterruptedException
		int i = 20;
		System.out.println(i / 0);
		System.out.println("Stopped");
	}

}
