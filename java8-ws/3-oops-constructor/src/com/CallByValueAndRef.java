package com;

class Demo{
	int age;
	// call by value
	void f1(int x) { // x is formal argument
		x=x+100; // scope of x is with in f1 method only
		System.out.println("within f1 method, x is "+x);
	}
	
	// call by reference
	void f3(Demo d) { // here d is formal argument
		d.age=79;
		System.out.println("with in f3 method, age is "+d.age);
	}	
}
public class CallByValueAndRef {

	public static void main(String[] args) {
		Demo d=new Demo();
		int x=65;
		System.out.println("before f1 method, x is "+x);
		d.f1(x); // here x is actual argument
		System.out.println("after f1 method, x is "+x);
		System.out.println("========================================");
		d.age=65;
		System.out.println("before f3 method, age is "+d.age);
		d.f3(d);
		System.out.println("after f3 method, age is "+d.age);	
		
	}

}
