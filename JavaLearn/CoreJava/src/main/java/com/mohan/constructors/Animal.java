package com.mohan.constructors;

public class Animal {
	String animal_name;
	String animal_type;

	Animal(String name, String type) {
		animal_name = name;
		animal_type = type;
	}

	public void sayAboutAnimal() {
		System.out.println("Animal name is " + animal_name + " and type is " + animal_type);
	}

	public static void main(String[] args) {
		Animal animals1 = new Animal("Duck", "Omniverse");
		animals1.sayAboutAnimal();

		Animal animals2 = new Animal("Bear", "Omniverse");
		animals2.sayAboutAnimal();

	}

}
