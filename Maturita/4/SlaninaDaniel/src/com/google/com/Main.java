package com.google.com;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Write a number: ");
        int a = sc.nextInt();
        System.out.println("Factorial of written number is : " +factorial(a));
    }

    private static int factorial(int a) {
        if (a == 0) {
            return 1;
        }
        else {
            return a*factorial(a-1);
        }
    }
}
