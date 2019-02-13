package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Input is not a number.");
            sc.nextLine();
        }
        for (int i = 0; i < 10; i++) {
            int grade = sc.nextInt();
            while (grade < 0 || grade > 6) {
                System.out.println("Wrong number:");
                grade = sc.nextInt();
            }
            if(grade<5){
                sum++;
            }
        }
        System.out.println(sum);


    }
}
