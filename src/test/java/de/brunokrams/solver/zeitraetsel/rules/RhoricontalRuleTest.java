package de.brunokrams.solver.zeitraetsel.rules;

import de.brunokrams.solver.zeitraetsel.model.Riddle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import static de.brunokrams.solver.zeitraetsel.model.Range.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class RhoricontalRuleTest {

    Rule rHoricontalRule = RhoricontalRule.getInstance();

    Riddle riddle = Mockito.mock(Riddle.class);

    @ParameterizedTest
    @CsvSource({"966, 584, 382", "11140, 5976,5164"})
    void apply_returnsTrueWhenRuleIsSatisfied(int valueOfRhoricontal, int valueOfJvertical, int valueOfGhoricontal) {
        // Given
        when(riddle.getValueOfRange(R_HORICONTAL)).thenReturn(valueOfRhoricontal);
        when(riddle.getValueOfRange(J_VERTICAL)).thenReturn(valueOfJvertical);
        when(riddle.getValueOfRange(G_HORICONTAL)).thenReturn(valueOfGhoricontal);

        // When
        boolean result = rHoricontalRule.apply(riddle);

        // Then
        assertTrue(result);
    }


    @ParameterizedTest
    @CsvSource({"1500, 984, 702", "10047, 9999, 1000"})
    void apply_returnsTrueWhenRuleIsNotSatisfied(int valueOfRhoricontal, int valueOfJvertical, int valueOfGhoricontal) {
        // Given
        when(riddle.getValueOfRange(R_HORICONTAL)).thenReturn(valueOfRhoricontal);
        when(riddle.getValueOfRange(J_VERTICAL)).thenReturn(valueOfJvertical);
        when(riddle.getValueOfRange(G_HORICONTAL)).thenReturn(valueOfGhoricontal);


        // When
        boolean result = rHoricontalRule.apply(riddle);

        // Then
        assertFalse(result);
    }
}