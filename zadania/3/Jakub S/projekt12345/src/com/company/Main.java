package com.company;
        import java.io.File;
        import java.util.Random;
        import java.io.FileNotFoundException;
        import java.util.Random;
        import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       String [][] numbers = new String[3][3];
        int [][] numbersSc= new int [3][3];
        int [][] numbersFinal= new int [3][3];
        int sumPlus=0;
          int sumMulty= 1;
        System.out.println("+:"+ sumPlus);
        System.out.println("*"+sumMulty);
Scanner sc2=new Scanner(System.in);
        System.out.println("Napis 10 lubovolných cisel");
        for (int a= 0; a <numbersSc.length; a++){
for (int b = 0; b <numbersSc[a].length;b++){

    numbersSc[a][b]=sc2.nextInt();
    }
}
String fileMeno="C:\\Users\\instal\\Desktop\\dokument";
   String data="";
   File pole= new File(fileMeno);
   try{
       Scanner sc= new Scanner (System.in);
       while(sc.hasNext()){

      for (int a= 0; a< numbers.length;a++){
          data=sc.next();
          numbers [a]= data.split (",");
      }
       }


   } catch (Exception e){

    }
for(int a= 0 ; a< numbersFinal.length;a++){
    for(int b= 0 ; b< numbersFinal.length;b++){
    numbersFinal[a][b]= numbersSc[a][b]*Integer.parseInt(numbers[a][b]);
    }
}
for (int a= 0; a< numbersFinal.length; a++){
       for (int b = 0; b< numbersFinal[a].length;b++){
           System.out.println(numbersFinal[a][b]+"");;
       }
    System.out.println("");
}



    }
}

