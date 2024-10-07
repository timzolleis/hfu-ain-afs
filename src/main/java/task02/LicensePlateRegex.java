package task02;

import java.util.regex.Pattern;

public class LicensePlateRegex {

    public Boolean matches(final String input) {
        final Pattern pattern = Pattern.compile("[a-zA-Z]{1,3} [a-zA-Z]{1,2} [1-9]\\d{0,3}[HE]?");
        return pattern.matcher(input).matches();
    }
}
