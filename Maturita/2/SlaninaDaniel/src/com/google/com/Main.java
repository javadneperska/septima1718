package com.google.com;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int count;
    private static int j = 0;

    public static void main(String[] args) {
        System.out.println("first number: ");
        int a = sc.nextInt();
        System.out.println("second number: ");
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if ((i % 2) == 0) {
                count++;
            }
        }
        int[] numbers = new int[count];
        for (int i = 0; i < b; i++) {
            if ((a % 2) == 0) {
                numbers[j] = a;
                j++;
            }
            a++;
        }
        System.out.println(Arrays.toString(numbers));

    }


}
