package com;

public class Test {

	public static void main(String[] args) {

		Department d1 = new Department(1, "HR");
		Department d2 = new Department(2, "Accounts");
		
		Project p1=new Project(10000, "SBI", "SBI-Insurance");
		Project p2=new Project(10001, "Ford", "Ford-France");
		Project p3=new Project(10002, "JPMC", "Morgan Insurence ltd");
		

		Employee e1 = new Employee(100, "Praveen", 3947394);
		Employee e2 = new Employee(101, "James", 94579375);
		Employee e3 = new Employee(102, "Prasad", 3475374);
		Employee e4 = new Employee(103, "Saravanan", 9347394);
		
		e1.setProj(p1);
		e2.setProj(p2);
		e3.setProj(p3);
		e4.setProj(p2);
		
		
		e1.setDept(d1);
		e2.setDept(d2);
		e3.setDept(d1);
		e4.setDept(d2);
		
		/*
		System.out.println(e1.getEmpId());
		System.out.println(e1.getEmpName());
		System.out.println(e1.getSalary());
		
		System.out.println(e1.getDept().getDeptId());
		System.out.println(e1.getDept().getDeptName());
		System.out.println("--------------------------------");
		
		*/
		
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		
		
		
		
		
		
		

	}

}
