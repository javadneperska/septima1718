package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i=0;

        float arr[]=new float[10];
       Scanner sc = new Scanner(System.in);
        for(i=0;i<arr.length;++i)
            arr[i]=sc.nextFloat();

        System.out.println("\n\nDivided by 2 & 7: ");
        for (int j=0; j<arr.length; j++) {
            if (arr[j]%2==0 || arr[j]%7==0) System.out.print(j +", ");
        }
        System.out.println("\n");

    }
}
