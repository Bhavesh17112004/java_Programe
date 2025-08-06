package com.bhavesh;
class Employee{
	private String name;
	private int salary;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
}
public class Task_Date_6_8_25_Four {

	public static void main(String[] args) {
		Employee employeev=new Employee();
		employeev.setName("Bhavesh");
		employeev.setSalary(50000000);
		System.out.println("Name:"+employeev.getName());
		System.out.println("Salary:"+employeev.getSalary());

	}

}
