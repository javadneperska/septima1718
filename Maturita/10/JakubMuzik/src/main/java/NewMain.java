
import java.util.ArrayList;
import java.util.Scanner;


public class NewMain {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
            ArrayList<Integer> list=new ArrayList<Integer> ();
            System.out.println("Write 7 numbers");
            try{
                for (int i = 0; i < 7; i++) {
            
                
                    list.add(s.nextInt());
                }
                
            } catch(Exception exc){
                System.out.println("You didn't pick a number");
                
           
        }
            for(Integer integer: list){
                System.out.print(integer -1 +" ");
            }
   
    }
    
}
