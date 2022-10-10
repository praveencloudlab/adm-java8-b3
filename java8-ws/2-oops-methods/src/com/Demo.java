package com;

public class Demo {
	/*
	 *  constructor
	 *  -----------------
	 *  -> invokes automatically as soon as object is created.
	 *  -> JVM provides a default constructor when you don't provide argument based constructor
	 *  -> constructor name and class name must be same
	 *  -> constructor never returns any value not even 'void'
	 *  
	 *  blocks
	 *  ----------
	 *  1. instance blocks
	 *  2. static blocks
	 *  
	 * 
	 */
	
	
	
	
	static { // static block
			System.out.println(">> static block-1");
		}
	
	static { // static block
		System.out.println(">> static block-2");
	}
	
	{ // instance block
		System.out.println(">> instance block-1");
	}
	{ // instance block
		System.out.println(">> instance block-2");
	}
		

	int id;
	
	public Demo() {
		System.out.println("Demo class object created...");
	}
	
	public Demo(int id) {
		System.out.println("argument constructor");
		this.id=id; //this represents  who ever calling this constructor object name
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("main");
		
		Demo d1=new Demo();
		Demo d2=new Demo();
		Demo d3=new Demo();
		
		//Demo d=new Demo(12);
		//Demo d1=new Demo();
		
		//System.out.println(d.id);
		//System.out.println(d1.id);
		
		
		
		
		
		
		
		
	}

}
