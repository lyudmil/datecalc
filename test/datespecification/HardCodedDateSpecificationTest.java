package datespecification;

import org.junit.Test;

import static com.domainlanguage.time.CalendarDate.date;
import static org.junit.Assert.assertEquals;

public class HardCodedDateSpecificationTest {
    @Test
    public void canEvaluate() {
        assertEquals(date(2009, 1, 1), new HardCodedDateSpecification(date(2009, 1, 1)).evaluate());
    }
}
