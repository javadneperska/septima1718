/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Peter
 */
public class TREES {
static int[] veky = new int[15];
      static  int a = 0;
      
  public static double countAverageAge(){
      double sucet = 0;
      for (int i = 0; i < veky.length; i++) {
          
          sucet = sucet + veky[i];
         
      }
  //double result = sucet/veky.length;
  return sucet;
  }
    public static void main(String[] args) {
        
       try{
       ArrayList<String[]> action = new ArrayList<String[]>();
       FileReader fr = new FileReader(System.getProperty("user.home")+"\\Desktop\\tree3.txt");
            BufferedReader br = new BufferedReader(fr);
           String line;
            while((line = br.readLine()) != null){
            
            String[] pole= line.split(",");
               System.out.println(Arrays.toString(pole));
               action.add(pole);
              veky[a] = Integer.parseInt(pole[3]);
              a++;
             
            }
          // System.out.println(Arrays.toString(veky));
           System.out.println(countAverageAge()/veky.length);
       }
       catch (IOException io){
       
       
       }
    }
    
}
