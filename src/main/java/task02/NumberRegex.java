package task02;

import java.util.regex.Pattern;

public class NumberRegex {

    public Boolean matches(final String input) {
        final Pattern pattern = Pattern.compile("(00|01(11)*10|(1|01(11)*0)(0(11)*0)*(1|0(11)*10))*");

        return pattern.matcher(input).matches();
    }
}
