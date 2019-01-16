package com.company;

import java.util.Scanner;

public class Main {

    static void printFibonacciNumbers(int n) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();

        int f1 =rec(number), f2 = rec(number) + rec(number-1), i;


        for (i = 1; i <= n; i++) {
            System.out.print(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }
        static int rec(int n){
            if (n <= 1)
                return n;
            return rec(n-1) + rec(n-2);

    }


    public static void main(String[] args) {
        printFibonacciNumbers(10);


    }
}
