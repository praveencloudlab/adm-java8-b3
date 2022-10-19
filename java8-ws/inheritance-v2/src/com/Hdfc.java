package com;

public class Hdfc extends ReserveBank{
	
	
	public void custInfo() {
		System.out.println("cust info of hdfc");
	}
	
	public void lockerAccess() { // only manager can provide local access.
		System.out.println("grant locker access...");
	}
	
	
	@Override
	public void copyRights() {
		System.out.println("all rights reserved for HDFC..");
	}

}
