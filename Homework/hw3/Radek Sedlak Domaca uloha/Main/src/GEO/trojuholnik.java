
package GEO;


public class trojuholnik {
double velkost1;
double velkost2;
double velkost3;
public  static double obsah;
public static double obvod;
    trojuholnik(double bob1, double bob2,double bob3) {
       this.velkost1=bob1;
       this.velkost2=bob2;
       this.velkost3=bob3;
    }
     public double Obvod(){
        
         
         double result= velkost1+velkost2+velkost3;
          obvod=result;
       return result;
     }
     
      public double Obsah(){
          
        
          double s=velkost1+velkost2+velkost3/2;
          double result= Math.sqrt (s*(s-velkost1)*(s-velkost2)*(s-velkost3));
          
           obsah=result;
       return result;
      }
}
