package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



                Scanner in = new Scanner(System.in);
                int n;
                int a=0;
                System.out.print("Zadaj kladne čislo: ");
                n = in.nextInt();

                if (n <= 0)
                    System.out.println("Zadal si zaporne čislo , čislo musi byť kladne.");
                else {
                    int sum = 0;

                    while (n != 0) {

                        a=n%10;
                        n=n/10;
                        sum=sum+a;
                    }
                    System.out.println("Sučet čisel: " + sum);
                }
            }
        }


