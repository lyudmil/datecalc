package interpreter;

import org.junit.Test;
import static org.junit.Assert.*;
import datespecification.DateSpecification;
import static com.domainlanguage.time.CalendarDate.date;

public class InterpreterTest {
    @Test
    public void treeWithHardCodedDateOnly() {
        assertEquals(date(2009, 4, 3), Interpreter.parse("4/3/2009").evaluate());
    }
    
    @Test
    public void canParseSimpleEarlierThan() {
        assertEquals(date(2009, 4, 2), Interpreter.parse("earlier of 4/2/2009 and 4/3/2009").evaluate());
    }
    
    @Test
    public void canParseSimpleLaterThan() {
        assertEquals(date(2009, 4, 3), Interpreter.parse("later of 4/2/2009 and 4/3/2009").evaluate());
    }

    @Test
    public void canParseSimplePlusMonths() {
        assertEquals(date(2009, 8, 8), Interpreter.parse("4/8/2009 plus 4 months").evaluate());
    }

    @Test
    public void complicatedExpression() {
        DateSpecification spec1 = Interpreter.parse("earlier of 4/5/2009 and 3/3/2000 plus 4 months");
        assertEquals(date(2000, 7, 3), spec1.evaluate());
    }
}
