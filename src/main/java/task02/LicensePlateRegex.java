package task02;

import java.util.regex.Pattern;

public class LicensePlateRegex {

    public Boolean matches(final String input) {
        final Pattern pattern = Pattern.compile("[A-ZÄÖÜ]{1,3} [A-ZÄÖÜ]{1,2} [1-9]\\d{0,3}( [HE])?");
        return pattern.matcher(input).matches();
    }
}
