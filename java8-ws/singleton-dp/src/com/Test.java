package com;

public class Test {

	public static void main(String[] args) {
		
		// Singleton design pattern
		
		DBConnection con1 = DBConnection.getConnection();
		DBConnection con2 = DBConnection.getConnection();
		DBConnection con3 = DBConnection.getConnection();
		DBConnection con4 = DBConnection.getConnection();
		
		con1.save();
		con2.save();
		con3.save();
		con4.save();
		/*
		DBConnection con1=new DBConnection();
		DBConnection con2=new DBConnection();
		DBConnection con3=new DBConnection();
		*/
		//con1.save();
		//con2.save();
		//con3.save();
		



	}

}
