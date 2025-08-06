package com.bhavesh;

 class student{
	 private String name;
	 private int age;
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public int getAge() {
		 return age;
	 }
	 public void setAge(int age) {
		 this.age = age;
	 }
	 
	
}




public class SimpleEncapsulation {

	public static void main(String[] args) {
	student obj =new student();
	obj.setName("bhavesh");
	obj.setAge(21);
	System.out.println(obj.getName());
	System.out.println(obj.getAge());
	
	

	}

}
