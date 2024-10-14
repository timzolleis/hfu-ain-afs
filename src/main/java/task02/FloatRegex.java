package task02;

import java.util.regex.Pattern;

public class FloatRegex {

    public Boolean matches(final String input) {
        final Pattern pattern = Pattern.compile("[+-]?(0|[1-9]\\d*)(\\.\\d+)?([eE][+-]?\\d+)?");
        return pattern.matcher(input).matches();
    }

}
