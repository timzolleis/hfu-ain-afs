package task02;

import java.util.regex.Pattern;

public class DateTimeRegex {

    public Boolean matches(final String input) {
        final Pattern pattern = Pattern.compile("\\d{4}-(0?[1-9]|1[0-2])-(0?[1-9]|1[0-9]|2[0-9]|3[0-1])T(0?[0-9]|1[0-9]|2[0-4]):\\d{2}:\\d{2}:\\d{3}");
        return pattern.matcher(input).matches();
    }
}
