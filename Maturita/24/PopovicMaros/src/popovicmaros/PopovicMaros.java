/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popovicmaros;

import java.util.Scanner;

/**
 *
 * @author Žiak
 */
public class PopovicMaros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int start = 0;
        int end = 0;
        int divide = 0;
        
        System.out.print("start value: ");
        if(sc.hasNextInt()){
            start = Integer.parseInt(sc.next());
        } else {
            System.out.println("Input error");
        }
        
        System.out.print("end value: ");
        if(sc.hasNextInt()){
            end = Integer.parseInt(sc.next());
        } else {
            System.out.println("Input error");
        }
        
        System.out.print("divider value: ");
        if(sc.hasNextInt()){
            divide = Integer.parseInt(sc.next());
        } else {
            System.out.println("Input error");
        }
        
        System.out.println("");
        
        for (int i = start; i <= end; i++) {
            if(i%divide == 0){
                System.out.print(i+" ");
            }
        }
    }
    
}
