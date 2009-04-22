package datespecification;

import com.domainlanguage.time.CalendarDate;

public class DateSpecifications {
    public static DateSpecification earlierOf(DateSpecification date1, DateSpecification date2) {
        return new EarlierOfDateSpec(date1, date2);
    }

    public static DateSpecification laterOf(DateSpecification date1, DateSpecification date2) {
        return new LaterOfDateSpec(date1, date2);
    }

    public static DateSpecification plusMonths(DateSpecification spec, int monthAdvancement) {
        return new PlusMonthsDateSpecification(spec, monthAdvancement);
    }

    public static DateSpecification hardCoded(CalendarDate date) {
        return new HardCodedDateSpecification(date);
    }
}
