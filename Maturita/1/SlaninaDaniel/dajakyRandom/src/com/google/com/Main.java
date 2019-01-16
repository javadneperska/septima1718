package com.google.com;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)  {
        System.out.println("write first number: ");
        int a = sc.nextInt();
        System.out.println("write second number: ");
        int b = sc.nextInt();
        System.out.println(" a+b = "+(a+b));
        System.out.println(" a-b = "+(a-b));
        System.out.println(" a*b = "+(a*b));
        System.out.println(" a/b = "+(a/b));

    }
}
