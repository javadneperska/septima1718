package sk.dneperska.septima1718;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input your savings :) (double) ");
        double input = sc.nextDouble();
        System.out.println("input the rate ! (in %) ");
        double rate = sc.nextDouble();
        System.out.println(" Input, for how years you want to save money  (int) ");
        int years = sc.nextInt();
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
