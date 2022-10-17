package com;

public class Registrar {

	private static Registrar registrar;

	private Registrar() {
	}

	public static Registrar getRegistrar() {
		if (registrar == null) {
			return new Registrar();
		}
		return registrar;
	}
	
	
	public String registerStudent(Student student) {
		String admissionId=null;
		Validator validator = Validator.getValidator();	
		
		if(validator.validateStudentDetails(student)) {
			admissionId="AbcUni10203774";
		}
		return admissionId;
	}

}
