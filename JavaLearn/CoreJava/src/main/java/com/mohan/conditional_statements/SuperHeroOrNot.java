package com.mohan.conditional_statements;

public class SuperHeroOrNot {
String hero="Bat Man";
public void heroOrNot() {
	switch (hero) {
	case "Iron Man":
		System.out.println("Iron Man is an Super Hero");
		break;
	case "Super Man":
		System.out.println("Super Man is an Super Hero");
		break;
	case "Bat Man":
		System.out.println("Bat Man is an Super Hero");
		break;
	case "Aqua Man":
		System.out.println("Aqua Man is an Super Hero");
		break;

	default:
		System.out.println(hero +"Sorry I Don't Know that Person");
	}
}
	public static void main(String[] args) {
		SuperHeroOrNot superHeroOrNot=new SuperHeroOrNot();
		superHeroOrNot.heroOrNot();
	}

}
