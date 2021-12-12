package de.brunokrams.solver.zeitraetsel.rules;

import de.brunokrams.solver.zeitraetsel.model.Range;
import de.brunokrams.solver.zeitraetsel.model.Riddle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class SquareRuleTest {

    SquareRule squareRule = new SquareRule(Range.K_HORICONTAL);

    Riddle riddle = Mockito.mock(Riddle.class);

    @ParameterizedTest
    @ValueSource(ints = {121, 400, 729})
    void apply_ReturnsTrue_whenValueIsPerfectSquare(int value) {
        // Given
        when(riddle.getValueOfRange(any(Range.class))).thenReturn(value);

        // When
        boolean result = squareRule.apply(riddle);

        // Then
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {101, 133, 758})
    void apply_ReturnsFalse_whenValueIsNoPerfectSquare(int value) {
        // Given
        when(riddle.getValueOfRange(any(Range.class))).thenReturn(value);

        // When
        boolean result = squareRule.apply(riddle);

        // Then
        assertFalse(result);
    }

    @Test
    void allRangesWith3Cells_carryASquareRule() {
        // Given
        List<Range> allRangesWith3Cells = Arrays.stream(Range.values()).filter(range -> range.getCells().size() == 3).collect(Collectors.toList());
        List<SquareRule> allSquareRules = RulesContainer.getAllRules().stream().filter(rule -> rule instanceof SquareRule).map(SquareRule.class::cast).collect(Collectors.toList());

        // When
        List<Range> allRangesWithSquareRules = allSquareRules.stream().map(squareRule -> squareRule.getAffectedRanges()).flatMap(List::stream).collect(Collectors.toList());

        // Then
        assertThat(allRangesWithSquareRules.size()).isEqualTo(allRangesWith3Cells.size());
        assertThat(allRangesWithSquareRules).containsAll(allRangesWith3Cells);

    }
}