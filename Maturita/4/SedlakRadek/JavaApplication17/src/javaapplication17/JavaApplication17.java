
package javaapplication17;

import java.util.Scanner;


public class JavaApplication17 {

    
    public static void main(String[] args) {
        System.out.println("zadaj cislo od ktoreho chces faktorial");
       Scanner sc = new Scanner(System.in);
       
          int i,fact=1;  
  int number=sc.nextInt();   
  for(i=1;i<=number;i++){    
      fact=fact*i;    
      
    }
        System.out.println(fact);
}
}
