package com;

/*
 * singleton pattern
 * ----------------------
 * 	1.defined all constructors as 'private'
 * 	2.define singleton class object as static reference at class level
 */

public class DBConnection {
	
	private static DBConnection con;
	
	
	private DBConnection() {
		System.out.println("DBConnection object created...");
	}
	
	
	public void save() {
		System.out.println("saving to DB ...");
	}
	

}
