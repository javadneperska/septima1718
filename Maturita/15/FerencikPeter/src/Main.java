import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int i = 0;

        while (i <= 100) {

            System.out.print("Enter a number of at least 3 digits: ");


            if (in.hasNextInt()) {
                i = in.nextInt();
            }

           highestdigit(i);


        }
    }
    public static void highestdigit(int n){
        if (n > 0) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            while (n > 0) {
                int digit = n % 10;

                max = Math.max(max, digit);
                min = Math.min(min, digit);

                n /= 10;
            }

            System.out.println(max);
        }


    }
}
