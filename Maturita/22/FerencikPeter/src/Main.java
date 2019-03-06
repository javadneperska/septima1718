import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args []){
        String cesta ="C:\\Users\\Peter\\Desktop\\output.txt";
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj cislo:");
        if(sc.hasNextInt()) {
            int n = sc.nextInt();

            try {
                FileWriter fw = new FileWriter(cesta);
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i = 0; i < n; i++) {

                    for (int j = 0; j <= n - i; j++) {

                        System.out.print(" ");
                        bw.write(" ");

                    }

                    for (int k = 0; k <= i; k++) {
                        System.out.print("*");
                        bw.write("*");
                    }

                    System.out.println("\n");
                    bw.newLine();

                }
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        else{
            System.out.println("Wrong input!");

        }
    }



}

