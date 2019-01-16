
package javaapplication19;

import java.util.Scanner;


public class JavaApplication19 {

    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        
         try {
             int n=sc.nextInt();
           if( n  < 0|| n>12 ){
             throw new Exception();
            }
        
        if( n  == 1|| n== 2|| n== 12){
	System.out.print( " tento mesiac je zimny mesiac");
        }
           if( n  == 3|| n== 4|| n== 5){
	System.out.print( " tento mesiac je jarny mesiac");
        }
           if( n  == 6|| n== 7|| n== 8){
	System.out.print( " tento mesiac je letny mesiac");
        }
           if( n  == 9|| n== 10|| n== 11){
	System.out.print( " tento mesiac je jesenny mesiac");
        }
      } catch (Exception d) {

            System.err.println("zly input ! ");

            System.exit(0);

             }      
          } }
    
    

