package com.mohan.constructors;

//Constructor OverLoading
public class Draw {
	String draw;

	Draw() {
		System.out.println("Draw Object Created");
	}

	Draw(String toDraw) {
		draw = toDraw;
		System.out.println("Drawing " + toDraw);
	}

	public static void main(String[] args) {
		Draw draw = new Draw();
		Draw draw2 = new Draw("Circle");
	}

}
