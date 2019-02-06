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
      //  int suma = sc.nextInt();
      int suma = 1100;
      
      int bankovky[] = new int[]{500,200,100,50,20,10,5,2,1};
        for (int i : bankovky) {
            while(suma>=i){
                System.out.println(i+" ");
                suma-=i;
            }
        }
    }
    
}
