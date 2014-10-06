import org.junit.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by jarek on 06-10-14.
 */
public class FormulaTest {

    @Test
    public void testMethod() {
        Formula formula = a -> a + 2;

        assertEquals(formula.calculate(1), 3);
    }

    @Test
    public void testDefaultMethod() {
        Formula formula = a -> 0;

        assertEquals(formula.calculateDefault(1), 2);
    }



}
