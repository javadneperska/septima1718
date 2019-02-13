package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.print("Vloz stupne Celzia: ");
        celsius = sc.nextDouble();
        fahrenheit = 32 + (celsius * 9 / 5);
        System.out.println(celsius +" ºC = " + fahrenheit + " ºF");
    }
}

