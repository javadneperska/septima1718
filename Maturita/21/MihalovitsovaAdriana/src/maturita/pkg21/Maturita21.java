/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maturita.pkg21;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Lenovo
 */
public class Maturita21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
      File file = 
      new File("C:\\Users\\Lenovo\\Desktop\\text.txt"); 
    Scanner sc = new Scanner(file); 
  
    
    
         if (sc.hasNextInt()) {
             System.out.println("Invalid.");
}

         else { 
          String s = sc.nextLine();
        
String[] arr = s.split(" ");    
FileWriter fw = new FileWriter("C:\\Users\\Lenovo\\Desktop\\text.txt",true);
   BufferedWriter bw = new BufferedWriter(fw);
for ( String ss : arr) {
    bw.newLine();
    bw.write(ss + " ");
         }
bw.close();
    }
   } 
    }
    

