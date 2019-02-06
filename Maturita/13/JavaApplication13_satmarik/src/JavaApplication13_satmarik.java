import java.text.*;
import java.util.*;

public class JavaApplication13_satmarik {
        public static DecimalFormat decf = new DecimalFormat(".##");
        
        
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadajte sumu na výpočet dane : ");

        for (int i =0; i<5; i++){
            double a = sc.nextDouble();
            double daň= a*0.2;
            double cena = a+daň;

            System.out.println("Cena produktu : "+ decf.format(a) + "€ + daň z ceny : " + decf.format(daň)+"€" );
            System.out.println("Cena produktu s DPH : " + cena + " €");
        }





    }

}