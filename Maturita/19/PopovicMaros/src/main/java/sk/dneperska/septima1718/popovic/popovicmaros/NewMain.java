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
        System.out.println("Zadaj vetu xd");
        Scanner sc = new Scanner(System.in);
        String veta = sc.nextLine();
        String[] rozdelena = veta.split(" ");
        for (String string : rozdelena) {
            System.out.println(string);
        }
    }
    
}
