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
        int a = 0;
        int b = 1;
        int sum =0;
        int i = 0;
        System.out.println("Zadaj cislo, od ktoreho chces zacat");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        while (i<10) {            
            sum = a+b;
            if(sum>=start){
              System.out.println(sum);  
              i++;
            }
            a = b;
            b = sum;
            
        }
            
    }
    
}
