package com.pragra.day16.tims;

import java.util.Scanner;

public class TestRun {
    public static void main(String[] args) {
        System.out.println("-------Hello, welcome to Tims-------");
        TimsOrder t = new TimsOrder();
        t.start();
        System.out.println(t);
        System.out.printf("Total Price: $%.2f\n", t.totalDue());
        t.paymentStart();
        System.out.println("Have a good day!!!");
    }
}
