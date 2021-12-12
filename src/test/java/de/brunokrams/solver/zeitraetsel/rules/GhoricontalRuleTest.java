package de.brunokrams.solver.zeitraetsel.rules;

import de.brunokrams.solver.zeitraetsel.model.Riddle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import static de.brunokrams.solver.zeitraetsel.model.Range.G_HORICONTAL;
import static de.brunokrams.solver.zeitraetsel.model.Range.M_HORICONTAL;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class GhoricontalRuleTest {

    Rule gHoricontalRule = GhoricontalRule.getInstance();

    Riddle riddle = Mockito.mock(Riddle.class);

    @ParameterizedTest
    @CsvSource({"1034, 8", "938, 20"})
    void apply_returnsTrueWhenRuleIsSatisfied(int valueOfgHoricontal, int reverseValueOfMhoricontal) {
        // Given
        when(riddle.getValueOfRange(G_HORICONTAL)).thenReturn(valueOfgHoricontal);
        when(riddle.getReverseValueOfRange(M_HORICONTAL)).thenReturn(reverseValueOfMhoricontal);

        // When
        boolean result = gHoricontalRule.apply(riddle);

        // Then
        assertTrue(result);
    }


    @ParameterizedTest
    @CsvSource({"146, 15", "5747, 4"})
    void apply_returnsFalseWhenRuleIsNotSatisfied(int valueOfgHoricontal, int reverseValueOfMhoricontal) {
        // Given
        when(riddle.getValueOfRange(G_HORICONTAL)).thenReturn(valueOfgHoricontal);
        when(riddle.getReverseValueOfRange(M_HORICONTAL)).thenReturn(reverseValueOfMhoricontal);

        // When
        boolean result = gHoricontalRule.apply(riddle);

        // Then
        assertFalse(result);
    }
}