package com.company;

import java.util.Arrays;

public class Main {
    public  static String[] stvorec= new String[4];
    public  static String[] obdlznik= new String[4];
    public  static String[] trojuholnik= new String[4];
    public  static String[] kruznica= new String[4];

    public static void main(String[] args) {
        stvorec [0]= "stvorec";
        obdlznik [0]= "obdlznik";
        trojuholnik[0]= "trojuholnik";
        kruznica[0]= "kruznica";
        Reader r = new Reader();
  Stvorec s = new Stvorec();
  Obdlznik o = new Obdlznik();
  Trojuholnik t = new Trojuholnik();
  Kruznica k = new Kruznica();
  Writer w = new Writer();
  r.readFile();

  for (int i = 0;i<r.myArray.length;i++){
      for (int j = 0;j<r.myArray[i].length;j++){
          if (r.myArray[i][j].equals("stvorec")) {
              // System.out.println("found me s");
              System.out.println("Obvod stvorca je: "+ s.countObvod(Double.parseDouble(r.myArray[i][(j+1)])));
              System.out.println("Obsah stvorca je: "+ s.countObsah(Double.parseDouble(r.myArray[i][(j+1)])));
              stvorec [1]= Double.toString(s.countObvod(Double.parseDouble(r.myArray[i][(j+1)])));
              stvorec [2]= Double.toString(s.countObsah(Double.parseDouble(r.myArray[i][(j+1)])));

          }
          if (r.myArray[i][j].equals("obdlznik")) {
              //System.out.println("found me o");
              System.out.println("Obvod obdlznika je: "+o.countObvod(Double.parseDouble(r.myArray[i][(j+1)]),Double.parseDouble(r.myArray[i][(j+2)])));
              System.out.println("Obsah obdlznika je: "+o.countObsah(Double.parseDouble(r.myArray[i][(j+1)]),Double.parseDouble(r.myArray[i][(j+2)])));
              obdlznik [1]= Double.toString(o.countObvod(Double.parseDouble(r.myArray[i][(j+1)]),Double.parseDouble(r.myArray[i][(j+2)])));
              obdlznik [2]= Double.toString(o.countObsah(Double.parseDouble(r.myArray[i][(j+1)]),Double.parseDouble(r.myArray[i][(j+2)])));

          }
          if (r.myArray[i][j].equals("trojuholnik")) {
              //System.out.println("found me t");
              System.out.println("Obvod trojuholnika je: "+t.countObvod(Double.parseDouble(r.myArray[i][(j+1)]),Double.parseDouble(r.myArray[i][(j+2)]),Double.parseDouble(r.myArray[i][(j+3)])));
              System.out.println("Obsah trojuholnika je: "+t.countObsah(Double.parseDouble(r.myArray[i][(j+1)]),Double.parseDouble(r.myArray[i][(j+2)]),Double.parseDouble(r.myArray[i][(j+3)])));
              trojuholnik[1]= Double.toString(t.countObvod(Double.parseDouble(r.myArray[i][(j+1)]),Double.parseDouble(r.myArray[i][(j+2)]),Double.parseDouble(r.myArray[i][(j+3)])));
              trojuholnik[2] = Double.toString(t.countObsah(Double.parseDouble(r.myArray[i][(j+1)]),Double.parseDouble(r.myArray[i][(j+2)]),Double.parseDouble(r.myArray[i][(j+3)])));
          }
          if (r.myArray[i][j].equals("kruznica")) {
              //System.out.println("found me k");
              System.out.println("Obvod kruznice je: "+ k.countObvod(Double.parseDouble(r.myArray[i][(j+1)])));
              System.out.println("Obsah kruznice je: "+ k.countObsah(Double.parseDouble(r.myArray[i][(j+1)])));
              kruznica[1] = Double.toString(k.countObvod(Double.parseDouble(r.myArray[i][(j+1)])));
              kruznica[2] = Double.toString(k.countObsah(Double.parseDouble(r.myArray[i][(j+1)])));

          }
      }


  }
        w.writeFile();
    }

}
