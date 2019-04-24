package com.company;
import java.util.Scanner;

/*
int a;
int b;
Scanner s = new Scanner(System.in)
System.out.prinln(Zadajte dva čísla);
a=s.nextInt();
b=s.nextInt();

System.out.println(delkitel);

int x = s.nextInt();
if(a % x == 0){
*/

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
                int a = 0;
                int z = 0;
                int delitel = 0;
//========================================================================
        System.out.print("Minimalne číslo: ");
                if(sc.hasNextInt()){
                 a = Integer.parseInt(sc.next());
        }
        else {
        System.out.println("Chybný vstup!");
        }
//========================================================================
        System.out.print("Maximálne číslo: ");
                 if(sc.hasNextInt()){
                  z = Integer.parseInt(sc.next());
        }
        else {
        System.out.println("Chybný vstup!");
        }
//========================================================================
        if(a>z){
            delitel = a;
            a = z;
            z = delitel;
        }
//========================================================================
        System.out.print("Zadajte hodnotu deliteľa: ");
                 if(sc.hasNextInt()){
                 delitel = Integer.parseInt(sc.next());
        }
        else {
        System.out.println("Chybný vstup!");
        }
//========================================================================
        System.out.println("");

                for (int i = a; i <= z; i++) {
                        if(i%delitel == 0){
                        System.out.print(i+" ");

                        int fact=1;
                        int cislo=i;
                        for(i=1;i<cislo;i++){
                            fact= fact * i;
                        }
                        System.out.println(" ..... Faktorial čísla : "+cislo+" je : "+fact);

            }}}}