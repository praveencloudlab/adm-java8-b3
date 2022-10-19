package com;

import java.util.ArrayList;
import java.util.List;

public class TestV2 {

	public static void main(String[] args) {
		
		ReserveBank r=new Hdfc();
		
		r.guidelines();
		r.copyRights();
		//r.lockerAccess(); // error
		
		r=new Sbi();
		
		r.guidelines();
		r.copyRights();
		
		//r.lockerAccess(); // error
		//r.custInfo(); // error
		
		
		
		

	}

}
