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
        System.out.println("Zadaj rozpatie");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("____________");
        for (int i = a; i <= b; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    
}
