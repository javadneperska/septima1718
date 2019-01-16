/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.dneperska.septima1718.popovic.popovicmaros;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj poradie mesiaca  ");
       
        int mesiac;
        
        try{
           mesiac = sc.nextInt();
       
        String stav = "neexistuje.";
        
        if(1 <= mesiac && mesiac <= 12){
           if(3 <= mesiac && mesiac <= 5) {
               stav = "je jarny.";
           } else if(6 <= mesiac && mesiac <= 8){
               stav = "je letny.";
           } else if (9 <= mesiac && mesiac <= 11){
               stav = "je jesenny.";
           } else {
               stav = "je zimny.";
           }
        }
        
        System.out.println("Tento mesiac "+stav);
        
                }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
