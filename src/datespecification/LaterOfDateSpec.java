package datespecification;

import com.domainlanguage.time.CalendarDate;

public class LaterOfDateSpec implements DateSpecification {
    private DateSpecification date1;
    private DateSpecification date2;

    public LaterOfDateSpec(DateSpecification spec1, DateSpecification spec2) {
        this.date1 = spec1;
        this.date2 = spec2;
    }

    public CalendarDate evaluate() {
        CalendarDate firstDate = date1.evaluate();
        CalendarDate secondDate = date2.evaluate();
        if (firstDate.isAfter(secondDate)) {
            return firstDate;
        }
        return secondDate;
    }
}
