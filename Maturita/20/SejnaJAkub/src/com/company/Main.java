package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Zadajte vklad, úrok a počet rokov na sporiacom účte");
        double a=sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        double d= (b+100)/100;
        double suma=a*Math.pow(d, c);
        System.out.println("Suma po 20 rokoch" + suma );
    }
    }

