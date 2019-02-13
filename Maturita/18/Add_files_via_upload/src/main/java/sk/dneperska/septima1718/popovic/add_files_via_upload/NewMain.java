/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.dneperska.septima1718.popovic.add_files_via_upload;

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
        int[] znamky = new int[10];
        Scanner sc = new Scanner(System.in);
        int znamka;
        for (int i = 0; i < 10; i++) {
            if(!sc.hasNextInt()){
                System.out.println("NAN");
                System.exit(i);
            }
            znamka = sc.nextInt();
            if(znamka >5 || znamka <1){
                System.out.println("Toto nie je znamka");
                System.exit(i);
            } else {
                
            znamky[i] = znamka;
            
            }
        }
        int counter =0;
        for (int i : znamky) {
            if(i != 5){
                counter++;
            }
        }
        
        System.out.println(counter);
        
    }
    
}
