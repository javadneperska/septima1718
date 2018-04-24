/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3darray;

import java.util.Random;

/**
 *
 * @author Maroš
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int[][][] nums = new int[2][3][4];
        System.out.println(nums.length);        //y
        System.out.println(nums[0].length);     //x
        System.out.println(nums[0][0].length);  //z
        double vysledokNasobenia = 1;
        int vysledokScitania = 0;
        
        for (int y = 0; y < nums.length; y++) {
                    for (int x = 0; x < nums[y].length; x++) {
                                for (int z = 0; z < nums[y][x].length; z++) {
                                         nums[y][x][z] = r.nextInt(15)+1;
                                         vysledokNasobenia *= nums[y][x][z];
                                         vysledokScitania += nums[y][x][z];
                                }
                    }
        }
        
        System.out.println("Scitanie: "+vysledokScitania);
        System.out.println("Nasobenie: "+vysledokNasobenia);
        

    }
    
}
