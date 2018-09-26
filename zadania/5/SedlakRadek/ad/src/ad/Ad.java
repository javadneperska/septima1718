/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ad;

import java.util.Scanner;

/**
 *
 * @author Žiak
 */
public class Ad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("1= načitanie udajov z klavesnice");
        System.out.println("2= načitanie udajov zo suboru");
        
      int choice =sc.nextInt () ;
while(choice <1 || choice>2){
    choice=sc.nextInt();
    
}
        switch (choice) {
            case 1:  
                loadKeyboard();
                     break;
            case 2: 
                loadFile ();
                     break;
           

        
    }
        
      
           }
     static void loadKeyboard(){ 
          Scanner sc=new Scanner(System.in);
          int allnums=0;
           System.out.println("kolko čisel?");
          allnums=sc.nextInt ();
           System.out.println("ake čisla?");
           int nums=0; 
           for (int x = 1; x <= allnums; x++) {
               int input =sc.nextInt();
               nums=nums+input;
              
       }
}
    }
    

