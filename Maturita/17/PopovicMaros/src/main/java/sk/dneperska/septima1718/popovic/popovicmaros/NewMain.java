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
        System.out.println("Zadaj stupne °C ");
        int i = 0;
        while(!sc.hasNextInt()){
            System.out.println("Error");
            System.out.println("Zadaj stupne °C ");
            sc.next();
        }
        i = sc.nextInt();
        System.out.println(i*9/5+32+"°F");
    }
    
}
