package datespecification;

import com.domainlanguage.time.CalendarDate;
import org.junit.Test;

import static com.domainlanguage.time.CalendarDate.date;
import static datespecification.DateSpecifications.*;
import static org.junit.Assert.assertEquals;

public class DateSpecificationsTest {
    @Test
    public void canComposeSpecifications() {
        CalendarDate date1 = date(2009, 3, 4);
        CalendarDate date2 = date(2009, 1, 5);

        DateSpecification spec = laterOf(hardCoded(date1), plusMonths(hardCoded(date2), 2));
        assertEquals(date(2009, 3, 5), spec.evaluate());
    }
}
