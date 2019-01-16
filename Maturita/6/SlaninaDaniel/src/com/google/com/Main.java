package com.google.com;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("write number of the month ( from 1 to 12 only !) ");
        try {
            int a = sc.nextInt();
            if (a < 1 || a > 12) {
                throw new Exception();
            }

            if (a == 12 || a == 1 || a == 2) {
                System.out.println("Winter");
            } else if (a == 3 || a == 4 || a == 5) {
                System.out.println("Spring");
            } else if (a == 6 || a == 7 || a == 8) {
                System.out.println("Summer");
            } else {
                System.out.println("Autumn");
            }
        } catch (Exception e) {
            System.err.println("Mismatched or wrong input ! ");
            System.exit(0);
        }
    }
}
