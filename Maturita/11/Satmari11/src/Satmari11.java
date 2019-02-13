import java.util.*;
public class Satmari11{
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
       
        
        
        for(int i=0 ; i<n ;i++){
            if(i!=0){
                for(int k = 0; k< n * i; k++) {
                    System.out.print(" ");
                }
              }  
                
        
            
            for(int j = 0; j< n; j++){
                System.out.print("#");
            }
            System.out.println("");
        }
     
        }
        
    }

