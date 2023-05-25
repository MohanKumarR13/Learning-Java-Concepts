package com.exception_handling;

public class HandleCheckedException_Using_throws_Keyword {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program is Started");
		System.out.println("Program is Inprogress");
		/*
		 * try { Thread.sleep(4000); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
		Thread.sleep(4000);
		System.out.println("Program is Completed");
		System.out.println("Program is Exited");

	}
}
