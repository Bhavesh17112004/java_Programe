package com.bhavesh;

class Father{
	public void property() {
		System.out.println("2BHK");
		
	}
}

class Child extends Father{
	
}
public class SingleInheritance {
	public static void main(String[] args) {
	Child obj =new Child();
	obj.property();
	}
}
