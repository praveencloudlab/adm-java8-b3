package com;

public class ExamRegistrar {
	
	private static ExamRegistrar examRegistrar;

	private ExamRegistrar() {}
	
	public static ExamRegistrar getExamRegistrar() {
		
		if(examRegistrar==null) {
			return new ExamRegistrar();
		}
		return examRegistrar;
	}
	
	
	public Exam registeringStudentForExamination (Student student) {
		Paper paper=new Paper();
		Exam exam=new Exam(paper);
		System.out.println("student is registered for exam");
		return exam;
	}
	
	

}
