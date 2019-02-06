package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static DecimalFormat df2 = new DecimalFormat(".##");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price: ");
        for (int i =0; i<5; i++){
            double n = sc.nextDouble();
            double dph= n*0.2;
            System.out.println("Price: "+ df2.format(n) + " dph: " + df2.format(dph) );
        }


    }
}
