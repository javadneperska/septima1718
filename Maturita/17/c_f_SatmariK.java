import java.util.Scanner;

public class c_f_SatmariK {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Zadajte teplotu v stupňoch C.");

        float c = in.nextFloat();
        float f = c * (9f / 5) + 32;

        System.out.println(c + " stupňov celzia je : " + f +" stupňov Fahrenheita.");
    }
}