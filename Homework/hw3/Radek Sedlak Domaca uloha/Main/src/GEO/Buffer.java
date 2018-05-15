
package GEO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Buffer {
   public String [][] pole   =new String[4][4];
    private String savingPoint;
   public void readFile() throws FileNotFoundException {
       
           Scanner sc=new Scanner(new BufferedReader(new FileReader("input.txt")));
           while (sc.hasNextLine()) {
               for (String[] pole1 : pole) {
                   String[] line =  sc.nextLine().trim().split(",");
                   for (int j = 0; j<line.length; j++) {
                       pole1[j] = line[j];
                   }
                    for(int k = 0; k< pole.length; k++){
                        for(int l = 0; l< pole.length; l++){
                            if(pole[k][l]== null){
                                pole[k][l]="0";
                            }            
                        }
                    }
                }
       }
    }
    public void write(int i ,double obvod, double obsah) throws IOException {
        PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("output.txt",true)));
        savingPoint = pole[i][0];
        out.println(savingPoint+"," + obvod + "," + obsah);
        out.flush();
    
   
}

}
