import java.util.Scanner;

public class Main {
    public static void main(String [] args){
     leftTriangle();


    }
    public static void leftTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many rows: ");


        if (input.hasNextInt()) {
            int rows = input.nextInt();
            for (int x = 1; x <= rows; x++) {
                for (int i = 1; i <= x; i++) {
                    if (i == x || x == rows || x == 1 || i == 1) {
                        System.out.print("*");
                    } else {

                        System.out.print(" ");

                    }
                }
                System.out.println("");
            }
        }
        else{

            System.out.println("Invalid");
        }
    }

}
