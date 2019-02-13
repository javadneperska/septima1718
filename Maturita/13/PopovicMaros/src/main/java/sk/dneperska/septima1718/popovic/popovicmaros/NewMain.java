/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.dneperska.septima1718.popovic.popovicmaros;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Žiak
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cena;
        try{
            for (int i = 1; i <= 5; i++) {
                System.out.println("("+i+") Zadaj cenu: ");
                cena = sc.nextDouble();
                if(maDveDesatinneMiesta(cena)){
                    System.out.println("Cena bey DPH: "+cena);
                    System.out.println("Cena s 20% DPH: "+pridajDPH(cena));
                 //   System.out.println("DPH: "+(pridajDPH(cena)-cena)*100);
                } else {
                    System.out.println("chyba");
                }
                
            } 
        }catch(Exception ex){
            System.out.println(ex);
        }

        
    }

    private static boolean maDveDesatinne(double cena) {
        cena *=100;
        if(cena == Math.floor(cena)){
            return true;
        }
        System.out.println("Cislo nie je desatinne");
        System.out.println(cena);
        System.out.println(Math.floor(cena));
       return false;
    }
    
    private static boolean maDveDesatinneMiesta(double cena) {
        String str = Double.toString(cena).split(Pattern.quote("."))[1];
        if(str.length() <= 2){
            return true;
        }
        return false;
    }

    private static double pridajDPH(double cena) {
        return Math.ceil(cena*1.2*100)/100;
    }
    
}
