package com.bhavesh;

class Animal0 {
	public void sound () {
		System.out.println("Animal makes sound");
	}
}
class Cats extends Animal0{
	public void sound() {
		System.out.println("Meow");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Animal0 obj = new Cats();
		obj.sound();

	}

}
