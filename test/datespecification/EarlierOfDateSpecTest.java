package datespecification;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.domainlanguage.time.CalendarDate;
import static com.domainlanguage.time.CalendarDate.date;
import datespecification.EarlierOfDateSpec;
import static datespecification.DateSpecifications.*;

public class EarlierOfDateSpecTest {
    @Test
    public void canEvaluate() {
        CalendarDate date1 = date(2009, 5, 1);
        CalendarDate date2 = date(2009, 5, 2);

        assertEquals(date1, new EarlierOfDateSpec(hardCoded(date1), hardCoded(date2)).evaluate());
    }
}
