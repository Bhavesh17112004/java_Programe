package com.bhavesh;

import java.util.Scanner;

public class NameInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name =sc.nextLine();
		System.out.println("Enter Your Number:");
		long ph=sc.nextLong();
		System.out.println("Thank You"+" "+name);
		System.out.println("Your Phone Number is:"+" "+ph);
		sc.close();

	}

}
