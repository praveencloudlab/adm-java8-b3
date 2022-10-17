package com;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		
		Student s1=new Student("Praveen", "Married", 23, "Male", LocalDate.of(1987, 12, 12),"10-76/A1,Hyderabad", "abc@aa.com", "xyz@aa.com", 8765434321L, "Mathematics", "Btech","Indian");
		
		s1.registerStudent();
	}

}
