package com;

public class Test {
	
	   int x;
	   String y;
	   double d;
	   
	   @Override
	public int hashCode() {
		
		return 1000;
	}

	public static void main(String[] args) {
		 Test t=new Test(); // complex
		 Test t1=new Test(); // complex
		 String s1="abcA8623xs"; // 65 // simple
		 System.out.println("t hashcode is "+t.hashCode());
		 System.out.println("t1 hashcode is "+t1.hashCode());
		 System.out.println("s1 hashcode is "+s1.hashCode());
		 System.out.println("=====================================");
		 
		 System.out.println("t identity hashcode: "+System.identityHashCode(t));
		 System.out.println("t1 identity hashcode: "+System.identityHashCode(t1));
		 
		 

	}

}
