package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String slovo = sc.next();
        int length = slovo.length();
        if(length <=5 ){

            System.out.println("Pocet slov je nedostatocni , musi ich byt minimalne 5!");
        }
        else{
            System.out.println(slovo);
            String reverse = new StringBuffer(slovo).reverse().toString();
            System.out.println(reverse);
            System.out.println("Pocet slov je :"+ length);
        }

    }
}


