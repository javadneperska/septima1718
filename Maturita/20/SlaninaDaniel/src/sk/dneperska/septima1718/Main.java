package sk.dneperska.septima1718;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static double input = 0;
    private static double rate = 0;
    private static int years = 0;

    public static void main(String[] args) {
        try {
            System.out.println("Input your savings :) (double) ");
             input = sc.nextDouble();
            System.out.println("input the rate ! (in %) ");
             rate = sc.nextDouble();
            System.out.println(" Input, for how years you want to save money  (int) ");
             years = sc.nextInt();
        } catch (Exception e) {
            System.err.println("Wrong or mismatched input ! ");
            System.exit(-9000);
        }
        rate = 1 + rate / 100;
        System.out.println("Your money after " + years + " years  have raised to " + save(input, rate, years) + "€");
    }

    private static double save(double savings, double rate, int year) {
        double result = savings * rate;
        year--;

        if (year == 0) {
            return result;
        } else {
            return save(result, rate, year);
        }
    }
}
