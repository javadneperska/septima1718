import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextDouble()){
            double celsius = sc.nextDouble();
            System.out.println("Farenheit:"+ convert(celsius));
        }
        else{
            System.out.println("Wrong input!!");
        }


    }
    public static double convert(double c){
        double f = (c *1.8)+32 ;

        return f;


    }
}
