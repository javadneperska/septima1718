package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        File f = new File("/Users/jakubsejna/Desktop/trojuhlnik.txt");
        FileWriter fw;
        try {
            fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            Scanner sc = new Scanner(System.in);
            System.out.println("Zadaj pocet riadkov");
            int n = sc.nextInt();
            int count = n;
            String riadok = "";
            for (int i = 0; i < n; i++) {
                for (int j = count-1; j > 0; j--) {
                    System.out.print(".");
                    riadok+=".";
                }
                count--;
                for (int j = 0; j < (n-count); j++) {
                    System.out.print("*");
                    riadok+="*";
                }

                System.out.print("\n");
                riadok+="\n";
                bw.write(riadok);
                riadok = "";
            }

            bw.close();


        } catch (IOException ex) {
        }


    }

}

