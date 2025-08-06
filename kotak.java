package com.bhavesh;

// Interface defining ATM behavior
 interface katak {
    void checkBalance(); // 'abstract' is optional
}

// Class implementing the interface
class machine1 implements katak {
    public void checkBalance() {
        System.out.println("Check Balance Code:");
    }
}

// Public class — filename must be kotak.java
public class kotak {
    public static void main(String[] args) {
        machine1 m = new machine1(); // Corrected class name
        m.checkBalance();
    }
}