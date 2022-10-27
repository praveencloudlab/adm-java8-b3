package com;

/*
 * -> interface is a method specification contains zero or more abstract methods only
 * -> by default every method in an interface is public and abstract
 * -> by default every property in the interface is public static final
 * -> any interface with zero methods, is called marker / tagged interface
 * -> we can not create an object to interface
 * -> interface can store all its implementation/sub class objects
 * 
 *  notes
 *  --------
 *  -> a class can extends to one class at at time only
 *  -> class can implements more than one interface eat a time
 *  -> class can not extends more than one class at a time
 *  -> class can not implements another class
 *  -> class only can implement interface
 *  -> interface can not implements another interface
 *  -> interface can extends more than one interface at at time
 *  -> class can not be abstract and final at a time
 *  
 * 
 * 
 */
public interface MyInter {
	
	
	//void f1();
	public abstract void f1();
	
	int MAX_AGE=78; // final static
	

}
