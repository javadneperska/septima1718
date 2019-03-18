package sk.dneperska.daniel.slanina;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Country selector
        System.out.println("Write abbreviation of your country (for e. SK)");
        String country = sc.nextLine().toUpperCase();
        if (!Utils.countrySelectionValidation(country)) {
            System.err.println("Wrong abbreviation of the country ! ");
            System.exit(9999);
        }

        // Bank selector
        System.out.println("Write abbreviation of your bank from the following : ");
        System.out.println("----------------------------------------");
        for (BankCodes code : BankCodes.values()) System.out.println(code.name() + " - " + code.getDescription());
        System.out.println("----------------------------------------");
        String bank = sc.nextLine().toUpperCase();
        if (!Utils.bankSelectionValidation(bank)) {
            System.err.println("This abbreviation is not in the list  ! ");
            System.exit(8888);
        }

        //BBAN input
        System.out.println("Write your BBAN - account number ( max 16 numbers !)");
        StringBuilder accountNumber = new StringBuilder(sc.nextLine());
        accountNumber = Utils.bbanFill(accountNumber);
        if (!Utils.bbanValidation(accountNumber.toString())) {
            System.err.println("Bad BBAN input ! ");
            System.exit(7777);
        }

        System.out.println("-----------------------------------------");
        //Object form
        Iban firstCustomer = new Iban(country, bank, accountNumber.toString());
        System.out.println(firstCustomer.toString());

        //Only working for BBANs containing only numbers - not letter. May add support later
    }

}

