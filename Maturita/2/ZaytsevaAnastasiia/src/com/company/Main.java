package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number 1: ");
        int a = sc.nextInt();
        System.out.println("Number 2: ");
        int b = sc.nextInt();
        int i = 0;
        int l, s;
        boolean upToDown = false;
        if (a > b) {
            l = a;
            s = b;
            upToDown = true;
        } else {
            l = b;
            s = a;
        }

        if (upToDown) {
            i = l % 2 == 0 ? l : l - 1;

            while (i - s > 0) {
                System.out.println(i - 2);
                i = i - 2;
            }
        } else {
            i = s % 2 == 0 ? s : s + 1;

            while (l - i > 0) {
                System.out.println(i + 2);
                i = i + 2;
            }

        }
    }
}
