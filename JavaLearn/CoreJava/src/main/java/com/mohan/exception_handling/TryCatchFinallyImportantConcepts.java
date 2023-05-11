package com.mohan.exception_handling;

public class TryCatchFinallyImportantConcepts {
public static int dummy() {
	return 3;
}
	public static void main(String[] args) {
		try {
			/* System.out.println(TryCatchFinallyImportantConcepts.dummy()); */
			System.out.println("Inside Try Block");
			/* throw new Exception(); */
			System.out.println(2/0);
			System.out.println("After Exception");
			/* System.exit(0); */
		}catch (Exception e) {
			System.out.println("Inside Catch Block");

		}finally {
			System.out.println("Inside Finally Block");

		}

	}

}
