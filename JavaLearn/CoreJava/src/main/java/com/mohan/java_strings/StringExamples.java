package com.mohan.java_strings;

public class StringExamples {
	public static void main(String[] args) {
		String name = "MohanKumar ";
		int number = 3;

		// Returns Character value for the particular index
		System.out.println(name.charAt(0));

		// Returns String Length
		System.out.println(name.length());

		// Check the Equality of String with given object
		System.out.println(name.equals("Mohan"));
		// Check the Equality of String with given string object without casesensitivity
		System.out.println(name.equalsIgnoreCase("Mohan"));
		// chech if string is empty
		System.out.println(name.isEmpty());
		// Return true or false based on the given value is present or not
		System.out.println(name.contains("A"));
		// Take a particular portion of the string
		System.out.println(name.substring(1));
		// Take a particular portion of the string Begin and End Index
		System.out.println(name.substring(1, 3));
		// appends string to the given string
		System.out.println(name.concat("Kumar"));
		// Replace Existing char with given char
		System.out.println(name.replace("h", "H"));
		System.out.println(name.replace("Kumar", "Kumaru"));
		// Find the Position of the character in the String
		System.out.println(name.indexOf("a"));
		// Find the character specified from index position in the String
		System.out.println(name.indexOf("a", 7));
		System.out.println(name.indexOf("Mohan", 7));
		// Trim the White spaces
		System.out.println(name.trim());
		// Convert the given data type to string
		System.out.println(String.valueOf(number));

		String upperCase = "MOHAN";
		System.out.println(upperCase.toLowerCase());

		String lowerCase = "Kumar";
		System.out.println(lowerCase.toUpperCase());

		// Returned a koined String with delimiter
		System.out.println(String.join("-", "Mohan", "Kumar", "R"));
		System.out.println(String.join("/", "13", "11", "1998"));

		// Split
		String splitThis = "I-am-Groot";
		String[] splitWord = splitThis.split("-");
		for (String string : splitWord) {
			System.out.println(string);
		}

	}

}
