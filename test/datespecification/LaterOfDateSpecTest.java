package datespecification;

import com.domainlanguage.time.CalendarDate;
import org.junit.Test;

import static com.domainlanguage.time.CalendarDate.date;
import static datespecification.DateSpecifications.hardCoded;
import static org.junit.Assert.assertEquals;

public class LaterOfDateSpecTest {
    @Test
    public void canEvaluate() {
        CalendarDate date1 = date(2009, 5, 1);
        CalendarDate date2 = date(2009, 5, 2);

        assertEquals(date2, new LaterOfDateSpec(hardCoded(date1), hardCoded(date2)).evaluate());
    }
}
