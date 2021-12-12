package de.brunokrams.solver.zeitraetsel;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyTest {

    @ParameterizedTest
    @CsvSource({"14183, 96", "4876, 1344"})
    void doSomething(Integer value, Integer crossProduct) {
        // When
        Integer result = multiplyDigits(value);

        // Then
        assertEquals(crossProduct, result);
    }

    private static Integer multiplyDigits(Integer i) {
        return i == 0 ? 1 : i % 10 * multiplyDigits(i / 10);
    }
}


