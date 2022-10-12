package com;
//POJO/Model/Bean/Entity
public class Employee {

	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {  
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		//
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		//
		this.empName = empName;
	}

	public double getSalary() {
		
		// calculate
		salary=salary+1000;
		
		return salary;
	}

	public void setSalary(double salary) {
		// auth
		this.salary = salary;
	}
	
	
	public void display() {
		System.out.println("ID: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Salary: "+salary);
		System.out.println("----------------------");
	}
	
	
	
	
	

}
