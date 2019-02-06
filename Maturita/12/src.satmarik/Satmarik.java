import java.util.*;

public class Satmarik {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Napíšte ľubovoľnú sumu : ");

        if(sc.hasNextDouble()){
            int suma = sc.nextInt();
            int prm = suma;
            scitajSumu(suma,prm);
            }

        else{
            System.out.println("Neplatný vstup!");
            }
            }

        public static void scitajSumu(int suma, int prm)
            {

        int[] bankovky = new int[]{ 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int [] bankovkyX = new int[9];
        



        for (int i = 0; i < 9; i++) {
            if (suma >= bankovky[i]) {
                bankovkyX[i] = (int) (suma / bankovky[i]);
                suma = suma - bankovkyX[i] * bankovky[i];

            }
            }

            System.out.println("Vypíš počet bankoviek : ->");

            for (int i = 0; i < 9; i++) {
                if (bankovkyX[i] != 0) {
                System.out.println(bankovky[i] + " : " + bankovkyX[i]);

            }}
}}