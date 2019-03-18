package sk.dneperska.daniel.slanina;

class Iban {

    private String BBAN;
    private String countryName;
    private String countryCode;
    private BankCodes bankName;
    private String bankCode;
    private String IBAN;
    private String help = "";
    private String controlNumber;

    Iban(String nameOfCountry, String nameOfBank, String Bban) {
        countryName = nameOfCountry;
        bankName = BankCodes.valueOf(nameOfBank);
        BBAN = Bban;
        bankCode = getBankCode(bankName);
        countryCode = getCountryCode(countryName);
        String calculationIban = bankCode + BBAN + countryCode + "00";
        controlNumber = modulo(calculationIban);
        IBAN = countryName + controlNumber + bankCode + BBAN;
    }

    private String modulo(String ibanString) {
        String controlNumberResult;
        int result = 0;
        for (int i = 0; i < ibanString.length(); i++)
            result = (result * 10 + (int) ibanString.charAt(i) - '0') % 97;
        result = 98 - result;
        if (result < 10) controlNumberResult = "0" + result;
        else {
            controlNumberResult = Integer.toString(result);
        }
        return controlNumberResult;
    }

    private String getCountryCode(String countryName) {
        char[] array = countryName.toCharArray();
        for (char a :
                array) {
            String help2 = String.valueOf(a);
            CountryCodes b = CountryCodes.valueOf(help2);
            help = String.format("%s%s", help, b.getValue());
        }

        return help;
    }

    private String getBankCode(BankCodes bankName) {
        return bankName.getValue();
    }

    public String getBBAN() {
        return BBAN;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public BankCodes getBankName() {
        return bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getControlNumber() {
        return controlNumber;
    }

    @Override
    public String toString() {
        IBAN = IBAN.replaceAll("....", "$0 ");  //formatting for *paper* version
        return "Iban{" +
                "BBAN='" + BBAN + '\'' +
                ", countryName= '" + countryName + '\'' +
                ", countryCode= '" + countryCode + '\'' +
                ", bankName= '" + bankName.getDescription() + '\'' +
                ", bankCode= '" + bankCode + '\'' +
                ", controlNumber= '" + controlNumber + '\'' +
                ", IBAN= '" + IBAN + '\'' +
                '}';
    }
}

