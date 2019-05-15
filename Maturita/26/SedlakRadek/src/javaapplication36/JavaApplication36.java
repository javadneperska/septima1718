
package javaapplication36;

import java.util.HashMap;
import java.util.Scanner;


public class JavaApplication36 {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      HashMap<String, Integer> studentagrades = new HashMap<String, Integer>();
       HashMap<String, Integer> Passed = new HashMap<String, Integer>();
      boolean k=true;
      int j=0;
      String student="";
      int grades=0;
      while(k== true){
      student=sc.next (); 
      grades=sc.nextInt();
      if(grades<0 || grades >5){
          System.exit(0);
      }
      if(grades == 0){
          k=false;
          
      }
      else{
          studentagrades.put(student,grades);
          if(grades<5){
          Passed.put(student,grades);
          }
         
      }
     
    }
        System.out.println("všetci študenti" +studentagrades);
        System.out.println("ti čo prešli" +Passed);
}
}