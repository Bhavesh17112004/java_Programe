package com.bhavesh;

class Dad{
	public void bike() {
		System.out.println("KTM");
	}
	public void car() {
		System.out.println("GT");
	}
}

class son_1 extends Dad{
	public void cycle() {
		System.out.println("Hero");
	}
}

class son_2 extends Dad{
	public void skateboard() {
		System.out.println("Yonex");
	}
}





public class hierarchical {

	public static void main(String[] args) {
		son_1 obj1 =new son_1();
		obj1.bike();
		obj1.car();
		obj1.cycle();
		
		son_2 obj2 = new son_2();
		obj2.skateboard();

	}

}
