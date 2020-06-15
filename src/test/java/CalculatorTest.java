import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;



@Before
public void before(){
    calculator = new Calculator(5,3,10.0,5.0);
}

@Test
    public void canAddNumber() {
    assertEquals(8, calculator.addNumber());
}

@Test
    public void canSubtractNumber(){
    assertEquals(2, calculator.subtractNumber());
}

    @Test
    public void canMultiplyNumber(){
        assertEquals(15, calculator.multiplyNumber());
    }

    @Test
    public void canDivideNumber(){
        assertEquals(2, calculator.divideNumber(), 0.01);
    }



}

