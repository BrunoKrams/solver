package de.brunokrams.solver.zeitraetsel.rules;

import de.brunokrams.solver.zeitraetsel.model.Riddle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import static de.brunokrams.solver.zeitraetsel.model.Range.E_VERTICAL;
import static de.brunokrams.solver.zeitraetsel.model.Range.S_HORICONTAL;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class EverticalRuleTest {

    EverticalRule eVerticalRule = EverticalRule.getInstance();

    Riddle riddle = Mockito.mock(Riddle.class);

    @ParameterizedTest
    @CsvSource({"847, 121", "80, 20"})
    void apply_returnsTrueWhenRuleIsSatisfied(int reverseValueOfEvertical, int valueOfShoricontal) {
        // Given
        when(riddle.getReverseValueOfRange(E_VERTICAL)).thenReturn(reverseValueOfEvertical);
        when(riddle.getValueOfRange(S_HORICONTAL)).thenReturn(valueOfShoricontal);

        // When
        boolean result = eVerticalRule.apply(riddle);

        // Then
        assertTrue(result);
    }


    @ParameterizedTest
    @CsvSource({"146, 15", "5747, 144"})
    void apply_returnsTrueWhenRuleIsNotSatisfied(int reverseValueOfEvertical, int valueOfShoricontal) {
        // Given
        when(riddle.getReverseValueOfRange(E_VERTICAL)).thenReturn(reverseValueOfEvertical);
        when(riddle.getValueOfRange(S_HORICONTAL)).thenReturn(valueOfShoricontal);

        // When
        boolean result = eVerticalRule.apply(riddle);

        // Then
        assertFalse(result);
    }
}