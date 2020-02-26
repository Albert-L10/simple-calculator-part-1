import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;



public class CalculatorTest {

    Calculator calculator = new Calculator();
    int sum[]={1,2,3,4};
    int tot[]={1,2,3,4};
    int total=0;
    int temp=0;


    @Test
    public void add() {
        Assert.assertEquals(10, Calculator.add(sum,total));
    }

    @Test
    public void multiply() {
        Assert.assertEquals(24, calculator.multiply(tot,temp));
    }
}
