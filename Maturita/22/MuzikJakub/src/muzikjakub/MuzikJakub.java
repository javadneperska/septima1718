package muzikjakub;

import static java.awt.PageAttributes.MediaType.C;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class MuzikJakub {


    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\Žiak\\Documents\\triangle.txt");
        
        FileWriter fw=new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fw);
                
        Scanner sc=new Scanner(System.in);
        System.out.println("Zadajte veľkosť trojuholníka");
int rows =sc.nextInt();

        for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= i; ++j) {
                bw.write("*");
            }
           bw.write("\n");
        }
        bw.close();
    }
    
}
