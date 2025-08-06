package com.bhavesh;

public class Immutable {
	String name="Bhavesh";
	public void print() {
		System.out.println(name);
		System.out.println(name.concat(" "+"bhavesh"));
	}

	public static void main(String[] args) {
		Immutable obj=new Immutable();
		obj.print();

	}

}
