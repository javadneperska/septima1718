package com.google.com;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("first number: ");
        int a = sc.nextInt();
        System.out.println("second number: ");
        int b = sc.nextInt();
        int[] numbers = new int[(b-a+1)/2];

        for (int i = 0; i <= numbers.length; i++) {
            if (a > b) break;

            if ( (a % 2) == 0) {
                numbers[i] = a;
                a++;
            }
            a++;

        }

        System.out.println(Arrays.toString(numbers));

    }


}
