import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    static double[] field = new double [5];
    static double [] tax = new double [5];
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < field.length; i++) {
            if(sc.hasNextDouble()) {
                double a = sc.nextDouble();
                field[i] = truncateDecimal(a, 2).doubleValue();
                tax[i] = field[i] * 0.2;
            }
            else{
                System.out.println("Wrong input!");
                System.exit(1);
            }
        }
        for (int j = 0; j <field.length ; j++) {
            System.out.println("Suma bez dane: "+ field[j] +" Dan: "+ tax[j]);
        }

    }

    private static BigDecimal truncateDecimal(double x,int numberofDecimals)
    {
        if ( x > 0) {
            return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_FLOOR);
        } else {
            return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_CEILING);
        }
    }
}
