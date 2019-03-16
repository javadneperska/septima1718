import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        String account_code = null;
        String bank_code= "0900";
        String country_code = "2820";
        Scanner sc = new Scanner(System.in);
        System.out.println("Account number:");
        account_code = sc.next();
       if(account_code.length() > 10){
           System.out.println("Wrong account number!");
           System.exit(1);

        }
        if(account_code.length() < 10){
            StringBuilder builder = new StringBuilder(account_code);
            for (int i = account_code.length(); i < 10; i++) {
               account_code = "0"+account_code;
            }

        }
        System.out.println(account_code);
        String Bban = bank_code+"000000"+account_code+country_code+"00";
        int control_number = 98-(mod(Bban,97));
        String number = Integer.toString(control_number);
        if(control_number<10){
            number = "0"+number;
        }
        System.out.println(number);
        String IBAN = "SK"+number+bank_code+"000000"+account_code;
        System.out.println(IBAN);
    }
    static int mod(String num, int a)
    {


        int res = 0;


        for (int i = 0; i < num.length(); i++)
            res = (res * 10 + (int)num.charAt(i)
                    - '0') % a;

        return res;
    }
}
