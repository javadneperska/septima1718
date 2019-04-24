import java.util.Scanner;

public class iban_satmarik {

    public static void main (String args[]){

            String kod_uctu = null; //cez scanner
            String kod_banky= null;
            String kod_krajiny = "2820";
            String predcislie = null;
            //------------------------------------------------------
            Scanner sc = new Scanner(System.in);
            System.out.println("Číslo účtu : (napr. : 1234567890) ");
            kod_uctu = sc.next();

            Scanner sc2 = new Scanner(System.in);
            System.out.println("Kód banky (napr. : 0900) : ");
            kod_banky = sc2.next();

            Scanner sc3 = new Scanner(System.in);
            System.out.println("Kód krajiny (napr. : SK = 2820) : ");
            kod_krajiny = sc3.next();

            Scanner sc4 = new Scanner(System.in);
            System.out.println("Predčíslie (6 číslic) : (napr. 000000) : ");
            predcislie = sc4.next();

            //======================================================
            if(kod_uctu.length() > 10){
                System.out.println("Chybné číslo účtu!");
                System.exit(1);
            }
            //------------------------------------------------------
            if(kod_uctu.length() < 10){
                StringBuilder builder = new StringBuilder(kod_uctu);
                for (int i = kod_uctu.length(); i < 10; i++) {
                    kod_uctu = "0"+kod_uctu; //dodá potrebný počet núl, aby číslo účtu malo 10 znakov
                }
            }
            //======================================================
                if(kod_banky.length() > 4){
                   System.out.println("Chybný kód banky!");
                   System.exit(1);
              }
            //------------------------------------------------------
             if(kod_banky.length() < 4){
                   System.out.println("Chybný kód banky!");
                   System.exit(1);
              }
            //=====================================================
            if(kod_krajiny.length() > 4){
                    System.out.println("Chybný kód krajiny!");
                    System.exit(1);
             }
            //------------------------------------------------------
            if(kod_krajiny.length() < 4){
                    System.out.println("Chybný kód krajiny!");
                    System.exit(1);
             }

            //======================================================
        if(predcislie.length() > 6){
            System.out.println("Chybné predčíslie!");
            System.exit(1);
        }
        //------------------------------------------------------
        if(predcislie.length() < 6){
            System.out.println("Chybné predčíslie!");
            System.exit(1);
        }

        //======================================================

            System.out.println("Kód účtu :" + kod_uctu);
            String Bban = kod_banky+"000000"+kod_uctu+kod_krajiny+"00";

            int c_num = 98-(mod(Bban,97));
            String num = Integer.toString(c_num); //98
            if(c_num<10){
                num = "0"+num;
            }

            System.out.println("Kontrolný kód :" +num);
            String IBAN = "SK"+num+kod_banky+predcislie+kod_uctu;
            System.out.println("IBAN : " +IBAN);
        }
        static int mod(String num, int a)
        {
            int res = 0;

            for (int i = 0; i < num.length(); i++)
                res = (res * 10 + (int)num.charAt(i) - '0') % a;

            return res;
        }
    }




