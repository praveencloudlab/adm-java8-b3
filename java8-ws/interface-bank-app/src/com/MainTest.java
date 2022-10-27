package com;

public class MainTest {

	public static void main(String[] args) {
		
		Customer cust=new Bank();
		BankEmployee be=new Bank();
		Manager mgr=new Bank();
		
		cust.withDraw();
		cust.deposit();
		
		be.openAccount();
		be.closeAccount();
		
		mgr.lockerAccess();
		
		
	
		
		
		

	}

}
