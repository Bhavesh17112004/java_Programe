package com.bhavesh;



public class Array {

	public static void main(String[] args) {
		int[] numbers= {10,20,30,40,50};
		String[] names= {"Raj","Karan","Sham","Raju","Bhavesh"};
		System.out.println(numbers[1]);
		System.out.println(names[1]);
		for( int i=0;i<numbers.length;i++ ) {
			System.out.println(numbers[i]+names[i]);
		}

	}

}
