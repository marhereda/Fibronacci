import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KgaogeloM
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    //Testing for zero
    @Test
    public void testZero() {
         assertEquals(0,  Calculator.fab(0));
    }
    
    //Testing for
    @Test
    public void testNegative()
    {
        assertEquals(-1, Calculator.fab(-1)); 
    }
    
    @Test
    public void testPositive()
    {
        assertEquals(34, Calculator.fab(9)); 
    }
    
}
