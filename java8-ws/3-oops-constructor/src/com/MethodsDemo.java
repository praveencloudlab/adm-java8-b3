package com;

public class MethodsDemo {
	
	/*
	 *  method
	 *  --------
	 *  -> any block of code with a name defined with in the class, is known as 'method'
	 *  -> a complex statements can be divided into small small modules, known as 'methods'
	 *  -> a method can be re-used as many times as you can
	 *  -> a method must have a name and return type
	 *  -> if any method is not returning any value, then that method return type must be 'void'
	 *  -> a method can have arguments
	 *  
	 *   types of arguments : 2 types
	 *   --------------------------------
	 *   1.actual arguments
	 *   2.formal arguments
	 *  
	 *  
	 *  1.actual arguments
	 *  ---------------------
	 *  -> any argument with in method declaration
	 *     ex: fun(12); here 12 is actual argument
	 *  
	 *  2.formal arguments
	 *  --------------------
	 *  -> any argument with in method definition of body
	 *   ex: fun(int x){ }  . here x is formal argument
	 *  
	 *  call by value and call by reference
	 *  ----------------------------------------
	 *  
	 *  call by value
	 *  ---------------
	 *  -> any modifications to the formal argument, will not reflect the actual argument.
	 *  -> all primitive types in java , by default call by value
	 *  
	 *  call by reference
	 *  -------------------
	 *  -> any modification to the formal argument, will reflect to the actual argument
	 *  -> all objects are call by reference in java.
	 *  
	 */
	
	 void f1(int x) { // here x is formal argument, which contains copy of x value from the main method
		 System.out.println(x);
	 }
	 
	 
	 int sum(int x,int y){
		 return x+y;
	 }
	 
	 String greet() {
		 return "Good morning!";
	 }
	 
	 float mul(int x,float y) {
		 return x*y;
	 }
	

	public static void main(String[] args) {
		MethodsDemo d=new MethodsDemo();
		int x=98;
		d.f1(x); // here x is actual argument
		
		int res=d.sum(87, 4);
		System.out.println(res);
		System.out.println(d.sum(1, 2));
		
		double r1 = Math.sqrt(100);
		System.out.println(r1);
	


	}
}

	




