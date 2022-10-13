package com;

import java.util.Scanner;

public class ForNameDemo {

	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a class name: ");
		
		String str=sc.next();
		
		//System.out.println("class is "+str);
		
		//str s=new str(); // invalid
		
		
		
		/*
		 * note:
		 *  Class.forName just loads an existing class into Class object
		 *  Class.forName never create an object
		 */
		
		Employee emp=null;
		Person p=null;
		Student s=null;
		
		Class clName=Class.forName(str);
		System.out.println(clName);
		
		// create object to the class which is there in clName
	
		Object obj=clName.newInstance(); // will create Object
		
		if(obj instanceof Employee) {
			emp=(Employee) obj;
			emp.f1();
		}
		
		if(obj instanceof Student) {
			s=(Student) obj;
			s.f1();
		}
		
		if(obj instanceof Person) {
			p=(Person) obj;
			p.f1();
		}
		
		
		
		
		
		
	}

}
