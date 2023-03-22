package org.student;

import org.department.Department;

public class Student extends Department {
	public static void studentName(){
		System.out.println("studentName:JEEVA");
	}
	public static void studentDept() {
		System.out.println("studentDept:CSE");
	}
	public static void studentId() {
		System.out.println("studentId:701");
	}
	public static void main(String[] args) {
		Student detils = new Student();
		detils.collegeName();
		detils.collegeCode();
		detils.collegeRank();
		detils.studentName();
		detils.studentDept();
		detils.studentId();
	}

}