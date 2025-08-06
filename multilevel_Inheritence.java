package com.bhavesh;

class Animal{
	public void eat() {
		System.out.println("Animal Can Eat");
	}
}

class Cat extends Animal{
	public void Meow() {
		System.out.println("Meooooooooo");
	}
}

class Kitten extends Cat{
	public void jump() {
		System.out.println("jump like rabit");
	}
}






public class multilevel_Inheritence {

	public static void main(String[] args) {
		Kitten k=new Kitten();
		k.eat();
		k.Meow();
		k.jump();
	

	}

}
