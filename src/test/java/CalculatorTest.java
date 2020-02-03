import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @org.junit.jupiter.api.Test
    void sum() {
        assertEquals(calculator.sum(5, 5), 10);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        assertEquals(calculator.subtract(5, 5), 0);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals(calculator.divide(5, 5), 1);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        assertEquals(calculator.multiply(5, 5), 25);
    }
}