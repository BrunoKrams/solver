package de.brunokrams.solver.zeitraetsel.rules;

import de.brunokrams.solver.zeitraetsel.model.Riddle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import static de.brunokrams.solver.zeitraetsel.model.Range.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class AhoricontalRuleTest {

    Rule aHoricontalRule = AhoricontalRule.getInstance();

    Riddle riddle = Mockito.mock(Riddle.class);

    @ParameterizedTest
    @CsvSource({"202, 584, 382", "812, 5976,5164"})
    void apply_returnsTrueWhenRuleIsSatisfied(int valueOfAHoricontal, int valueOfEVertical, int valueOfPhoricontal) {
        // Given
        when(riddle.getValueOfRange(A_HORICONTAL)).thenReturn(valueOfAHoricontal);
        when(riddle.getValueOfRange(E_VERTICAL)).thenReturn(valueOfEVertical);
        when(riddle.getValueOfRange(P_HORICONTAL)).thenReturn(valueOfPhoricontal);

        // When
        boolean result = aHoricontalRule.apply(riddle);

        // Then
        assertTrue(result);
    }


    @ParameterizedTest
    @CsvSource({"484, 984, 702", "5643, 9999, 1000"})
    void apply_returnsFalseWhenRuleIsNotSatisfied(int valueOfAHoricontal, int valueOfEVertical, int valueOfPhoricontal) {
        // Given
        when(riddle.getValueOfRange(A_HORICONTAL)).thenReturn(valueOfAHoricontal);
        when(riddle.getValueOfRange(E_VERTICAL)).thenReturn(valueOfEVertical);
        when(riddle.getValueOfRange(P_HORICONTAL)).thenReturn(valueOfPhoricontal);

        // When
        boolean result = aHoricontalRule.apply(riddle);

        // Then
        assertFalse(result);
    }
}