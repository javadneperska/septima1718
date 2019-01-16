package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int fact=1;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+a+" is: "+fact);


    }
}
