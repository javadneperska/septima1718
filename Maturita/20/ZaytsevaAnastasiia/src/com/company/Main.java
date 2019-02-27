package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter amount: ");
        double amount =sc.nextDouble();
        System.out.println("Enter rate: ");
        double rate=sc.nextDouble();
        System.out.println("Enter years: ");
        double years=sc.nextDouble();
        double u =(amount*rate*years)/100;
        double amount2=amount+u;
        System.out.println(amount2 + "€");


    }
}
