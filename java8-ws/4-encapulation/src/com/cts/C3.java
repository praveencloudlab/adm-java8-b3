package com.cts;

import com.C1;

public class C3 extends C1{ // C3 is sub class of C1
	
	  public void f1() {
		   C1 c1=new C1();
		   c1.f1();
		   //c1.f2(); // error . f2 is available to the classes of com package only
		   //c1.f3(); 
		  // c1.f4();// error
		   
		   C3 c3=new C3(); // sub class object of C1 super class
		   c3.f3();
		   //c3.f4(); // error
	  }

}
