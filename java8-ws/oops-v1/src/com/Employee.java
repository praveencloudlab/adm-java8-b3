package com;

public class Employee {
	
	/*
	 *  1.variables/properties/fields
	 *  2.methods
	 *  3.constructors
	 *  4.blocks
	 *  5.inner classes
	 *  6.interface
	 *  7.enums
	 *  
	 *  
	 *  1.variables/properties/fields
	 *  ================================
	 *  1.instance
	 *  2.static 
	 *  3.final
	 *  4.volatile
	 *  
	 *  2.methods
	 *  ==============
	 *  1.instance
	 *  2.static
	 *  3.final
	 *  4.abstract
	 *  5.native
	 *  
	 *  3.constructors
	 *  =================
	 *  1.default
	 *  2.argument based
	 *  
	 *  4.blocks
	 *  ===========
	 *  1.instance
	 *  2.static
	 *  
	 *  5.inner classes
	 *  ====================
	 *  1.static inner class
	 *  2.private inner class
	 *  
	 *  
	 *  
	 * 
	 *  
	 *  
	 *  instance variables
	 *  ======================
	 *  -> single copy for each object
	 *  
	 *  static variables
	 *  ======================
	 *  -> sharable to all the objects
	 *  
	 *  
	 *  Methods
	 *  ==========
	 *  
	 *  1.instance methods
	 *  ====================
	 *  -> instance methods are unique to each object
	 *  
	 *  2.static methods
	 *  ====================
	 *  ->static methods can be invoked by without need of any object
	 *  
	 *  notes
	 *  ======
	 *  1.instance data and static data  accessible from instance methods with in the same 
	 *    class directly
	 *  2.instance data can not be accessible from static methods directly
	 *  3.static methods never allow instance data directly
	 *  4.static methods allows static data directly.
	 *  
	 *  what is an object?
	 *  ====================
	 *  -> object is a real time entity which contains,
	 *  	1.identity (animal)
	 *  	2.state    (animalName,animalAge) // state means data (variables)
	 *  	3.behavior (fly, eat, walk) // methods
	 *  
	 *  
	 *  why object should be created?
	 *  ==============================
	 *  -> to access non static (instance) data from static methods of same class
	 *  -> to access non static (instance) data from non static and static methods from different class
	 *  
	 *  where can be object created?
	 *  ===============================
	 *   -> to access non static (instance) data from static methods of same class
	 *   -> to access non static (instance) data from non static and static methods from different class
	 *   
	 *   
	 *  how / how many ways to create an object? : 3 ways
	 *  ======================================================
	 *  1. new operator
	 *  2. factory method using newInstance method
	 *  3. clone technique
	 *  
	 *  
	 *  1. new operator
	 *  ==================
	 *  -> new operator is used to allocate memory dynamically
	 *  -> new operator always followed by class constructor
	 *  
	 *  what is a constructor?
	 *  ========================
	 *  -> constructor is a special method , which invokes immediately as soon as
	 *     object of the class is created
	 *  -> constructor name and class name must be same
	 *  -> constructor never returns any content. not even 'void'
	 *  -> difference b/w constructor and method is, method can be invoked by ourself.
	 *     but constructor invoked automatically as soon as object created.
	 *  -> method can be called as many times you want. but constructor invokes
	 *     only one time in its life cycle   
	 *  
	 *   
	 *   how to create object using new operator?
	 *   =========================================
	 *   -> new operator followed by constructor name
	 *   ex: new Employee() // here Employee is constructor
	 *       new Student(), new Person(), new Product() . etc
	 *       
	 *       
	 *   
	 *   
	 */
	
	 int empId; // instance
	 String empName; // instance
	 static String companyName="CTS"; // static variable
	 
	 void f1() { // instance method
		 empId=10; // allowed
		 companyName="Cognizant"; // allowed
	 }
	 
	 static void f2() { // static method 
		companyName="Congizant Technologies"; // valid
		//empId=98; // error
	 }
	
	
	
	public static void main(String[] args) {
		//empId=100; // error
		
		// creating Employee class object
		
		Employee e1=new Employee(); // new allocates memory in the heap space
		
		e1.empId=1000;
		e1.empName="Praveen";
		
		e1.f1(); // instance methods from static method must be called with object name
		f2(); // static methods can be called directly from the same class
		
		System.out.println(e1.empId);
		System.out.println(e1.empName);
		
		companyName="CTS"; // valid	
	}
	
	

}
