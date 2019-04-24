import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadajte cislo x:");
        double x = sc.nextDouble();
        System.out.println("Zadajte cislo y:");
        double y = sc.nextDouble();
        int[] range = IntStream.rangeClosed((int)x, (int)y).toArray();
        System.out.println("Zadajte delitela:");
        int a = sc.nextInt();
        if(a <= 0){
            System.out.println("Neplatny delitel");
        }
        else{
            for (int i = 0; i < range.length; i++) {
                if (range[i] % a == 0) {
                    System.out.println(range[i]);
                } else {

                }
            }
        }
    }

}
