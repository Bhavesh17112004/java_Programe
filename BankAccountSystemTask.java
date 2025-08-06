package com.bhavesh;

abstract class BankAccount{
	abstract void calculateInterest();
	public void showBalance() {
		System.out.println("Showing Balance:");
	}
}

class SavingAccount extends BankAccount{
	public void calculateInterest() {
		System.out.println("Interest for saving Acount 4%");
	}
	
}

class FixedDepositeAccount extends BankAccount{
	public void calculateInterest() {
		System.out.println("Interest for Fixed Deposite Account is 6.5%");
	}
}



public class BankAccountSystemTask {

	public static void main(String[] args) {
		BankAccount account1= new SavingAccount();
		BankAccount account2= new FixedDepositeAccount();
		
		account1.showBalance();
		account1.calculateInterest();
		
		account2.showBalance();
		account2.calculateInterest();
		

	}

}
