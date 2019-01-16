import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println(sum(a, b));
        System.out.println(minus(a, b));
        System.out.println(multiply(a, b));
        System.out.println(division(a, b));
    }

    public static double sum(double a, double b) {
        return a + b;


    }

    public static double minus(double a, double b) {
        return a - b;


    }

    public static double multiply(double a, double b) {
        return a * b;


    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("You can not divide by 0");
            return 0;
        } else {
            return a / b;

        }
    }
 }
