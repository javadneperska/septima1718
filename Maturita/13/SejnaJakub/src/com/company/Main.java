package com.company;

import java.util.Scanner;
public class Main {

    static void print(String line) {
        System.out.println(line);
    }
    static double findFinalPrice(double price, double dph) {
        return (double) ((price * dph) / 100);
    }
    public static void main(String[] args) {
        double price;
        double dph = 20;
        Scanner sc = new Scanner(System.in);
        print("Enter price of the product :");
        price = sc.nextDouble();
        print("Dph je " + findFinalPrice(price, dph));
    }
}




