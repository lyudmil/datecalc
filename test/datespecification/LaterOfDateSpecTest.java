package datespecification;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.domainlanguage.time.CalendarDate;
import static com.domainlanguage.time.CalendarDate.date;
import datespecification.LaterOfDateSpec;
import static datespecification.DateSpecifications.*;

public class LaterOfDateSpecTest {
    @Test
    public void canEvaluate() {
        CalendarDate date1 = date(2009, 5, 1);
        CalendarDate date2 = date(2009, 5, 2);

        assertEquals(date2, new LaterOfDateSpec(hardCoded(date1), hardCoded(date2)).evaluate());
    }
}
