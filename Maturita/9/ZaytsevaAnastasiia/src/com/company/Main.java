package com.company;

import java.util.Scanner;

public class Main {
    static void g(int n){
        if(n>1){
            System.out.println("*");
            String spaces = "";
            for(int i=0;i<n-2;i++){
                System.out.println("*"+spaces+"*");
                spaces+=" ";
            }
            for(int i=0;i<n;i++) System.out.print("*");
        }
        else System.out.println("*");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
           int n = sc.nextInt();
            g(n);
        }


    }
}
