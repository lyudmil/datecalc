package datespecification;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;
import static com.domainlanguage.time.CalendarDate.date;

public class HardCodedDateSpecificationTest {
    @Test
    public void canEvaluate() {
        assertEquals(date(2009, 1, 1), new HardCodedDateSpecification(date(2009, 1, 1)).evaluate());
    }
}
