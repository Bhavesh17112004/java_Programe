package com.bhavesh;
class Book{
	Book(String title){
		System.out.println("Book Title:"+title);
	}
	public Book(String title,int price) {
		System.out.println("Book Title:"+title+" "+"Price:"+price);
	}
}
public class Task_Date_6_8_25_Third {

	public static void main(String[] args) {
		Book b1=new Book("JAVA");
		Book b2=new Book("JAVA Script",500);

	}

}
