package com.bhavesh;
class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}
	void greet() {
		System.out.println("Hello from Parent");
	}
}
class Childs extends Parent{
	 Childs() {
	super();
	System.out.println("Child Constructor");
	}
	 void greet() {
		 super.greet();
		 System.out.println("Hello From Child");
	 }
}
 class Task_Date_6_8_25_Seven {

	public static void main(String[] args) {
		Childs c=new Childs();
		c.greet();
		

	}

}
