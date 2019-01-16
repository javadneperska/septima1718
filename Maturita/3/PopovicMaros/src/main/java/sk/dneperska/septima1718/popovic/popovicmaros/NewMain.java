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
        int[] nums = new int[10];
        
        System.out.println("Cisla splnajuce podmienky su:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Zadaj "+(i+1)+". cislo");
            nums[i] = sc.nextInt();
        }
        
        for (int n : nums) {
            if(n%2==0 || n%7==0){
                System.out.println(n);
            }
        }
    }
    
}
