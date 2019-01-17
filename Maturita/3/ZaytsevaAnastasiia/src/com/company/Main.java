package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i=0;

        int arr[]=new int[10];
       Scanner sc = new Scanner(System.in);
        for(i=0;i<arr.length;++i)
            arr[i]=sc.nextInt();

        System.out.println("\n\nDivided by 2 or 7: ");
        for (int j=0; j<arr.length; j++) {
            if (arr[j]%2==0 || arr[j]%7==0) System.out.print(arr[j] +"  ");
        }
        System.out.println("\n");

    }
}
