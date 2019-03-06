package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("output.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
	int n = sc.nextInt();
        for(int y=1;y<=n;y++){
            for(int space=n;space>y;space--) {
                System.out.print(" ");
                bw.write(" ");
            }
            for(int x=1;x<=y;x++) {
                System.out.print("*");
                bw.write("*");
            }
            bw.newLine();
            System.out.println();
        }
        bw.close();


    }
}
