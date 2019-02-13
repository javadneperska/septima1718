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
        System.out.println("Zadaj kladne cislo");
        Scanner sc = new Scanner(System.in);
        int cislo = 0;
        if(sc.hasNextInt()){
            cislo = sc.nextInt();
        }
        int sucet = 0;
        if(cislo>1){
            while(cislo>0){
                sucet+=(cislo%10);
                cislo/=10;
            }
            System.out.println(sucet);
        }

    
        }
    }
    

