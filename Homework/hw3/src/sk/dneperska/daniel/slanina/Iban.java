package sk.dneperska.daniel.slanina;

class Iban {

    private final String firstNumber = "000000";
    private long BBAN;
    private String countryName;
    private int countryCode;
    private BankCodes bankName;
    private String bankCode;
    private String IBAN;

    Iban(String nameOfCountry, String nameOfBank, long Bban) {
        nameOfCountry = countryName;
        bankName = BankCodes.valueOf(nameOfBank);
        Bban = BBAN;
        bankCode = getBankCode(bankName);
        countryCode = getCountryCode(countryName);
    }

    private static void build() {

    }

    private int getCountryCode(String countryName) {
        char[] array = countryName.toCharArray();
        for (char a :
                array) {
            //TODO - doplnit getter z Enumu.
        }

        return 0;
    }

    private String getBankCode(BankCodes bankName) {
        return bankName.getValue();
    }

}

