package com;

public class C1 {
	
	public void f1() {
		f4();
	}
	void f2() {
		f4();
	} // default access modifier
	protected void f3() {
		f4();
	}
	
	private void f4() {}

}
