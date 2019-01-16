import javafx.scene.paint.RadialGradient;

import java.io.File;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static boolean cont = true;
    public static void main(String[] args){
        //Decision.decide();
        final File folder = new File("C:\\Users\\Peter\\Desktop\\Specifikacie");
        Decision.listFilesForFolder(folder);
        //System.out.println(Arrays.asList(Decision.sklad));
        while(cont) {
            System.out.println("Choose component you want to buy:");
            System.out.println(Decision.sklad.keySet());
            Scanner sc = new Scanner(System.in);
            String option = sc.next();
            // skontrolovat ci nezadal blbost
            if (Decision.sklad.containsKey(option)) {
                //  System.out.println(Decision.sklad.get(option));
                /*for (String a : Decision.sklad.get(option)) {
                    System.out.println(a);
                }*/
                System.out.println("Choose type of Component:");
                Set<String> Comp_types = new HashSet<String>();
                for (String riadok : Decision.sklad.get(option)) {
                    riadok = riadok.split(",")[2];
                    if (riadok.equals("Typ")) {
                        // System.out.println("SAved");
                    } else {
                        Comp_types.add(riadok);
                    }
                }
                System.out.println(Comp_types);
                String chosen_type = sc.next();

                for (String riadok : Decision.sklad.get(option)) {
                    if (riadok.split(",")[2].equals(chosen_type)) {//16,DDR4,3000,136,2002
                        System.out.println(riadok);
                    }
                }
                System.out.println("Please, enter ID of component that you want to buy: (if you don't want to buy anything n )");
                String chosen_ID = sc.next();
                for (String riadok : Decision.sklad.get(option)) {
                    //riadok = riadok.split(",")[0];
                    if (riadok.split(",")[0].equals(chosen_ID)) {
                        Decision.final_prize = Decision.final_prize + Double.parseDouble(riadok.split(",")[1]);

                    }
                }

                //
            } else {
                System.out.println("This type of component is not available!");
            }
            System.out.println("Prize of item in basket: " +Decision.final_prize);
            System.out.println("Do you want to continue?(y/n)");
            Scanner s = new Scanner(System.in);
            String a = s.next();
            if(a.equals("y")){
                cont = true;
            }
            else {
                cont = false;
            }

        } //koniec while
        System.out.println("Your final prize for components is:"+ Decision.final_prize);
        System.out.println("Thanks for using program");
    } // koniec main
}
