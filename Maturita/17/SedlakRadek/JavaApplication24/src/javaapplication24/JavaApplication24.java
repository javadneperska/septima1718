
package javaapplication24;

import java.util.Scanner;


public class JavaApplication24 {

  
    public static void main(String[] args) {
    

     try {       
      Scanner sc = new Scanner(System.in);
      double celsium=sc.nextDouble();
      double farenheit=(celsium*1.8)+32;
         System.out.println("konverzia:      " + farenheit);
    }
     catch(Exception e) {
         System.out.println("zly input");
}
    }
}
