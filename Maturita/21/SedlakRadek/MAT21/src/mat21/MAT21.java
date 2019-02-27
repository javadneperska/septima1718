
package mat21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class MAT21 {

   
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader reader = 
  new BufferedReader(new FileReader("C:\\Users\\Žiak\\Documents\\GitHub\\septima1718\\Maturita\\21\\SedlakRadek\\MAT21\\input.txt"));
        
       String s = reader.readLine();
String[] words = s.split("\\s+");
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\Žiak\\Documents\\GitHub\\septima1718\\Maturita\\21\\SedlakRadek\\MAT21\\input.txt",true)));
    
for (int i = 0; i < words.length; i++) {
   
    words[i] = words[i].replaceAll("[^\\w]", "");
    out.println(words[i]);
    //System.out.println(words[i]);
    
    
    }
out.close();

    }
    
}
