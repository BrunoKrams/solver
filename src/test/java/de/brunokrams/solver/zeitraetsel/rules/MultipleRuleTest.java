package de.brunokrams.solver.zeitraetsel.rules;

import de.brunokrams.solver.zeitraetsel.model.Riddle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import static de.brunokrams.solver.zeitraetsel.model.Range.H_HORICONTAL;
import static de.brunokrams.solver.zeitraetsel.model.Range.N_HORICONTAL;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class MultipleRuleTest {

    MultipleRule nHoricontalRule = NhoricontalRule.getInstance();

    Riddle riddle = Mockito.mock(Riddle.class);

    @ParameterizedTest
    @CsvSource({"847, 121", "80, 20"})
    void apply_returnsTrueWhenRuleIsSatisfied(int valueOfNhoricontal, int valueOfHhoricontal) {
        // Given
        when(riddle.getValueOfRange(N_HORICONTAL)).thenReturn(valueOfNhoricontal);
        when(riddle.getValueOfRange(H_HORICONTAL)).thenReturn(valueOfHhoricontal);

        // When
        boolean result = nHoricontalRule.apply(riddle);

        // Then
        assertTrue(result);
    }


    @ParameterizedTest
    @CsvSource({"146, 15", "5747, 144"})
    void apply_returnsTrueWhenRuleIsNotSatisfied(int valueOfNhoricontal, int valueOfHhoricontal) {
        // Given
        when(riddle.getValueOfRange(N_HORICONTAL)).thenReturn(valueOfNhoricontal);
        when(riddle.getValueOfRange(H_HORICONTAL)).thenReturn(valueOfHhoricontal);

        // When
        boolean result = nHoricontalRule.apply(riddle);

        // Then
        assertFalse(result);
    }
}