package com.bhavesh;

// Interface defining ATM behavior
interface ATM_kotak {
    void checkBalance();
}

// Class implementing the ATM interface
class Machine implements ATM_kotak {
    public void checkBalance() {
        System.out.println("Check Balance Code:");
    }
}

// Public class — filename must be ATM_Main.java
public class ATM_main {
    public static void main(String[] args) {
        Machine m = new Machine();
        m.checkBalance();
    }
}
