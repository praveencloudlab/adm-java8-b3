package com;

public class StringDemo {
	
	public static void main(String[] args) {
		
		/*
		Integer i=100;
		String s1=i+"";
		String s2=i.toString();
		*/
		
		/*
		 * types of java objects: 2 types
		 * ==================================
		 * 1.immutable: content of an object can not be changed
		 * 		ex: String , and all wrapper classes
		 * 2.mutable: content of an object can be changed.
		 * 		ex: StringBuffer
		 * 
		 */
		
		
		String s1="Abc";
		System.out.println("s1: "+s1);
		System.out.println("s1 Hashcode: "+System.identityHashCode(s1));
		
		System.out.println("-------------------------------------");
		String s2=new String("Abc");
		
		System.out.println("s2: "+s2);
		System.out.println("s2 Hashcode: "+System.identityHashCode(s2));
		
		
		if(s1==s2) // == always compares hashcodes. 
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		System.out.println("-------------------------------------");

		StringBuffer sb1=new StringBuffer("Abc");

		System.out.println("sb1: "+sb1);
		System.out.println("sb1 Hashcode: "+System.identityHashCode(sb1));
		
		sb1.append(" Xyz");
		StringBuffer sb2=new StringBuffer("Abc");
		
		System.out.println("sb1: "+sb1);
		System.out.println("sb1 Hashcode: "+System.identityHashCode(sb1));
		
		//System.out.println("sb2: "+sb2);
		//System.out.println("sb2 Hashcode: "+System.identityHashCode(sb2));
		
		
		
		
		
		
	}

}
