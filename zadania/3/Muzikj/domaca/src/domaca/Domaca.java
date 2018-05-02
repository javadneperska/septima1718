
package domaca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;


public class Domaca {


    public static void main(String[] args) {
        
        String[][] cisla = new String[3][3];
        int[][] cislaSc= new int [3][3];
        int[][] cislaVysledok= new int [3][3];
       Scanner sc2=new Scanner(System.in);
        System.out.println("Zadaj 9 čísel");
        
        for (int i = 0; i < cislaSc.length; i++) {
                    for (int j = 0; j < cislaSc[i].length; j++) {

                               cislaSc[i][j]=sc2.nextInt();
                    }
        }

         
       String fileMeno="C:\\Users\\muzikj\\Desktop\\domaca\\src\\domaca\\dok2.csv";
       String data="";
       File pole= new File(fileMeno);
       try {
           Scanner sc= new Scanner(pole);
           while(sc.hasNext()) {
               
               for (int i = 0 ; i < cisla.length;i++){
                   data=sc.next();
               cisla[i]= data.split(",");
              
            }   
           }
       } catch(Exception e){
           
           
       }
       for(int i = 0 ; i < cislaVysledok.length;i++){
        for(int j = 0 ; j < cislaVysledok[i].length;j++) {
            cislaVysledok[i][j]= cislaSc[i][j]*Integer.parseInt(cisla[i][j]);
        }  
       }
           
         for (int i = 0; i < cislaVysledok.length; i++) {
                    for (int j = 0; j < cislaVysledok[i].length; j++) {

                              System.out.print(cislaVysledok[i][j]+" "); ;
                    }
                    System.out.println("");
        }
    

    
}

}
