package com;

public class Test {
	
	/*
	 *  notes
	 *  ---------
	 *  -> never create sub class object directly
	 *  		-> data abstraction can not be achieved.
	 *   
	 *   what to do?
	 *   -------------
	 *   -> a super class object can store all its sub class objects
	 *   -> always recommended to save sub class object into the super class ref variable
	 * 
	 */

	public static void main(String[] args) {
		
		Sum s=new Sum();
		Mul m=new Mul();
		Division d=new Division();
		
		s.calc(100, 200);
		m.calc(10, 2);
		d.calc(80, 10);
	
	}

}
