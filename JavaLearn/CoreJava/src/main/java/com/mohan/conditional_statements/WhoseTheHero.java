package com.mohan.conditional_statements;

public class WhoseTheHero {
String myHeroName="Bat Man";
public void superHeroGuesser() {
	if(myHeroName.equalsIgnoreCase("Iron Man")) {
		System.out.println("You Thought About Iron Man");
	}else if(myHeroName.equalsIgnoreCase("Super Man")) {
		System.out.println("You Thought About Super Man");
	}if(myHeroName.equalsIgnoreCase("Bat Man")) {
		System.out.println("You Thought About Bat Man");
	}else {
		System.out.println("Sorry I Can't Guess");
	}
}
	public static void main(String[] args) {
		WhoseTheHero whoseTheHero=new WhoseTheHero();
		whoseTheHero.superHeroGuesser();

	}

}
