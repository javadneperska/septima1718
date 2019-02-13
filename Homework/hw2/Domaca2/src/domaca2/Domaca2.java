
package domaca2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Domaca2 {


    
        
static Scanner sc = new Scanner(System.in);
    
    public static void Domaca2(String[] args) {
        String file="C:\\Users\\Roman\\Desktop\\random.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null){
                zaplat(Double.parseDouble(line));
                System.out.println("___________________\n___________________\n___________________\n");
            }
        } catch(Exception ex){
           System.out.println("Cyhba");
        }
    }

    private static void zaplat(double zaplatit) {
        int vlozenaSuma;
        
        System.out.println("Suma na zaplatenie: "+zaplatit+" €");
        System.out.println("Vlozte bankovky (500,200,100,50,20,10,5)");
        
        while(zaplatit>0){
        System.out.println("Ostava zaplatit: "+Math.floor(zaplatit*100)/100+" €");
        vlozenaSuma = sc.nextInt();
                
                switch(vlozenaSuma){
                    case 500: 
                    case 200: 
                    case 100: 
                    case 50: 
                    case 20: 
                    case 10: 
                    case 5: 

                        zaplatit -= vlozenaSuma;
                        break;

                    default: System.out.println("Nespravna hodnota");
                        break;
                }            

        }
            System.out.println("Zaplatene.\n");
            System.out.println("Vydavok: "+Math.abs(zaplatit)+" €");
            vydat(Math.abs(zaplatit));
    }

    private static void vydat(double vydavok) {
        vydavok= Math.ceil(vydavok*100);
        int[] mince = new int[15];
        mince[14] = 1;// 0.01€
        mince[13] = 2;// 0.02€
        mince[12] = 5;// 0.05€
        mince[11] = 10;// 0.1€
        mince[10] = 20;// 0.2€
        mince[9] = 50;  // 0.5€
        mince[8] = 100; // 1€
        mince[7] = 200; // 2€
        mince[6] = 500; // 5€
        mince[5] = 1000; // 10€
        mince[4] = 2000; // 20€
        mince[3] = 5000; // 50€
        mince[2] = 10000; // 100€
        mince[1] = 20000; // 200€
        mince[0] = 50000; // 500€

        System.out.println("Na vratenie: ");
        while(vydavok>0){
           for (int m : mince) {
            if(m<=vydavok){
                vydavok-=m;
                System.out.print((double)(m)/100+"€ ");
                break;
            }
        }
        
           
        }
            System.out.println("\nKoniec nakupu.\n");
    }
    
}