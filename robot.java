package com.bhavesh;

public class robot { 
	public void hello() {
		System.out.println("Hello,How are you!!");
	}
	
	public static void main(String[] args) {
		robot obj = new robot();
		obj.hello();
		obj.hello();
		obj.hello();
	}
}