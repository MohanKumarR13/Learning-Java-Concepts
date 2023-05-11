package com.mohan.abstraction;

public class Bmw extends Car implements UpcomingProjects {
	@Override
	public void carEngine() {
		System.out.println("Bmw Car Engine");
	}

	@Override
	public void carCompanyVault() {
		System.out.println("Bmw Company Vault");
	}

	public static void main(String[] args) {
		Car car = new Bmw();
		car.carEngine();
		car.carCompanyVault();

	}

	@Override
	public void method1() {
		System.out.println("This is Method_1");
	}

	@Override
	public void method2() {
		System.out.println("This is Method_2");
		
	}

}
