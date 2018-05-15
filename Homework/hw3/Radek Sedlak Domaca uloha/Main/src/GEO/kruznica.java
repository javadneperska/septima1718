
package GEO;


public class kruznica {
double velkost;
public  static double obsah;
public  static double obvod;
    kruznica(double bob) {
        
        
        
       this.velkost=bob;
    }
      public double Obvod(){


        double result= velkost*Math.PI*2;
         obvod=result;
       return result;
    }
    public double Obsah(double velkost){


        double result= Math.PI*(velkost*velkost);
         obsah=result;
       return result;
    }
}
