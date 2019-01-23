/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.dneperska.septima1718.popovic.popovicmaros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
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
        Random rn = new Random();
        int rand;
        int counter=0;
        ArrayList<Integer> nums = new ArrayList<Integer>(20);
        while(counter < 20){
            counter++;
            rand = rn.nextInt(99)+1;
                while(nums.indexOf(rand)!=(-1)){
                    rand = rn.nextInt(99)+1;
                }
            nums.add(rand);
        }

        System.out.println("Zadaj cislo (od 1 do 100)");
        try {
            int z = sc.nextInt();
            if(nums.indexOf(z)!=(-1)){
                System.out.println("Trafil si");
            }else{
                System.out.println("Netrafil si");
            }
        } catch (Exception e) {
            System.out.println("Nezadal si cislo");
        }
        
        System.out.println("\nVygenerovane cisla");
        Collections.sort(nums);
        for (Object num : nums) {
            System.out.print(num+" ");
        }
        
        
        
        
        
    }
    
}
