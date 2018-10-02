
package javaapplication1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class Main {

   
       
        
     
           
      
   
     
        public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println(" načitanie udajov z klavesnice=1");
        System.out.println(" načitanie udajov zo suboru=2");
        
      int choice =sc.nextInt () ;
while(choice <1 || choice>2){
    choice=sc.nextInt();
    
}
        switch (choice) {
            case 1:  
                loadKeyboard();
                     break;
            case 2: 
                loadFile ();
                     break;
           

        
    }
        
      
           }
     static void loadKeyboard(){ 
          Scanner sc=new Scanner(System.in);
          int allnums=0;
           System.out.println("kolko čisel?");
          allnums=sc.nextInt ();
           System.out.println("ake čisla?");
           int nums=0; 
           for (int x = 1; x <= allnums; x++) {
               int input =sc.nextInt();
               
               nums=nums+input;
               
      
    }
     System.out.println(nums);
}
     
 static void loadFile(){
     File file = new File(System.getProperty("user.home") + "//input.txt");
        try{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String nums[] = br.readLine().split(",");
        int sum = 0;
        int plus = 0;
        for(int x = 0;x<nums.length;x++){
            plus = Integer.parseInt(nums[x]);
            sum = sum + plus;
        }
        System.out.println("Sum of these numbers is: " + sum);
        System.exit(0);
        }catch(Exception e){System.out.println(e);}
 }
}