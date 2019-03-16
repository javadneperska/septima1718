package sk.dneperska.daniel.slanina;

public enum BankCodes {
    SLSP("0900"),
    POST("6500"),
    VUB("0200"),
    TB("1100"),
    UNICREDIT("1111"),
    CSOB("7500"),
    MBANK("8360"),
    OTP("5200"),
    JANDT("8300"),
    NBS("0720"),
    FIO("8330");


    private final String value;


    BankCodes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
