package com.bhavesh;
class Employee{
	private String  name ;
	private int ID;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
public class EncapsulationTask {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setName("Bhavesh");
		obj.setID(77);
		obj.setSalary(50000);
		System.out.println("Employee Name is:"+obj.getName());
		System.out.println("Employee ID is:"+obj.getID());
		System.out.println("Employee Salary is:"+obj.getSalary());

	}

}
