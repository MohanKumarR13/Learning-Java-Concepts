package com.mohan.static_keyword;

public class StaticBlock {
	static {
		System.out.println("Inside Static Block_1");
	}
	static {
		System.out.println("Inside Static Block_2");
	}

	public static void main(String[] args) {
		System.out.println("Inside Main Method");

	}

}
