package com.company;


import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


                Scanner sc=new Scanner(System.in);
                System.out.println("Zadaj slovo");

                String input=sc.nextLine();
                String inputup=input.toUpperCase();
                int samohlaska=0;


                for(int i=0;i<=inputup.length()-1;i++) {
                    char ch=inputup.charAt(i);
                    if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')) {
                        samohlaska++;
                        continue;
                    }
                }
                System.out.println("Pocet samohlasok v slove ="  +samohlaska);




    }
    }

