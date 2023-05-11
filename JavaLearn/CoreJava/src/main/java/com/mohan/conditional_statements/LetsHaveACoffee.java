package com.mohan.conditional_statements;

public class LetsHaveACoffee {
	/*
	 * boolean is an data type it's and true or false
	 */
	boolean isCupEmpty = true;

	public static void main(String[] args) {
		LetsHaveACoffee letsHaveACoffee = new LetsHaveACoffee();

		if (letsHaveACoffee.isCupEmpty) {// true
			System.out.println("Fill the Cup");
		} else {
			System.out.println("Drink the Coffee");
		}

	}

}
