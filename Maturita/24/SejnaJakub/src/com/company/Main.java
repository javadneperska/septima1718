package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = 0;
        int end = 0;
        int divide = 0;

        System.out.print("Zadajte začiatočné číslo: ");
        if(sc.hasNextInt()){
            start = Integer.parseInt(sc.next());
        } else {
            System.out.println("NONE");
        }

        System.out.print("Zadajte koncové číslo: ");
        if(sc.hasNextInt()){
            end = Integer.parseInt(sc.next());
        } else {
            System.out.println("NONE");
        }



        System.out.print("Zadajte deliteľa: ");
        if(sc.hasNextInt()){
            divide = Integer.parseInt(sc.next());
        } else {
            System.out.println("NONE");
        }

        System.out.println("");

        if(start>end){
            divide = start;
            start = end;
            end = divide;
        }

        for (int i = start; i <= end; i++) {
            if(i%divide == 0){
                System.out.print(i+" ");

                int fact=1;
                int number=i;
                for(i=1;i<=number;i++){
                    fact=fact*i;
                }
                System.out.println("Factorial of "+number+" is: "+fact);

                int num = fact;
                boolean flag = false;
                for(int b = 2; i <= num/2; ++i)
                {
                    if(num % b == 0)
                    {
                        flag = true;
                        break;
                    }
                }

                if (!flag)
                    System.out.println(num + " is a prime number.");
                else
                    System.out.println(num + " is not a prime number.");
            }
        }

    }

}