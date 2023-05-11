package com.mohan.javalearning;

public class BankAccount {
	Long accountNumber = 1234567890l;
	String holderName = "Mohan";
	Integer accountBalance = 350;

	public void getBalance() {
		System.out.println("Balance is : " + accountBalance);

	}

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.getBalance();
	}

}
