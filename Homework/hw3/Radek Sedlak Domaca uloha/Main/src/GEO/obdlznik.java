
package GEO;


public class obdlznik {
public  double velkost1;
public  double velkost2;

static double obsah;
static double obvod;
    obdlznik(double bob1, double bob2) {
       this.velkost1=bob1;
       this.velkost2=bob2;
    }
    public double Obvod(){
        
        
        double result= 2*velkost1+2*velkost2;
        obvod=result;
        return result;
    }
    
     public double Obsah(){
         
         double result= velkost1*velkost2;
         obsah=result;
         return result;
     }
}
