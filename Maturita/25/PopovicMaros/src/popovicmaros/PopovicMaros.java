/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popovicmaros;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Žiak
 */
public class PopovicMaros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String[] abeceda = {"a","b","c","d","e",
                          "f","g","h","i","j",
                          "k","l","m","n","o",
                          "p","q","r","s","t",
                          "u","v","x","y","z"};
      
      Scanner sc = new Scanner(System.in);
      System.out.print("Zadaj slovo: ");
      String slovo = sc.nextLine();
      int sucet = 0;
      int sucin = 1;
      int index;
      for (String s : slovo.toLowerCase().split("")) {
            index = (Arrays.asList(abeceda).indexOf(s)+1);
            
            if(Arrays.asList(abeceda).contains(s)){
                System.out.println(s+": "+index); 
                sucet += index;
                sucin *= index;    
            }

      }
      
        System.out.println("Sucet: "+sucet);
        System.out.println("Sucin: "+sucin);

    }
    
}
