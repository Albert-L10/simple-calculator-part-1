import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;



public class CalculatorTest {

    Calculator calculator = new Calculator();



    @Test
    public void add() {
        Assert.assertEquals(10, Calculator.add(1,2,3,4));
    }

    @Test
    public void multiply() {
        Assert.assertEquals(120, calculator.multiply(1,2,3,4,5));
    }
}
