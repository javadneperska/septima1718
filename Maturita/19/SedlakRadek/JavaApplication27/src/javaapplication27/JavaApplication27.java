
package javaapplication27;

import java.util.Scanner;


public class JavaApplication27 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
    double vklad=sc.nextInt();
     double urok = 1.06;
     int rok=20;
    
            
     for (int i = 0; i <= rok; i++ ){
            vklad=vklad*urok;
             System.out.println(vklad);   
    }
    
}
}