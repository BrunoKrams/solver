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

    @Test
    void allRangesWith2Cells_carryAPrimeRule() {
        // Given
        List<Range> allRangesWith2Cells = Arrays.stream(Range.values()).filter(range -> range.getCells().size() == 2).collect(Collectors.toList());
        List<PrimeRule> allPrimeRules = RulesContainer.getAllRules().stream().filter(rule -> rule instanceof PrimeRule).map(PrimeRule.class::cast).collect(Collectors.toList());

        // When
        List<Range> allRangesWithPrimeRules = allPrimeRules.stream().map(primeRule -> primeRule.getAffectedRanges()).flatMap(List::stream).collect(Collectors.toList());

        // Then
        assertThat(allRangesWithPrimeRules.size()).isEqualTo(allRangesWith2Cells.size());
        assertThat(allRangesWithPrimeRules).containsAll(allRangesWith2Cells);

    }
}