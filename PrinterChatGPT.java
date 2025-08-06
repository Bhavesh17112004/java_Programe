package com.bhavesh;

// Superclass
class Printer {
    void print() {
        System.out.println("Printing from Printer...");
    }
}

// Subclass 1
class InkjetPrinter extends Printer {
    public void print() {
        System.out.println("Printing with Inkjet Printer...");
    }
}

// Subclass 2
class LaserPrinter extends Printer {
    public void print() {
        System.out.println("Printing with Laser Printer...");
    }
}

public class PrinterChatGPT {
    public static void main(String[] args) {
        Printer printer;

        printer = new InkjetPrinter();  // Reference of Printer, object of InkjetPrinter
        printer.print();                // Output: Printing with Inkjet Printer...

        printer = new LaserPrinter();   // Reference of Printer, object of LaserPrinter
        printer.print();                // Output: Printing with Laser Printer...
    }
}