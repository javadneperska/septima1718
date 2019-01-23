package com.company;

import java.util.Scanner;

public class Main {
    public static int array[] = new int[7];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        for (int i = 0; i < 7; i++) {

            array[i] = sc.nextInt();
        }

        System.out.println("Numbers before changes : ");
        for (int i = 0; i < 7; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Numbers after changes : ");
        changes();


    }

    private static void changes() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] - 1);
            System.out.println(array[i]);
        }

    }

}
