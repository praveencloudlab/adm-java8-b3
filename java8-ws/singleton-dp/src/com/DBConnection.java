package com;

/*
 * singleton pattern
 * ----------------------
 * 	1.defined all constructors as 'private'
 * 	2.define singleton class object as static reference at class level
 * 	3.define a static public method, and create singleton class object and return it
 *    in-case of it is not created earlier
 *  4.return the singleton class object, in-case it is already created
 */

public class DBConnection {
	
	private static DBConnection con;
	
	
	private DBConnection() {
		System.out.println("DBConnection object created...");
	}
	
	public static DBConnection getConnection() {
		
		if(con==null) {
			con=new DBConnection();
			return con;
		}
		return con;	
	}
	
	
	public void save() {
		System.out.println("saving to DB ...");
	}
	

}
