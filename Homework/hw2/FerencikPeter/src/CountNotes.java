import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountNotes {
  // static  double amount = 1964.89;
    public static void main(String args[]) {
        Payment.read();

    }


    public static void countCurrency(double amount, double copy)
    {
        double[] notes = new double[]{ 500, 200, 100, 50, 20, 10, 5,1};
        double[] coins = new double[]{0.5,0.2,0.1,0.05,0.02,0.01};
        int [] noteCounter = new int[8];
        int[] coinCounter = new int[6];
            System.out.println("We have to give you back:");

            for (int i = 0; i < 8; i++) {
                if (amount >= notes[i]) {
                    noteCounter[i] = (int) (amount / notes[i]);
                    amount = amount - noteCounter[i] * notes[i];
                }
            }
            for (int a = 0; a < 6; a++) {
                if (amount >= coins[a]) {
                    coinCounter[a] = (int) (amount / coins[a]);
                    amount = amount - coinCounter[a] * coins[a];
                }
            }
            // Print notes
            System.out.println("Currency Count ->");
            for (int i = 0; i < 8; i++) {
                if (noteCounter[i] != 0) {
                    System.out.println(notes[i] + " : "
                            + noteCounter[i]);
                }
            }
            for (int i = 0; i < 6; i++) {
                if (coinCounter[i] != 0) {

                       System.out.println(coins[i] + " : "
                                + coinCounter[i]);

                }
            }
           

    }
}
