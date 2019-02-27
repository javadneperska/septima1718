
package muzikjakub;

import static java.awt.PageAttributes.MediaType.C;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class MuzikJakub {


    public static void main(String[] args) throws FileNotFoundException, IOException {
        try{
        File file= new File ("C:\\Users\\Žiak\\Documents\\input.txt");
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        String sentence=br.readLine();
            System.out.println(sentence);
            
            FileWriter fw=new FileWriter(file);
            BufferedWriter bw=new BufferedWriter(fw); 
            
            String[] words = sentence.split(" ");
             bw.write(sentence+"\n");
            for (String string : words) {
                bw.write(string+"\n");
            }
            bw.close();
            
            System.out.println("DONE");
        } catch (Exception e) {
        }
    }
        
    }

