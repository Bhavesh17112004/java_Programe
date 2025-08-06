package com.bhavesh;

abstract class Vehicle{
	abstract void start();
}
class Car extends Vehicle{
	void start() {
		System.out.println("Car Started");
	}
}

class Bike extends Vehicle{
	void start() {
		System.out.println("Bike Started");
	}
}


public class Task_Date_6_8_25_Eight {

	public static void main(String[] args) {
		Vehicle car= new Car() ;
		Vehicle bike=new Bike();
		car.start();
		bike.start();
		}

	}


