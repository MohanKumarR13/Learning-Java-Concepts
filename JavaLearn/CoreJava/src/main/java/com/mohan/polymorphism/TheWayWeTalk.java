package com.mohan.polymorphism;

public class TheWayWeTalk {
//This class is illustrates method Overloading with practical example
	public void talk(Parents styleOfTalking) {
		System.out.println("Polite");
	}
	public void talk(Partner styleOfTalking) {
		System.out.println("Mixture of Eveything");
	}
	public void talk(Boss styleOfTalking) {
		System.out.println("Nothing Personal");
	}
	public static void main(String[] args) {
		TheWayWeTalk theWayWeTalk=new TheWayWeTalk();
		Parents parent=new Parents();
		theWayWeTalk.talk(parent);
		Boss boss=new Boss();
		theWayWeTalk.talk(boss);
		Partner partner=new Partner();
		theWayWeTalk.talk(partner);

	}

}
