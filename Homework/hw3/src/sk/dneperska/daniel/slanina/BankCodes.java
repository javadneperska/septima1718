package sk.dneperska.daniel.slanina;

@SuppressWarnings("ALL")
public enum BankCodes {
    SLSP("Slovenská sporiteľňa, a.s.", "0900"),
    POST("Poštová banka, a.s.", "6500"),
    VUB("Všeobecná úverová banka,a.s.", "0200"),
    TATRABANK("Tatra banka, a.s.", "1100"),
    UNICREDIT("UniCredit Bank Slovakia, a.s.", "1111"),
    CSOB("Československá obchodná banka, a.s.", "7500"),
    MBANK("mBank S.A.", "8360"),
    OTP("OTP banka Slovensko, a.s.", "5200"),
    JT("J&T BANKA, a.s.", "8300"),
    NBS("Národná banka Slovenska", "0720"),
    FIO("Fio banka, a.s.", "8330"),
    PRIMABANKA("Prima banka Slovensko, a.s. (DEXIA)", "5100"),
    PRIVAT("Privatbanka, a.s.", "8120");


    // Pattern for adding more banks -  abbreviationOfTheBank( description - full name , bankCode)

    private final String value;
    private final String description;


    BankCodes(String description, String value) {
        this.description = description;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
