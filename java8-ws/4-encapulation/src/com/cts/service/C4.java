package com.cts.service;

import com.C1;

public class C4 {
	
	  void f1() {
		   C1 c1=new C1();
		   c1.f1();
		   //c1.f2(); // error . f2 is available to the classes of com package only
		   //c1.f3(); // error
		  // c1.f4();// error
	  }

}
