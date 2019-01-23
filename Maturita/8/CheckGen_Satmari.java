import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class CheckGen_Satmari {

    public static void main(String[] args) {


        ArrayList<Integer> cisla = new ArrayList<Integer>();
        Random rndgen = new Random();

        while (cisla.size() < 21) {


            int random = rndgen.nextInt(100);

            if (!cisla.contains(random)) {
                cisla.add(random);
            }
        }

        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int cislo = sc.nextInt();


            if (cisla.contains(cislo)) {
                System.out.println("Áno, číslo sa nachádza v ArrayListe :).");


            } else {
                System.out.println("Nie, číslo sa nenachádza v ArrayListe :(.");
 }}}}