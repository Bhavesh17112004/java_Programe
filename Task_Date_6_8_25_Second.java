package com.bhavesh;
class Animals{
	void sound(){
	System.out.println("Animal makes sound");	
	}
}
class Dog extends Animals{
	void sound() {
		System.out.println("Dog barks");
	}
}
public class Task_Date_6_8_25_Second {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();
		

	}

}
