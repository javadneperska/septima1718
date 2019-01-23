import java.util.*;

public class num_Satmari {

    public static void main (String[]args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Zadajte prosim 7 rôznych čísiel : ");

      try {
            for (int i = 0; i < 7; i++) {

                list.add(in.nextInt());

            } //ukončenie for (scanner)
            } //ukončenie try

        catch (Exception e) {
            System.out.println("Nieje možné načítať Vami zadaný vstup, skontrolujte, či ste zadali číslo.");
        } //ukončenie catch Ex. e


        System.out.println("Vami zadané čísla zmenšené o 1 : ");
      
        for (Integer integer : list) { //cyklus na výpis (x-1)
            System.out.print(integer-1+" ");
        } //ukončenie for na výpis čísiel (x-1)


    } //ukončenie main
} // class




