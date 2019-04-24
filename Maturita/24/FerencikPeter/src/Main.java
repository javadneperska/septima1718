import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String args[]) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Zadajte cislo x:");
            double x = sc.nextDouble();
            System.out.println("Zadajte cislo y:");
            double y = sc.nextDouble();
            if (x < y) {
                int[] range = IntStream.rangeClosed((int) x, (int) y).toArray();
                System.out.println("Zadajte delitela:");
                int a = sc.nextInt();
                if (a <= 0) {
                    System.out.println("Neplatny delitel");
                } else {
                    for (int i = 0; i < range.length; i++) {
                        if (range[i] % a == 0) {
                            if(range[i]>= 0){
                                if(Prime_number.prime(Factorial.factorial(range[i])) == false){
                                    System.out.println(Factorial.factorial(range[i]));
                                }
                            }
                        }
                    }
                }
            }
            else{

                int[] range = IntStream.rangeClosed((int) y, (int) x).toArray();
                System.out.println("Zadajte delitela:");
                int a = sc.nextInt();
                if (a <= 0) {
                    System.out.println("Neplatny delitel");
                } else {
                    for (int i = 0; i < range.length; i++) {
                        if (range[i] % a == 0) {
                            if(range[i]>= 0){
                              if(Prime_number.prime(Factorial.factorial(range[i])) == false){
                                  System.out.println(Factorial.factorial(range[i]));
                              }
                            }
                        }
                    }
                }
            }


        }
        catch(Exception ex){
            System.out.println("Zly format cisla");
        }

    }

}
