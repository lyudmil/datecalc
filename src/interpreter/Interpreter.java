package interpreter;

import datespecification.DateSpecification;
import datespecification.HardCodedDateSpecification;
import datespecification.DateSpecifications;
import static datespecification.DateSpecifications.*;
import static datespecification.DateSpecifications.*;
import static datespecification.DateSpecifications.*;
import com.domainlanguage.time.CalendarDate;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.text.SimpleDateFormat;

public class Interpreter {
    private static final Pattern DATE_PATTERN = Pattern.compile("\\d+/\\d+/\\d+");
    private static final Pattern EARLIER_OF_PATTERN = Pattern.compile("earlier of (.*) and (.*)");
    private static final Pattern LATER_OF_PATTERN = Pattern.compile("later of (.*?) and (.*)");
    private static final Pattern PLUS_MONTHS_PATTERN = Pattern.compile("(\\d+/\\d+/\\d+?) plus (\\d+?) months");

    public static DateSpecification parse(String expression) {
        if (DATE_PATTERN.matcher(expression).matches()) {
            return hardCoded(CalendarDate.from(expression, "M/d/yyyy"));
        }

        Matcher earlierOfMatcher = EARLIER_OF_PATTERN.matcher(expression);
        if (earlierOfMatcher.matches()) {
            return earlierOf(parse(earlierOfMatcher.group(1)), parse(earlierOfMatcher.group(2)));
        }

        Matcher laterOfMatcher = LATER_OF_PATTERN.matcher(expression);
        if (laterOfMatcher.matches()) {
            return laterOf(parse(laterOfMatcher.group(1)), parse(laterOfMatcher.group(2)));
        }

        Matcher plusMonthsMatcher = PLUS_MONTHS_PATTERN.matcher(expression);
        if (plusMonthsMatcher.matches()) {
            return plusMonths(parse(plusMonthsMatcher.group(1)), Integer.valueOf(plusMonthsMatcher.group(2)));
        }
        throw new RuntimeException("Cannot parse: '" + expression + "'");
    }
}
