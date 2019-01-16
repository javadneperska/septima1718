/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spiral;

import java.util.Scanner;

/**
 *
 * @author Žiak
 */
public class Spiral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println(" zadaj cislo:");
         
         Scanner sc = new Scanner(System.in);
         
        int x = sc.nextInt();
        
        
        int[][] spiral = new int[x][x];
        int value = 1;
        int minColumn = 0;
        int maxColumn = x-1;
        int minRovina = 0;
        int maxRovina = x-1;
         
        while (value <= x*x)
        {
            for (int i = minColumn; i <= maxColumn; i++)
            {
                spiral[minRovina][i] = value;
                     
                value++;
            }
             
            for (int i = minRovina+1; i <= maxRovina; i++) 
            { 
                spiral[i][maxColumn] = value; 
                 
                value++; 
            } 
             
            for (int i = maxColumn-1; i >= minColumn; i--)
            {
                spiral[maxRovina][i] = value;
                             
                value++;
            }
             
            for (int i = maxRovina-1; i >= minRovina+1; i--) 
            {
                spiral[i][minColumn] = value;
                 
                value++;
            }
             
            minColumn++;
            minRovina++;
            maxColumn--; 
            maxRovina--;
        }
         
        for (int i = 0; i < spiral.length; i++)
        {
            for (int j = 0; j < spiral.length; j++)
            {
                System.out.print(spiral[i][j]+ "\t");
            }
             
            System.out.println();
        }
    }
}
    
    

