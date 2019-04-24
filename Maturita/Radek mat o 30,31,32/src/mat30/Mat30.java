
package mat30;

import java.util.Scanner;


public class Mat30 {

    
    public static void main(String[] args) {
     Scanner sc =new Scanner (System.in);
     
     int x=sc.nextInt ();
     int y=sc.nextInt ();
int d=0;
             if(x>y){
                 d=x;
                 x=y;
                 y= d;      
                 
             }
     int z=sc.nextInt ();
     int b1=x;
          y++;
     
     int [] a=new int[(y-x)] ;
     for(int b = 0;b<(y-x);b++){
        a[b]=b1;
       b1++;
     }
        System.out.println("------------------------");
     for(int c =0;c<a.length;c++){
         if(a[c]%z==0){
             System.out.println(a[c]);
                     fact (a[c]);
         }
     }
         
         
         
     }
       
    static void fact (int input){
         int output=1;
         int x =1;  
        
         for(x=1;x<=input;x++){
             output=output * x;
             
            
             
         }
          System.out.println("Factorial is " +output);
          
          String a=output +"";
          String []c =a.split ("");
          String f="";
          int [] i =new int[a.length ()];
          for(int b=0;b<a.length ( );b++){
              i[b] = Integer.parseInt (c[b]);
          }
          for(int d =0;d<a.length ();d++){
              if(i[d]== 1||i[d]==2||i[d]==3||i[d]==7){
                  f=f+ i[d]+ "";
              }
          }
          System.out.println("tie prime cisla su "+f);
    }
    }  
    
    

        