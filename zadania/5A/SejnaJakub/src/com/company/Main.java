package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int vypiscisel;
        System.out.println("Zadajte sposob vypisu čisel");
        vypiscisel = in.nextInt();
        System.out.println("Zvolil si si " + vypiscisel);


//mohol som použiť aj string ale trebalo by pisať klavesnica a subor
        switch (vypiscisel) {

            case 1:
                klavesnica();
                break;
            case 2:
                subor();
                break;
        }

    }

    public static <string> void klavesnica() {
        System.out.println("Vybral si si klavesnicu");
        Scanner in = new Scanner(System.in);
        string vypiscisel;
        System.out.println("Zadajte cisla");
        ArrayList cisla = new ArrayList<>();

        while (!(vypiscisel = (string) in.nextLine()).equals("hotovo")) {
            System.out.println("Zvolil si si " + vypiscisel);
            cisla.add(Double.parseDouble(String.valueOf(vypiscisel)));
        }
        scitaj(cisla);

    }

    private static <string> void scitaj(List<string> cisla) {
        double finalnyvysledok = 0;
        for (string num : cisla) {
            System.out.println(num);
            finalnyvysledok = finalnyvysledok + num;
        }
        System.out.println("vysledok je : " + finalnyvysledok);
    }


    public static <string> void subor() throws IOException {
        System.out.println("Zadaj meno suboru (napriklad input.csv):");
        try {

            Scanner sc;
            File f = new File(System.getProperty("user.home") + "\\" + sc.nextLine());
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            List<String> items = Arrays.asList(b.readLine().split("\\s*,\\s*"));
            List<?> cisla;
            for (String item : items) {
                cisla.add(Double.parseDouble(item));
            }
            scitaj(cisla);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


    }
}





