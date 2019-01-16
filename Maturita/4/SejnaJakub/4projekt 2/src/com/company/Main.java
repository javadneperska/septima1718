package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, c, fact = 1;

        System.out.println("Vloz cislo na vypocet faktorialu ");
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        if (n < 0)
            System.out.println("Cislo nesmie byť zaporne.");
        else
        {
            for (c = 1; c <= n; c++)
                fact = fact*c;

            System.out.println("Factorial z "+n+" je  "+fact);
    }
}
}
