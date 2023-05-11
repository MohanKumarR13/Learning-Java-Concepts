package com.mohan.static_keyword;

public class StaticMethods {
	public static void method() {
		System.out.println("Static Method");
	}

	public void nonStaticMethod() {
		System.out.println("Non Static Method");
	}

	public static void main(String[] args) {
		method();

	}

}
