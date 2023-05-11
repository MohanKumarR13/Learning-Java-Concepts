package com.mohan.javalearning;

public class CollectAmount {
	public Integer collectAmount = 1000;

	public Integer collectAmountAndGiveToMe() {
		System.out.println("Daddy Have Collected Rupees : " +collectAmount + " and sent it to you");
		return collectAmount;
	}

	public static void main(String[] args) {
		CollectAmount mySon = new CollectAmount();
		Integer amount = mySon.collectAmountAndGiveToMe();
		System.out.println("Got the amount son : " + amount);
	}

}
