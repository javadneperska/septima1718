
package javaapplication33;


public class Ptak extends Zivocich {
    
int delkaKridel;
Ptak(String typ, int delka) {
super(typ);
delkaKridel = delka; }
@Override
public  void vypisDelku(){
System.out.println("delka kridel: " + delkaKridel); } }


