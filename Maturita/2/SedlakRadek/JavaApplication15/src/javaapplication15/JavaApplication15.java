
package javaapplication15;

import java.util.Scanner;


public class JavaApplication15 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("zadaj cislo od ktoreho zacat");
     int x=sc.nextInt();
        System.out.println("zadal cislo do ktoreho ma skoncit");
     int limit = sc.nextInt();
		
	System.out.println("vsetky parne cisla " + limit);
		
	for(int i=x; i <= limit; i++){
			
	
	if( i % 2 == 0| i%7== 0){
	System.out.print(i  " ");
        
        
        
        
        
    }
    }
}
}