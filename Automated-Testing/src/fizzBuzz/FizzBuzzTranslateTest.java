package fizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTranslateTest {
    @Test
    void checkFiZZBuzzTranslateTest() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.getFizzBuzz(number);
        assertEquals(expected, result);

    }
    @Test
    void checkFiZZBuzzTranslateTest1() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.getFizzBuzz(number);
        assertEquals(expected, result);

    }
    @Test
    void checkFiZZBuzzTranslateTest2() {
        int number = 10;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.getFizzBuzz(number);
        assertEquals(expected, result);

    }
}
