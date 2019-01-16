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
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        System.out.println("Sucet: "+(a+b));
        System.out.println("Rozdiel: "+(a-b));
        System.out.println("Sucin: "+(a*b));
        if(b != 0){
            System.out.println("Podiel: "+(a/b));
        }else{
            System.out.println("Podiel: Nulou sa neda delit");
        }
        
        
    }
    
}
