package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] notes = new int[]{500, 200, 100, 50, 20, 10, 5, 1};
        int[] num = new int[8];
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) sc.next();
        int number = sc.nextInt();
        for (int i = 0; i < 8; i++) {
            if (number >= notes[i]) {
                num[i] = (int) (number / notes[i]);
                number = number - num[i] * notes[i];
            }
            if (num[i] != 0) {
                System.out.println(notes[i] + " -  "
                        + num[i]+ "x");
            }


        }

}
}
