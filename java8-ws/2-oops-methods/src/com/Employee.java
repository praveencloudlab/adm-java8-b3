package com;

public class Employee {
	/*
	 *  instance variables default values
	 *  ---------------------------------
	 *  data type	default-value
	 *  ---------------------------------
	 *  int				0
	 *  long			0
	 *  short			0
	 *  byte			0
	 *  float			0.0
	 *  double			0.0
	 *  boolean			false
	 *  char			(blank space)
	 *  String			null
	 *  
	 *  note: 
	 *  	 -> local variables never have default values. 
	 *       -> default values are only available for the 
	 *          class level variables
	 *   	 -> instance data always have a separate copy for 
	 *          each object
	 *  	
	 */
	
	int id;
	String name;
	
	static String company;
	
	Employee e1Obj=new Employee(); // instance
	Employee e2Obj=new Employee(); // instance
	Employee e3Obj=new Employee(); // instance
	
	
	void f1() { // can access instance data
		int i; // i is local variable to f1 method in Employee class
		//System.out.println(i); error
		System.out.println(id); // default value of id displayed (zero)
		e1Obj.id=100;
		e1Obj.name="Praveen";
	}
	
	void f3() { // can access instance data
		e1Obj.id=10000;
		e1Obj.name="Abc";
	}
	
	static void f2() { // can not access instance data
		// need of creating an object?
		//-----------------------------
		// to access instance data from the class
		Employee emp=new Employee(); // emp is local to f2 method only
		emp.id=1000;
		emp.name="Ozvitha";	
	}
	
	void display(){
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Company: "+company);
		System.out.println("---------------------");
	}
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(); // new operator always creates object in the heap
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		company="Cognizant";
		
		e1.id=10;
		e1.name="Abc";
		
		
		e2.id=11;
		e2.name="Xyz";
		
		e3.id=12;
		e3.name="Jhh";
		
		/*
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.company);// not recamended to call static data with object name
		
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.company);
		
		System.out.println(e3.id);
		System.out.println(e3.name);
		System.out.println(e3.company);
		*/
		
		e1.display();
		e2.company="CTS";
		e2.id=76;
		e2.display();
		e3.display();
		
	}
	
	

}
