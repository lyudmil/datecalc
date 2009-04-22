package datespecification;

import com.domainlanguage.time.CalendarDate;

public class EarlierOfDateSpec implements DateSpecification {
    private DateSpecification spec1;
    private DateSpecification spec2;

    public EarlierOfDateSpec(DateSpecification spec1, DateSpecification spec2) {
        this.spec1 = spec1;
        this.spec2 = spec2;
    }

    public CalendarDate evaluate() {
        CalendarDate firstDate = spec1.evaluate();
        CalendarDate secondDate = spec2.evaluate();
        if (firstDate.isBefore(secondDate)) {
            return firstDate;
        }
        return secondDate;
    }
}
