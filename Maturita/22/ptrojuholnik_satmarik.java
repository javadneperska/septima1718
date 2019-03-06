import static java.awt.PageAttributes.MediaType.C;
import java.io.*;
import java.util.Scanner;

public class ptrojuholnik_satmarik {
        public static void main(String[] args) throws IOException {
            File file = new File("C:\\Users\\Žiak\\Documents\\ptrojuholnik.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            Scanner scn=new Scanner(System.in);
            System.out.print("Zadajte počet * = ");
            int n=scn.nextInt();

            for (int i = 1; i <=n; i++) {
                //_________________________________________
                for (int j = n-i; j >=1; j--) {
                    System.out.print(" ");
                    bw.write(" ");
                }
                //_________________________________________
                for (int k = 1; k <=i; k++) {
                    System.out.print("*");
                    bw.write("*");

                }
                //_________________________________________
                System.out.println("");
                bw.write("\n");
                bw.newLine();
            }

            bw.close();
        }

    }