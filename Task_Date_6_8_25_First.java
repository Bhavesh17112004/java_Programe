package com.bhavesh;
class Persons {
	String name ="Bhavesh";
	int age=21;
	void display() {
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
}
}

//Derived class
class Students extends Persons {
String studentId="DYPATIL123";
String course="Computer Engineering";
void show() {
	System.out.println("StudentId:"+studentId);
	System.out.println("Course:"+course);
}

}
public class Task_Date_6_8_25_First {

	public static void main(String[] args) {
		
		Students student=new Students();
		student.display();
		student.show();
	}

}



