package de.brunokrams.solver.zeitraetsel;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class PrimeRuleTest {

    PrimeRule primeRule = new PrimeRule(Range.B_VERTICAL);

    Riddle riddle = Mockito.mock(Riddle.class);

    @ParameterizedTest
    @ValueSource(ints = {2, 17, 31, 97})
    void apply_ReturnsTrue_whenValueIsPrime(int value) {
        // Given
        when(riddle.getValueOf(any(Range.class))).thenReturn(value);

        // When
        boolean result = primeRule.apply(riddle);

        // Then
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 18, 66, 91})
    void apply_ReturnsFalse_whenValueIsComposite(int value) {
        // Given
        when(riddle.getValueOf(any(Range.class))).thenReturn(value);

        // When
        boolean result = primeRule.apply(riddle);

        // Then
        assertFalse(result);
    }
}