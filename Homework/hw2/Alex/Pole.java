package pkg3d.pole;

import java.util.Random;

public class Pole {
            
    public static void main(String[] args) {
        rnd r = new rnd ();
        int sucet = 0;
        long nasob = 1;
       int [][][] a = new int [3][3][3];
        for (int[][] a1 : a) {
            for (int[] a11 : a1) {
                for (int k = 0; k < a11.length; k++) {
                    a11[k] = r.rando();
                    sucet = sucet + a11[k];
                    nasob = nasob * a11[k];
                }
            }
        }
        System.out.println(sucet);
        System.out.println(nasob);
    }
}
 class rnd{
 int rando(){
     Random rand = new Random();
     int randomn = rand.nextInt (15) + 1;
     return randomn;
    }
    
}
