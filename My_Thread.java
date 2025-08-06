package com.bhavesh;

public class My_Thread extends Thread{

	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Threading running"+i);
			//THAT safe your cpu safe that point to 
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//that point
		}
	}
	public static void main(String[] args) {
		My_Thread m=new My_Thread();
		m.start();
	}

}
