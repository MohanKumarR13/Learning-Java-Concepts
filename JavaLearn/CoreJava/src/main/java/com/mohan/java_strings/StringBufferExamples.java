package com.mohan.java_strings;

public class StringBufferExamples {

	public static void main(String[] args) {
		// This is a demo for string buffer is mutable
		System.out.println("String is IMMuTABLE");
		String name = "Mohan";
		System.out.println("Appending name to original :" + name.concat("Kumar"));
		System.out.println("Original Name :" + name);
		System.out.println("**********************");
		System.out.println("String Buffer is MUTABLE");
		StringBuffer name1 = new StringBuffer("Mohan");
		System.out.println("Appending a name to Original " + name1.append("Kumar"));
		System.out.println("Original Name " + name1);

		// String Buffer Methods
		// Reverse
		System.out.println(name1.reverse());
		// Replace
		StringBuffer replaceThis = new StringBuffer("Kumar");
		System.out.println(replaceThis.replace(0, 3, "MOHAN"));
		// Delete
		StringBuffer delete = new StringBuffer("Kumaru");
		System.out.println(delete.delete(0, 3));
		// Insert
		StringBuffer insert = new StringBuffer("Kumaru");
		System.out.println(insert.insert(3, "Kumaru"));
		// Capacity
		System.out.println(insert.capacity());
		// Like String we have charAt,SubString,length methods as well

	}

}
