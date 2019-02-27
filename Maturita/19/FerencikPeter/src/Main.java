import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt() || sc.hasNextDouble()) {
            System.out.println("Invalid");
        }
        else{

            String sentence = sc.nextLine();
            String arr[] = sentence.split(" ");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
