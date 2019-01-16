
package javaapplication17;

import java.util.Scanner;


public class JavaApplication17 {

    
    public static void main(String[] args) {
        System.out.println("zadaj cislo od ktoreho chces faktorial");
       Scanner sc = new Scanner(System.in);
       
          int i,factorial=1;  
  int number=sc.nextInt();   
  for(i=1;i<=number;i++){    
      factorial=factorial*i;    
      
    }
        System.out.println(factorial);
}
}
