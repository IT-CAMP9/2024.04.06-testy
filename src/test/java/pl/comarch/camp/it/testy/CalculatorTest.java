package pl.comarch.camp.it.testy;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    static Calculator calculator = new Calculator();

    public CalculatorTest() {
        System.out.println("Konstruktor CalculatorTest !!!");
    }

    @BeforeEach
    public void prepare() {
        System.out.println("Przygotowanie przed testem !!!");
    }

    @AfterEach
    public void clean() {
        System.out.println("Sprzatanie po tescie !!!");
    }

    @BeforeAll
    public static void prepareForAll() {
        System.out.println("Wielkie przygotowanie przed wszystkimi testami !!!");
    }

    @AfterAll
    public static void cleanAfterAll() {
        System.out.println("Wielkie czyszczenie po wszystkich testach !!!");
    }

    @Test
    public void addTwoPositivesTest() {
        int a = 5;
        int b = 7;
        int expected = 12;

        int actual = calculator.add(a, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addTwoNegativesTest() {
        int a = -5;
        int b = -7;
        int expected = -12;

        int actual = calculator.add(a, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addPositiveAndZeroTest() {
        int a = 6;
        int b = 0;
        int expected = 6;

        int actual = calculator.add(a,b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addPositiveAndNegativeTest() {
        int a = 6;
        int b = -3;
        int expected = 3;

        int actual = calculator.add(a,b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divideTwoPositivesTest() {
        int a = 7;
        int b = 2;
        double expected = 3.5;

        double actual = calculator.divide(a,b);

        Assertions.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void divideTwoNegativesTest() {
        int a = -5;
        int b = -4;
        double expected = 1.25;

        double actual = calculator.divide(a,b);

        Assertions.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void divideZeroTest() {
        int a = 0;
        int b = 4;
        double expected = 0.0;

        double actual = calculator.divide(a,b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void dividePositiveAndNegativeTest() {
        int a = 11;
        int b = -3;
        double expected = -3.6666666;

        double actual = calculator.divide(a,b);

        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void divideByZeroTest() {
        int a = 5;
        int b = 0;

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(a,b));
    }
}
