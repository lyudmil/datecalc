package datespecification;

import com.domainlanguage.time.CalendarDate;
import org.junit.Test;

import static com.domainlanguage.time.CalendarDate.date;
import static datespecification.DateSpecifications.hardCoded;
import static org.junit.Assert.assertEquals;

public class PlusMonthsDateSpecificationTest {
    @Test
    public void canEvaluate() {
        CalendarDate date = date(2009, 1, 5);

        assertEquals(date(2009, 4, 5), new PlusMonthsDateSpecification(hardCoded(date), 3).evaluate());
    }
}
