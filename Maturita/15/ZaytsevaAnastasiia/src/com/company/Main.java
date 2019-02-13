package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int r, ld = 0;
        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Print a 3-digit number: ");
        while (!sc.hasNextInt()) {
            System.out.println("Input is not a number.");
            sc.nextLine();
        }
        number=sc.nextInt();
        if (number <= 100) {

            System.out.print("Error");


        } else {



            while (number > 0) {
                r = number % 10;
                if (ld < r) {
                    ld = r;
                }
                number = number / 10;
            }

            System.out.println("\nThe largest digit is :" + ld);
        }
    }
}
