package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String word=sc.nextLine();
	int l=word.length();
	if(l>4) {
        System.out.println(word);
        String sReverse = new StringBuilder(word).reverse().toString();
        System.out.println(sReverse);
        System.out.println(word.length());
    }
    else{
        System.out.println("not enough characters");
    }
    }
}
