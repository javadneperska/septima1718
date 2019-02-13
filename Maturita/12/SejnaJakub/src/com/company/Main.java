package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




                Scanner sc = new Scanner(System.in);
                  int suma = sc.nextInt();
                int bankovky[] = new int[]{500,200,100,50,20,10,5,2,1};
                for (int i : bankovky) {
                    while(suma>=i){
                        System.out.println(i+" ");
                        suma-=i;
                    }
                }
            }

        }


