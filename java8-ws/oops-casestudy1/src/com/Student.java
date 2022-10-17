package com;

import java.time.LocalDate;

public class Student {

	private String name;
	private String maritalStatus;
	private int age;
	private String gender;
	private LocalDate dateofBirth;
	private String address;
	private String primaryEmailid;
	private String secondaryEmailid;
	private long phoneNumber;
	private String interestedSubject;
	private String highestEducationQualification;
	private String nationality;

	private String admissionId;
	private String result;
	private Exam exam;

	public Student(String name, String maritalStatus, int age, String gender, LocalDate dateofBirth, String address,
			String primaryEmailid, String secondaryEmailid, long phoneNumber, String interestedSubject,
			String highestEducationQualification, String nationality) {
		this.name = name;
		this.maritalStatus = maritalStatus;
		this.age = age;
		this.gender = gender;
		this.dateofBirth = dateofBirth;
		this.address = address;
		this.primaryEmailid = primaryEmailid;
		this.secondaryEmailid = secondaryEmailid;
		this.phoneNumber = phoneNumber;
		this.interestedSubject = interestedSubject;
		this.highestEducationQualification = highestEducationQualification;
		this.nationality = nationality;
	}

	public void registerStudent() {
		Registrar registrar = Registrar.getRegistrar();
		admissionId = registrar.registerStudent(this);
		System.out.println("Admission ID: " + admissionId);

		if (admissionId != null) {
			ExamRegistrar.getExamRegistrar();
			registerForExam(exam);
			apperForExam();
		}else {
			System.out.println("Student is not eligible for exam");
		}
	}

	public void registerForExam(Exam exam) {
		ExamRegistrar examRegistrar = ExamRegistrar.getExamRegistrar();
		exam = examRegistrar.registeringStudentForExamination(this);
		this.exam = exam;
	}

	public void apperForExam() {
		
		Paper paper = exam.getPaper();
		result = paper.submit();
		
		System.out.println("Result:: " + result);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPrimaryEmailid() {
		return primaryEmailid;
	}

	public void setPrimaryEmailid(String primaryEmailid) {
		this.primaryEmailid = primaryEmailid;
	}

	public String getSecondaryEmailid() {
		return secondaryEmailid;
	}

	public void setSecondaryEmailid(String secondaryEmailid) {
		this.secondaryEmailid = secondaryEmailid;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getInterestedSubject() {
		return interestedSubject;
	}

	public void setInterestedSubject(String interestedSubject) {
		this.interestedSubject = interestedSubject;
	}

	public String getHighestEducationQualification() {
		return highestEducationQualification;
	}

	public void setHighestEducationQualification(String highestEducationQualification) {
		this.highestEducationQualification = highestEducationQualification;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}
