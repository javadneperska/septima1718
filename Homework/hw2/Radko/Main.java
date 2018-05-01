package pkg3darray;
import java.util.Random;
/**
 *
 * @author rado
 */
public class Main {  
    public static void main(String[] args) {
        Rand r = new Rand ();
        int sucet = 0;
        long nasob = 1;
        int [][][] a = new int [3][3][3];
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                for(int k = 0;k<a[i][j].length;k++){
                    a[i][j][k] = r.random();
                    sucet = sucet + a[i][j][k];
                    nasob = nasob*a[i][j][k];
                }
            }
        }
        System.out.println("Súčet: " + sucet + "\n" + "Násobok: " + nasob);
    }
}
 class Rand{
 int random(){
     Random ran = new Random();
     int randomn = ran.nextInt (15) + 1;
     return randomn;
    }  
}