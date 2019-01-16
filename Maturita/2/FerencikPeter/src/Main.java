import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] elements = IntStream.rangeClosed(a,b).toArray();

        for (int i = 0; i < elements.length; i++) {
            if((elements[i] % 2) == 0 ){
                System.out.println(elements[i]);

            }
            else{

            }
        }


    }
}

