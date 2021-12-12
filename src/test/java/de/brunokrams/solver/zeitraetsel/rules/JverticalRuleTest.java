package de.brunokrams.solver.zeitraetsel.rules;

import de.brunokrams.solver.zeitraetsel.model.Riddle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import static de.brunokrams.solver.zeitraetsel.model.Range.J_VERTICAL;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class JverticalRuleTest {

    Rule jVerticalRule = JverticalRule.getInstance();

    Riddle riddle = Mockito.mock(Riddle.class);

    @ParameterizedTest
    @ValueSource(ints = {133, 525233})
    void apply_returnsTrueWhenRuleIsSatisfied(int valueOfJvertical) {
        // Given
        when(riddle.getValueOfRange(J_VERTICAL)).thenReturn(valueOfJvertical);

        // When
        boolean result = jVerticalRule.apply(riddle);

        // Then
        assertTrue(result);
    }


    @ParameterizedTest
    @ValueSource(ints = {14183, 4876})
    void apply_returnsFalseWhenRuleIsNotSatisfied(int valueOfJvertical) {
        // Given
        when(riddle.getValueOfRange(J_VERTICAL)).thenReturn(valueOfJvertical);

        // When
        boolean result = jVerticalRule.apply(riddle);

        // Then
        assertFalse(result);
    }
}