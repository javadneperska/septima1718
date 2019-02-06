
package pkg12;

import java.util.Scanner;



public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int suma = sc.nextInt();
    //1000
    //500
    int counter;
      int bankovka[] = new int[]{500,200,100,50,20,10,5,2,1};
      for (int i : bankovka) {
          counter=0;
          while(suma>=i){
              suma-=i;
              counter++;
          }
          System.out.println(counter+ "* " + i);
      }
    }
    
    
    
}

        