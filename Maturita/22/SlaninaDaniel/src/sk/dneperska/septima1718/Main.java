package sk.dneperska.septima1718;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int input;
    private static String output = "";

    public static void main(String[] args) {
        try {
            System.out.println("Input length of triangle (INTEGER)");
            input = sc.nextInt();
        } catch (Exception e) {
            System.err.println("Missmatched or wrong input !");
            System.exit(-404);
        }

        stars(input);
        writeToFile(output);

    }

    private static void stars(int n) {

        for (int row = 1; row <= n; row++) {

            for (int i = 0; i < n - row; i++) {
                output += " ";
                System.out.print(" ");

            }

            for (int column = row; column >= 1; column--) {
                output += "*";
                System.out.print("*");
            }
            output += "\n";
            System.out.println();
        }
    }

    private static void writeToFile(String input) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            bw.write(input);
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.err.println("Error ! ");
            System.exit(999);
        }
    }
}
