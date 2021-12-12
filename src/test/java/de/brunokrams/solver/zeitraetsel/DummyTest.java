package de.brunokrams.solver.zeitraetsel;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DummyTest {

    @Test
    void doSomething() {
        assertFalse(List.of(true, false, true).stream().allMatch(value -> value));
        assertTrue(List.of(true, true, true).stream().allMatch(value -> value));
        assertFalse(List.of(false, false, false).stream().allMatch(value -> value));
    }

}
