
package GEO;

import java.io.FileNotFoundException;


public class Main {

  
    public static void main(String[] args) throws FileNotFoundException {
     Buffer a=new Buffer();
     a.readFile();
        for (int i = 0; i < a.pole.length; i++) {
            if (a.pole[i][0].equals("stvorec")){
                double bob = Double.parseDouble(a.pole[i][1]);
            stvorec size = new stvorec(bob);
            
        }
            
            if (a.pole[i][0].equals("obdlznik")){
                double bob1 = Double.parseDouble(a.pole[i][1]);
                double bob2 = Double.parseDouble(a.pole[i][2]);
            obdlznik size = new obdlznik(bob1,bob2);
            
    }
         if (a.pole[i][0].equals("trojuholnik")){
                double bob1 = Double.parseDouble(a.pole[i][1]);
                double bob2 = Double.parseDouble(a.pole[i][2]);
                double bob3 = Double.parseDouble(a.pole[i][3]);
            trojuholnik size = new trojuholnik(bob1,bob2,bob3);
    
}
         if (a.pole[i][0].equals("trojuholnik")){
                double bob = Double.parseDouble(a.pole[i][1]);
             
            kruznica size = new kruznica(bob);
         
}
        }  
    
    }
    
    
    }