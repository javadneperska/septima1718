/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maturita.pkg22;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Maturita22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
    int i,j,n;
 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of rows");
     
     if (sc.hasNextInt()){
     n = sc.nextInt();
    FileWriter fw = new FileWriter("C:\\Users\\Lenovo\\Desktop\\triangle.txt",true);
   BufferedWriter bw = new BufferedWriter(fw); 
    
 for(i=1;i<=n;i++)
     {
         for(j=i;j<n;j++)
         {
             System.out.print(" ");
             bw.write(" ");
         }
         
         for(j=1;j<=i;j++)
         {
             System.out.print("*");
             bw.write("*");
             
             
         }
         bw.write("");
         bw.newLine();
         System.out.println("\n");
     }

bw.close();
    
    }
     
     else {
         System.out.println("Invalid");
    }
}
}