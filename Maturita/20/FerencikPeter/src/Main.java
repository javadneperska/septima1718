import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        double final_value = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of money");
        int value = sc.nextInt();
        System.out.println("Enter rate");
        double rate = sc.nextDouble();
        System.out.println("Enter number of years");
        int years = sc.nextInt();

        for (int i = 0; i < years; i++) {
            value += value*(rate/100);
             final_value =  value;
        }
        System.out.println("Your money after "+years+" years are: " + final_value + "€");
    }
}
