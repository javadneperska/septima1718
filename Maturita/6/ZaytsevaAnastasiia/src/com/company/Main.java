package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Input is not a number.");
            sc.nextLine();
        }
        int a =sc.nextInt();

        if (1<=a  && a<=12){
            if(3<=a  && a<=5){
                System.out.println("Spring");
            }
            if(6<=a  && a<=8){
                System.out.println("Summer");
            }
            if(9<=a  && a<=11){
                System.out.println("Autumn");
            }
            if(a==1  || a==12 || a==2){
                System.out.println("Winter");
            }
        }
        else{
            System.out.println("error");
        }
    }
}
