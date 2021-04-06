package task_8;

import org.junit.Assert;
import org.junit.Test;
import task_5.logic.Calculator;

public class CalculatorTests {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 2);

        Assert.assertEquals(4, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(4, 2);

        Assert.assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(4, 2);

        Assert.assertEquals(8, result);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(4, 2);

        Assert.assertEquals(2, result);
    }
}
