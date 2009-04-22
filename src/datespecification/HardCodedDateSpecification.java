package datespecification;

import com.domainlanguage.time.CalendarDate;

public class HardCodedDateSpecification implements DateSpecification {
    private CalendarDate calendarDate;

    public HardCodedDateSpecification(CalendarDate calendarDate) {
        this.calendarDate = calendarDate;
    }

    public CalendarDate evaluate() {
        return calendarDate;
    }
}
