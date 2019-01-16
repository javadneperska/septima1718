
import java.util.Scanner;


public class NewMain {


    public static void main(String[] args) {
        System.out.println("Choose a month in order");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       if(1<= a && a <=12){
            if(3<= a && a <=5){
                
                System.out.println("Spring");;
            }
            else if(6<= a && a <=8){
                
                System.out.println("Summer");;
            }
            else if(9<= a && a <=11){
                
                System.out.println("Autumn");;
            }
            else {
                
               
                System.out.println("Winter");;
            }
        }
    }
    
}
