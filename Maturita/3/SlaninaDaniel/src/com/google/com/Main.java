package com.google.com;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    private static int j = 0;
    private static int count = 0;

    public static void main(String[] args) {
        System.out.println("write numbers, after each one press enter !");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();

            if (((numbers[i] % 2) == 0) || ((numbers[i] % 7) == 0)) {
                count++;
            }
        }
        int[] finalNumbers = new int[count];
        for (int number : numbers) {
            if (((number % 2) == 0) || ((number % 7) == 0)) {

                finalNumbers[j] = number;
                j++;
            }
        }


        System.out.println("Numbers added ! ");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Numbers after checking : ");
        System.out.println(Arrays.toString(finalNumbers));
}
}
