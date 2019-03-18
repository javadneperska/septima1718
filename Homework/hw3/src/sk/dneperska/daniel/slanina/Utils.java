package sk.dneperska.daniel.slanina;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Utils {

    static boolean bankSelectionValidation(String test) {
        for (BankCodes c : BankCodes.values()) {
            if (c.name().equals(test)) {
                return true;
            }
        }
        return false;
    }

    static boolean countrySelectionValidation(String test) {
        if (test.length() != 2) return false;
        Pattern p = Pattern.compile("[^a-z]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(test);
        boolean b = m.find();
        return !b;
    }

    static boolean bbanValidation(String test) {
        if (test.length() > 16 || test.length() < 1) return false;
        Pattern p = Pattern.compile("[^0-9]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(test);
        boolean b = m.find();
        return !b;
    }

    static StringBuilder bbanFill(StringBuilder accountNumber) {
        if (accountNumber.length() < 16) {
            for (int i = accountNumber.length(); i < 16; i++) {
                accountNumber.insert(0, "0");
            }
        }
        return accountNumber;
    }
}
