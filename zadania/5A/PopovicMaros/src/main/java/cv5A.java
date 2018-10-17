
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Žiak
 */
public class cv5A {
    
       public static List<Double> cisla = new ArrayList<>();
       public static Scanner sc = new Scanner(System.in);
       
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Stlac 1 pre vlastny vyber \nStlac 2 pre vyber zo suboru\n");
        switch(sc.nextInt()){
            case 1: vlastnyVyber(); break;
            case 2: suborVyber(); break;
        }
    }
    
   // -------------------------
   public static void vlastnyVyber(){
       String riadok;
       System.out.println("Zadavaj cisla, ak chces skoncit zadaj \"x\" ");
       while(!"x".equals(riadok = sc.nextLine())){
           cisla.add(Double.parseDouble(riadok));
       }
       
       scitaj(cisla);
   }
    // -------------------------

    private static void suborVyber() {
        System.out.println("Zadaj meno suboru (napriklad input.csv):");
            try {

            File f = new File(System.getProperty("user.home")+"\\"+sc.nextLine());
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            List<String> items = Arrays.asList(b.readLine().split("\\s*,\\s*"));
            for (String item : items) {
                cisla.add(Double.parseDouble(item));
            }
            scitaj(cisla);
                 } catch (IOException e) {
                     e.printStackTrace();
                   }
        
    }
    // -------------------------
    
    private static void scitaj(List<Double> cisla) {
        double sum = 0;
        for (Double num : cisla) {
            System.out.println(num);
            sum+=num;
        }
        System.out.println("Vysledok je: "+sum);
    }
}
