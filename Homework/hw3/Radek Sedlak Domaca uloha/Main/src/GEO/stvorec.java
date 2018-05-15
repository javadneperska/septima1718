
package GEO;


public class stvorec {
double velkost;
public static double obsah;
public static double obvod;
    stvorec(double bob) {
      this.velkost=bob;
    }
    public double Obvod(){
        
        
        double result= 4*velkost;
        obvod=result;
       return result;
    }
    
    public double Obsah(){
        double result= velkost*velkost;
          obsah=result;
       return result;
    }
}
