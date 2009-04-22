package datespecification;

import com.domainlanguage.time.CalendarDate;

public class PlusMonthsDateSpecification implements DateSpecification {
    private DateSpecification date;
    private int monthAdvancement;

    public PlusMonthsDateSpecification(DateSpecification spec, int monthAdvancement) {
        this.date = spec;
        this.monthAdvancement = monthAdvancement;
    }

    public CalendarDate evaluate() {
        return date.evaluate().plusMonths(monthAdvancement);
    }
}
