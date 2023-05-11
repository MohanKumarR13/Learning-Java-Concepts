package com.mohan.static_keyword;

public class StaticVariable {
	static int accountBalance = 0;
	String depositeBy;;

	public static void main(String[] args) {
		StaticVariable staticVariable1 = new StaticVariable();
		staticVariable1.accountBalance = 500;
		staticVariable1.depositeBy = "Ryan";

		StaticVariable staticVariable2 = new StaticVariable();
		staticVariable2.accountBalance = 1000;
		staticVariable2.depositeBy = "Renolds";

		System.out.println("Static variable_1 Integer :" + staticVariable1.accountBalance);
		System.out.println("Static variable_1 String :" + staticVariable1.depositeBy);
		System.out.println("Static variable_2 Integer :" + staticVariable2.accountBalance);
		System.out.println("Static variable_2 Integer :" + staticVariable2.depositeBy);

	}

}
