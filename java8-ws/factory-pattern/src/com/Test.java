package com;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number: ");
		
		int x=sc.nextInt();
		
		System.out.println("No is "+x);

		sc.nextLine(); // to skip enter key from the keyboard
		
		System.out.println("enter a float value");
		float f=sc.nextFloat();
		System.out.println("float value is "+f);
		
		sc.nextLine(); // to skip enter key from the keyboard
		
		System.out.println("Enter a String: ");
		String s1=sc.nextLine();
		System.out.println("String is "+s1);
		
	}

}
