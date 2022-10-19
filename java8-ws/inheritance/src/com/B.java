package com;

class A{ // Object is super class to A
	
	/*
	 * notes
	 * -------
	 * -> when ever any method is called on top of a object,
	 *    then JRE searches for that method in the called object class type
	 * -> in-case method found in the called object type class, them
	 *    that class method is executed.
	 * -> if method is not available in the called object type class, then
	 *    JRE searches for the method in its next super class.   
	 * 
	 * 
	 * 
	 * 
	 */
	int id;
	String name;

	void f1() {
		System.out.println("A class f1");
	}
	
	void f2() {
		System.out.println("A class f2");
	}
	
}


public class B extends A {
	
	/*
	 *  polymorphism
	 * -----------------------
	 * -> appearing in many forms. same method with same signature in 
	 *   multiple sub classes.
	 *  
	 *   1. static : method overloading (compile time)
	 *   2. dynamic: method overriding (runtime)
	 *   
	 *    2. dynamic: method overriding (runtime)
	 *    =========================================
	 *    -> same method signature defining in the sub classes
	 *    method signature means
	 *    		-> name of method
	 *    		-> argument types
	 *    		-> number of arguments
	 *    		-> position of arguments
	 */
	
	void f1() {
		System.out.println("B class f1");
		super.f1(); 
		super.id=111;
		super.name="Praveen";
	}
	
	void f2() {
		super.f2();
		System.out.println("B class f2");
	}
	

	public static void main(String[] args) {
		
		B b=new B();
		b.f1();
		b.f2();
		
	}
	
	
	
	
}
