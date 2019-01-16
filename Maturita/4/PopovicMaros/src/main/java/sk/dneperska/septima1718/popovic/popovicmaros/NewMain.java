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
        System.out.println("Zadaj nezaporne cislo x \n");
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        if(f>0){
            double sum = 1;
            for (int i = f; i > 0; i--) {
                sum *= i;
            }
            System.out.println("x!= "+sum);  
        } else {
            System.out.println("Je potrebne zadat nezaporne cislo");
        }

        
        
    }
    
}
