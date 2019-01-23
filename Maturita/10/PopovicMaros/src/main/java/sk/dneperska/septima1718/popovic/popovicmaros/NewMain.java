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
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Zadaj 7 cisel");
        try {
        for (int j = 0; j < 7; j++) {
            
                list.add(sc.nextInt());

        }
            } catch (Exception e) {
                System.out.println("Nezadal si cislo");
            }
        for (Integer integer : list) {
            System.out.print(integer-1+" ");
        }
        
    }
    
}
