/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.dneperska.septima1718.popovic.popovicmaros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Žiak
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zadaj minimalne trojciferne cislo");
        Scanner sc = new Scanner(System.in);
        int cislo = 0;
        int najvyssie = 0;
        if(sc.hasNextInt()){
            cislo = sc.nextInt();
        }
        if(!(cislo>=100)){
                System.out.println("Chyba");
        } else {
        String str = Integer.toString(cislo);
        int[] cisla = new int[str.length()];
        for (int i = 0; i < str.length(); i++)
        {
            System.out.println(Integer.parseInt(Character.toString(str.charAt(i))));
            
            if((int)str.charAt(i)>najvyssie){
                najvyssie = Integer.parseInt(Character.toString(str.charAt(i)));
            }
          //  cisla[i] = str.charAt(i);
        }
        
        
         /*   for (int i : cisla) {
                System.out.println(i);
                if(i>najvyssie){
                    najvyssie=i;
                }
            }*/
            System.out.println("Najvacsie cislo je "+najvyssie);
    }
        }
    }
    

