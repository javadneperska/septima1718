import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Account number:");
        String CU = sc.next();
        System.out.println("Insert Bank code:");
        String KB = sc.next();
        System.out.println("Insert Predcislie učtu:");
        String PU = sc.next();
        System.out.println(IBAN(CU,KB,PU));
    }
    public static String IBAN(String CU, String KB,String PU){
        String IBANumber = "";
        if(CU.length() < 10){
            for(int x = 0;CU.length()<10;x++){
                CU = "0"+CU;
            }
        }
        String MV = KB+PU+CU+"282000";
        BigInteger bi1, bi2, bi3;
        bi1 = new BigInteger(MV);

        bi2 = new BigInteger("97");
        bi3 = bi1.mod(bi2);
        int checksum = 98 - bi3.intValue();
        IBANumber = "SK" + checksum + KB + PU + CU;
        return IBANumber;
    }
}
