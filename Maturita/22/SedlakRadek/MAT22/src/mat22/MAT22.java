
 
package mat22;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MAT22 {

    
    public static void main(String[] args) throws IOException {
      Scanner sc = new Scanner(System.in);
       int i, j;
     int n=sc.nextInt();
     
     
        System.out.println("-------------------------------------------------------------------" );
        BufferedWriter out =new BufferedWriter(new FileWriter("C:\\Users\\Žiak\\Documents\\GitHub\\septima1718\\Maturita\\22\\SedlakRadek\\MAT22\\output.txt",true));
  
        for(i=0; i<n; i++) 
        { 
 
            for(j=2*(n-i); j>=0; j--) 
            { 
                
                System.out.print(" "); 
                out.write(" ");
                
                
            } 
 
            for(j=0; j<=i; j++) 
            { 
                out.write("* "); 
                System.out.print("* "); 
                
               
            } 

            System.out.println();
            out.newLine();
        { 
        }
    }
     out.close();
        

      
        
        
}
 }
    

    
    

