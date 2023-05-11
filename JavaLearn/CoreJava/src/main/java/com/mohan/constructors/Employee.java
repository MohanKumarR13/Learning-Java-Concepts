package com.mohan.constructors;

public class Employee {
	int employeeId;
	String employeeName;
//Define  No Arguments Constructors
	public Employee() {
		employeeId=1;
		employeeName="Mohan";
		System.out.println("Employee Object is Created");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
	}

}
