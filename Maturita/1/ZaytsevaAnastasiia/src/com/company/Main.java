package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number 1: ");
        float a = sc.nextInt();
        System.out.println("Number 2: ");
        float b = sc.nextInt();
        float sum = a + b;
        float div = a/b;
        float mult = a*b;
        float subs = a-b;
        System.out.println("Summary: " + sum + "\nRozdiel: " + subs + "\nMultiplication: " + mult+ "\nDivision: " + div);



    }
}
