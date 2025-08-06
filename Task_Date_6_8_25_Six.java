package com.bhavesh;



interface Shape{
	void area();
}
class Circle implements Shape{
	public void area() {
		System.out.println("Circle area = πr2");
	}
}
class Rectangle implements Shape{
	public void area() {
		System.out.println("Rectangle area=1 * b");
	}
}
public class Task_Date_6_8_25_Six {

	public static void main(String[] args) {
		Shape c=new Circle();
		Shape r=new Rectangle();
		c.area();
		r.area();

	}

}
