import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Payment {
    public static void read (){
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Peter\\Desktop\\input.txt"));
            String line =br.readLine();
            while (line != null) {
                double amount = Double.parseDouble(line);
                double copy = amount;
                double sum = pay(amount);
                if(sum > copy) {
                    CountNotes.countCurrency((sum - copy), copy);
                    System.out.println("WORK");
                }
                else{
                    System.out.println("You have not paid enough!");
                }
                line = br.readLine();
            }

        }
        catch(IOException ex){
            System.out.println("Problem");
        }

    }
    public static double pay (double amount){
        double[] notes = new double[]{ 500, 200, 100, 50, 20, 10, 5};
        int [] noteCounter = new int[7];
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("This is value of all products:" + amount + " €");
        System.out.println("Select number of notes for payment:");
        for (int i = 0; i < noteCounter.length; i++) {
            System.out.println(notes[i]+":");
            noteCounter[i] = sc.nextInt();
             sum += noteCounter[i]*notes[i];



        }
        System.out.println("You paid: "+sum);
        return sum;
    }
}
