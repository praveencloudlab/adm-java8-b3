package com;

public class Employee {
	
	int id;
	String  name;
	double salary;
	
	// to mandate any properties of a class to be initialized at the time of object creation, we use argument based constructor
	// JVM never adds default constructor on its own when you provided a argument based constructor
	
	public Employee(int id) {
		this.id=id;
	}
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	
	public void display() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("------------------------");
	}
	
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(65,"Praveen",876543);
		Employee e2=new Employee(98,"James",98888);
		Employee e3=new Employee(54, "Kavya",88777);
		
		
		
		e1.display(); //? 
		e2.display();
		e3.display();
		
		
		
	}
	
	

}
