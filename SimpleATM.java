package com.bhavesh;

abstract class ATM{
	abstract void checkBalance();
	abstract void withdrawCash(double amount);
	abstract void depositCash(double amount);
}

class BankATM extends ATM{
	private double balance =1000.0;
	
	public void checkBalance() {
		System.out.println("Your Current balance is: " +balance);
	}
	public void withdrawCash(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient Balance");
		}else {
			balance -= amount;
			System.out.println("Withdrawl of $" + amount + "successful");
		}
	}
	public void depositCash(double amount) {
	balance += amount;
	System.out.println("Deposite of $"+amount+"successful");
	}
}




public class SimpleATM {

	public static void main(String[] args) {
		ATM obj =new BankATM();
		obj.checkBalance();
		obj.withdrawCash(500);
		obj.depositCash(100);
		obj.checkBalance();
	}

}
