
package javaapplication33;


public  abstract class Zivocich {
    String typ; 
Zivocich(String typ) { this.typ = new String(typ); }
public void vypisInfo(){
System.out.print(typ + ",");
vypisDelku();}
public abstract void vypisDelku();

}
