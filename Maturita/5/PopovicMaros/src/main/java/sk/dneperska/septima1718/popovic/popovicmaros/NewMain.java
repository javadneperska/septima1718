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
 System.out.println("Zadaj cislo    ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int delitel = 0;
        boolean prime = true;
        for (int i = 2; i < n/2; i++) {
            if(n%i == 0){
                prime = false;
                delitel = i;
                break;
            }
        }
        if(prime){
            System.out.println(n+" je prvocislo");
        } else {
            System.out.println(n+" je zlozene cislo s najnizsim delitelom "+delitel);
        }
    }
    
}
