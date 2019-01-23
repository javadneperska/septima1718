
package trojuholnikpravo;

import java.util.Scanner;


public class Trojuholnikpravo {
    
 public static void triangle(int n){

        if(n>1){
            System.out.println("*");
            String medzery = "";
            for(int i=0;i<n-2;i++){
                System.out.println("*"+medzery+"*");
                medzery+=" ";
            }
            for(int i=0;i<n;i++)

                System.out.print("*");
            }
           else System.out.println("*");
}
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Napíš číslo (velkosť) : ");
        
        int n=sc.nextInt();
triangle(n);
    }
    
}
