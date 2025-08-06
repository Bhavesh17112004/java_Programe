package com.bhavesh;
class Calculators{
	 Calculators(int a, int b) {
		 int sum=a+b;
		 System.out.println("Addition:"+sum);
	
	}
	
	 Calculators(int a,int b,boolean multiply) {
		 int multiplication=a*b;
		 System.out.println("Multiplication:"+multiplication);
	
	 }
	 Calculators(Double a ,Double b,boolean sub) {
		 Double substraction=a-b;
		 System.out.println("substraction:"+substraction);
	 }
}
public class Calculator {

	public static void main(String[] args) {
		new Calculators(23, 34);
		Calculators obj2=new Calculators(23, 34,true);
		Calculators obj3= new Calculators(23.5,28.6,true);

	}

}
