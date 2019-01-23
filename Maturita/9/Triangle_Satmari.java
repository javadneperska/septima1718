import java.util.*;

public class Triangle_Satmari {

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
        System.out.println("Napíš číslo (velkosť) : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        triangle(n);
    }  }