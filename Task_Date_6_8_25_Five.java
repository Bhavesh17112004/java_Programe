package com.bhavesh;
class Calculatores {
	int add(int a,int b) {
		return a+b;
	}
	double add(double a,double b ) {
		return a+b;
	}
}
public class Task_Date_6_8_25_Five {

	public static void main(String[] args) {
		Calculatores calculator=new Calculatores();
		System.out.println("Int Add:"+ calculator.add(25, 30));
		System.out.println("Double Add:"+calculator.add(5.5, 2.5));

	}

}
