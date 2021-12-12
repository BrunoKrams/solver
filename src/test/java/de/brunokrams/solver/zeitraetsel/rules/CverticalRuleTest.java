package de.brunokrams.solver.zeitraetsel.rules;

import de.brunokrams.solver.zeitraetsel.model.Riddle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import static de.brunokrams.solver.zeitraetsel.model.Range.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class CverticalRuleTest {

    Rule cVerticalRule = CverticalRule.getInstance();

    Riddle riddle = Mockito.mock(Riddle.class);

    @ParameterizedTest
    @CsvSource({"223088, 584, 382", "30860064, 5976,5164"})
    void apply_returnsTrueWhenRuleIsSatisfied(int valueOfCvertical, int valueOfIhoricontal, int valueOJvertical) {
        // Given
        when(riddle.getValueOfRange(C_VERTICAL)).thenReturn(valueOfCvertical);
        when(riddle.getValueOfRange(I_HORICONTAL)).thenReturn(valueOfIhoricontal);
        when(riddle.getValueOfRange(J_VERTICAL)).thenReturn(valueOJvertical);

        // When
        boolean result = cVerticalRule.apply(riddle);

        // Then
        assertTrue(result);
    }


    @ParameterizedTest
    @CsvSource({"650000, 984, 702", "9999001, 9999, 1000"})
    void apply_returnsTrueWhenRuleIsNotSatisfied(int valueOfCvertical, int valueOfIhoricontal, int valueOJvertical) {
        // Given
        when(riddle.getValueOfRange(C_VERTICAL)).thenReturn(valueOfCvertical);
        when(riddle.getValueOfRange(I_HORICONTAL)).thenReturn(valueOfIhoricontal);
        when(riddle.getValueOfRange(J_VERTICAL)).thenReturn(valueOJvertical);

        // When
        boolean result = cVerticalRule.apply(riddle);

        // Then
        assertFalse(result);
    }
}