package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum=0;
        System.out.println("Input positive number: ");
        while (!sc.hasNextInt()) {
            System.out.println("Input is not a number.");
            sc.nextLine();
        }

        int number =sc.nextInt();
        while(number>0){
            sum = sum + number % 10;
            number = number / 10;


        }
        System.out.println(sum);

        }
    }

