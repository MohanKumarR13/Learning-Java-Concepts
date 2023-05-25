package com.exception_handling;

public class HandleCheckedExceptions {
	public static void main(String[] args) {
		System.out.println("Program is Started");
		System.out.println("Program is Inprogress");
		try {
			Thread.sleep(4000);// Checked Exception
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Program is Completed");
		System.out.println("Program is Exited");

	}

}
