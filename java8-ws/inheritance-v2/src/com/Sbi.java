package com;

public class Sbi extends ReserveBank{
	
	
	public void custInfo() {
		System.out.println("cust info of sbi");
	}
	
	public void lockerAccess() { // only manager can provide local access.
		System.out.println("grant locker access...");
	}
	
	
	@Override
	public void copyRights() {
		System.out.println("all rights reserved for SBI..");
	}

}
