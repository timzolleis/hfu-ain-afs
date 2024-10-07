package task02;

import java.util.regex.Pattern;

public class DateTimeRegex {

    public Boolean matches(final String input) {
        final Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}");
        return pattern.matcher(input).matches();
    }
}
