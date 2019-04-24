import org.jetbrains.annotations.NotNull;

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
        System.out.println(IBAN(CU, KB, PU));
    }

    @NotNull
    private static String IBAN(String CU, String KB, String PU) {
        if (CU.length() < 10) {
            StringBuilder CUBuilder = new StringBuilder(CU);
            while (CUBuilder.length() < 10) {
                CUBuilder.insert(0, "0");
            }
            CU = CUBuilder.toString();
        }
        String MV = KB + PU + CU + "282000";
        BigInteger bi1, bi2, bi3;
        bi1 = new BigInteger(MV);
        bi2 = new BigInteger("97");
        bi3 = bi1.mod(bi2);
        String checksum = String.valueOf(98 - bi3.intValue());
        if (Integer.valueOf(checksum) < 10) checksum = "0" + checksum;
        return "SK" + checksum + KB + PU + CU;
    }
}
