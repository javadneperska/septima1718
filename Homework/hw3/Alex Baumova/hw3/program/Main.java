package geometria;

public class Main {
   public static void main (String [] args) {
   Obdlznik obdlznik = new Obdlznik();
   double obvod1 = obdlznik.count1();
   double obsah1 = obdlznik.multiply1();
   
   Stvorec stvorec = new Stvorec();
   double obvod2 = stvorec.count2();
   double obsah2 = stvorec.multiply2();
   
   Trojuholnik trojuholnik = new Trojuholnik();
   double obvod3 = trojuholnik.count3();
   
   Kruh kruh = new Kruh();
   double obvod4 = kruh.count4();
   
   Obdlznik.printObvod (obvod1, obsah1);
   Stvorec.printObvod (obvod2, obsah2);
   Trojuholnik.printObvod (obvod3);
   Kruh.printObvod (obvod4);
   }

}
