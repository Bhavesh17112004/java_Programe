package com.bhavesh;

class print{
	public String InkjetPrinter(String a,String b){
		return (a+b);
	}
	public String LaserPrinter (String a,String b,String c) {
		return(a+b+c);
	}
}

public class PolymorphismTask {

	public static void main(String[] args) {
		print obj=new print();
		System.out.println(obj.InkjetPrinter("Inkjet, Printeer"));
		System.out.println(obj.LaserPrinter("Lase, r, Printer"));

	}

}
