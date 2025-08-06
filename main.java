package com.bhavesh;

class Person{
	
	String name;
	int age;
	
	public void displayDetails() {
		System.out.println("Name" + " "+name );
		System.out.println("Age"+ " " + age );
		
	}
	
}
class Student extends Person{
	String studentID;
	public void displayStudentInfo() {
		displayDetails();
		System.out.println("StudentID"+ " " +studentID);
	}
	
}

public class main {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.name="Alice";
		obj.age=25;
		obj.studentID="DY123";
		obj.displayStudentInfo();

	}

}
