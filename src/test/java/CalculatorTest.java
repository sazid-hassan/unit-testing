import calculator.Calculator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class CalculatorTest {
    @Test
    @DisplayName("Check if it returns correct value of two integers")
    public void testing_method()
    {
        Calculator calculator = new Calculator();

        int a = 5, b = 6;

        int actualResult = calculator.add(a, b);

        Assertions.assertEquals(11, actualResult);
    }
}