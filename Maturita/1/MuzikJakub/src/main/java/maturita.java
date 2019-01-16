import java.util.Scanner;


public class maturita {


    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
   double a=sc.nextDouble();
           double b=sc.nextDouble();
        double sucet=a+b;
        System.out.println("Sucet týchto 2 čísel je : " + sucet);
        
        double rozdiel= a-b;
        System.out.println("Rozdiel týchto dvoch čísel je : " + rozdiel);
        
        double sucin= a*b;
        System.out.println("Súčin týchto dvoch čísel je : " + sucin);
        
        double podiel=a/b;
        System.out.println("Podiel týchto dvoch čísel je : " + podiel);
    }
    
}
