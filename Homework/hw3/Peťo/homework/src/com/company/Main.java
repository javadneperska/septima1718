package com.company;

public class Main {

    public static void main(String[] args) {
  Reader r = new Reader();
  Stvorec s = new Stvorec();
  Obdlznik o = new Obdlznik();
  Trojuholnik t = new Trojuholnik();
  Kruznica k = new Kruznica();
  r.readFile();
  for (int i = 0;i<r.myArray.length;i++){
      for (int j = 0;j<r.myArray[i].length;j++){
          if (r.myArray[i][j].equals("stvorec")) {
              // System.out.println("found me s");
              System.out.println("Obvod stvorca je: "+ s.countObvod(Double.parseDouble(r.myArray[i][(j+1)])));
          }
          if (r.myArray[i][j].equals("obdlznik")) {
              //System.out.println("found me o");
              System.out.println("Obvod obdlznika je: "+o.countObvod(Double.parseDouble(r.myArray[i][(j+1)]),Double.parseDouble(r.myArray[i][(j+2)])));
          }
          if (r.myArray[i][j].equals("trojuholnik")) {
              //System.out.println("found me t");
              System.out.println("Obvod trojuholnika je: "+t.countObvod(Double.parseDouble(r.myArray[i][(j+1)]),Double.parseDouble(r.myArray[i][(j+2)]),Double.parseDouble(r.myArray[i][(j+3)])));
          }
          if (r.myArray[i][j].equals("kruznica")) {
              //System.out.println("found me k");
              System.out.println("Obvod kruznice je: "+ k.countObvod(Double.parseDouble(r.myArray[i][(j+1)])));
          }
      }


  }
    }
}
