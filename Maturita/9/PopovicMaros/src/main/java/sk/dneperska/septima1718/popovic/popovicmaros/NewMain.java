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
        int n = 0;
        System.out.println("Zadaj cislo");
        if(sc.hasNextInt()){
            n = sc.nextInt();
        } else {
            System.out.println("Nezadal si cislo");
            System.exit(n);
        }
        
        for (int riadok = 1; riadok <= n; riadok++) {
            if(riadok == n){
                for (int i = 0; i < n; i++) {
                    System.out.print("*");
                }
                break;
            }
            System.out.print("*");
            for (int i = 1; i < riadok-1; i++) {
                System.out.print(" ");
            }
            if(riadok>1){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
    }
    
}
