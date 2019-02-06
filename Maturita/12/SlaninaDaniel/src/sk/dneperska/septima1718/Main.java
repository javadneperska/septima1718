package sk.dneperska.septima1718;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int input;
    private static  int[] eur = new int[]{ 500, 200, 100, 50, 20, 10, 5,2,1};
    private static int outputPrice = 0;
    private static String output = "";

    public static void main(String[] args) {
        System.out.println("Input (INTEGER) : ");
        try {
            input = sc.nextInt();
        } catch (Exception e) {
            System.err.println("NOT A INTEGER !!");
            System.exit(1);
        }

        for (int i = 0; i < eur.length; i++) {
            if (input >= (outputPrice + eur[i])){
                outputPrice += eur[i];
                output += ", "+eur[i];
                i--;
            }
        }
        output = output.substring(1);
        System.out.println("output -> " );
        System.out.println(output);
    }
}
