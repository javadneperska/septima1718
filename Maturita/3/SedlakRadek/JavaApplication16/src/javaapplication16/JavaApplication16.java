
package javaapplication16;

import java.util.Scanner;


public class JavaApplication16 {

    


   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int[] x= new int [10] ;
       
   
		
	
		
	for(int i=0; i < 10; i++){
                     x[i]  = sc.nextInt();
	}
        
        for (int  n : x)
	if( n % 2 == 0|| n%7== 0){
	System.out.print(+n+ " ");
    }
    
}
    }

