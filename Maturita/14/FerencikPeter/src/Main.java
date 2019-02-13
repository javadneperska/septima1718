import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


            String word = sc.next();
        if(!isNumeric(word)){
            System.out.println(word + " has " + count_Vowels(word) + " vowels." );
        }
        else{

            System.out.println("Wrong input!!");
            System.exit(1);
        }
    }

    public static int count_Vowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) =='Y') {
                count++;
            }
        }
        return count;
    }
    public static boolean isNumeric(String input)
    {
        try{
            double inputDbl = Integer.parseInt(input);
            return true;
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
    }
}