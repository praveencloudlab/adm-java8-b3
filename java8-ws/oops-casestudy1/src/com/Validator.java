package com;

public class Validator {
	
	private static Validator validator;
	
	private Validator() {}
	
	public static Validator getValidator() {
		if(validator==null) {
			return new Validator();
		}
		
		return validator;
	}
	
	
	public boolean validateStudentDetails(Student student) {
		System.out.println("student validated");
		
		//if(student.getAge()>=50) {
		//	return false;
		//}
		
		return true;
	}
	
	
	
	
	
	
	
	

}
