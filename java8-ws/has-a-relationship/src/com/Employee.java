package com;

public class Employee {

	private int empId;
	private String empName;
	private double salary;
	
	private Department dept; //employee has Department object : 'has-A' relation
	private Project proj; // 'has-A' relationship


	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	

	public Project getProj() {
		return proj;
	}

	public void setProj(Project proj) {
		this.proj = proj;
	}
	
	public Department getDept() {
		return dept;
	}



	public void setDept(Department dept) {
		this.dept = dept;
	}



	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void display() {
		System.out.println("ID: "+empId);
		System.out.println("name: "+empName);
		System.out.println("Salary: "+salary);
		System.out.println("Dept ID: "+dept.getDeptId());
		System.out.println("Dept name: "+dept.getDeptName());
		System.out.println("Project ID: "+proj.getProjectId());
		System.out.println("Project Name: "+proj.getProjectName());
		System.out.println("Client name: "+proj.getClientName());
		System.out.println("----------------------------------");
	}
	
	
	
	
	

}
