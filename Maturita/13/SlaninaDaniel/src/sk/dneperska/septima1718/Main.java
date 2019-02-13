package sk.dneperska.septima1718;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static double prices[] = new double[5];

    public static void main(String[] args) {
        System.out.println("Input 5 prices (put enter after each one !) ");
        inputLoad();

        for (double price : prices) {
            double tax = calcTax(price);
            System.out.println("Price is -> " + price + "€  and tax is -> " + tax +"€");
        }
    }

    private static void inputLoad() {
        try {
            for (int i = 0; i < prices.length; i++) {
                double input = sc.nextDouble();
                 input = Math.round(input*100);
                 input = input/100;
                prices[i] = input;
            }
        } catch (Exception e) {
            System.err.println("Wrong or mismatched input ! ");
            System.err.println("Next time follow the instructions ! ");
            System.exit(1);
        }
    }

    private static double calcTax(double inputPrice) {
        double result = (inputPrice * 1.20) - inputPrice;
        result = Math.round(result*100);
        result = result/100;
        return result;
    }
}
