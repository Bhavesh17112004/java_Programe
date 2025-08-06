package com.bhavesh;

import java.util.Scanner;

public class task31_07_2025 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name=sc.nextLine();
		System.out.println(name.toUpperCase());
		/*task 2*/System.out.println(name.length());
		/*task 3*/ System.out.println("I Love Leaning Java Programing");
		String sentence=sc.nextLine();
		System.out.println("Enter you want a serach Word:");
		String search=sc.nextLine();
		if(sentence.toLowerCase().contains(search.toLowerCase())) {
			System.out.println("Your Word is"+search+"that exist in your sentence.");
		}else {
			System.out.println("Your Word is"+" "+search+" "+"that not exist in your sentence.");
		}
		StringBuilder obj=new StringBuilder();
		obj.append("Good");
		obj.append("Morning");
		System.out.println(obj);
		
		StringBuffer buffer=new StringBuffer();
		buffer.append("Coding"+" ");
		buffer.append("is"+" ");
		buffer.append("Fun!");
		System.out.println(buffer);
		

	}

}
