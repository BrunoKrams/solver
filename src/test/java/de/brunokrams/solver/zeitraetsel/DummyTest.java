package de.brunokrams.solver.zeitraetsel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyTest {

    @Test
    void doSomething() {
        Integer sample = 234;
        Integer result = sumDigits(sample);
        assertEquals(9, result);
    }

    public static Integer sumDigits(Integer i) {
        return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
    }

}


