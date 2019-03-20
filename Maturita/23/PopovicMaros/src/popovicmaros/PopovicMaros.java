/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popovicmaros;

/**
 *
 * @author Žiak
 */
public class PopovicMaros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String IBAN = "SK68 0720 0002 8919 7061 6353";
        IBAN = IBAN.replace(" ", "");
        IBAN = (IBAN.substring(4)+IBAN.substring(0,4));
        IBAN = IBAN.replace("SK", "2820");
        System.out.println(IBAN);
        int mod = (modulo(IBAN.toString(),97));
        String modulo = "";
        if(mod<10){
            modulo = "0"+mod;
        } else {
            modulo = ""+mod;
        }
        
        System.out.println("SK"+modulo+IBAN);
        System.out.println(modulo);
        //System.out.println("________________");
        //System.out.println(modulo("510007547061111462",97));
       //System.out.println(mod("510007547061111462",97));
       //SK8207200002891970616353282068 
       //SK8207200002891970616353282068
        
    }
    
    
    static int modulo(String num, int a){
        String substring = "";
        int mod = 0;
        boolean flag = false;
        while (flag == false) {
        if(num.length()>=9){
          substring = num.substring(0,9); 
        }else {
            substring = num;
            flag = true;
        }
        num = num.replace(substring, "");
        mod = Integer.parseInt(substring)%97;
        //System.out.println("First 9 digits "+substring);
        //System.out.println("Remainder digits "+num);
        //System.out.println("mod "+mod);
        num = ""+mod+num;
            //System.out.println("_____");
            if(flag == false){
                //System.out.println("Repeat with: " +num);
            } else {
                return mod;
            }
        
         
        }
        return -1;
    }
}
