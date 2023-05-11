package com.mohan.exception_handling;

public class You {
/*One fine evening a guy is giving weired faces to his upset
	girl friend when she is at her balcony to make her laugh
	her father noticed this and came to beat hi->Exception
	How to handle this?*/
	public void makeLaugh() {
		try {
			throw new InterruptedException("Coming to Hit You");
		}catch (InterruptedException e) {
			System.out.println("Friend : Give this Pose");
			System.out.println("And you are acting like you are posing for photo");
		}
	}
	public static void main(String[] args) {
		You you=new You();
		you.makeLaugh();
	}

}
