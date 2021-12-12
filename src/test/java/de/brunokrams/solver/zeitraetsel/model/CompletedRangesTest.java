package de.brunokrams.solver.zeitraetsel.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class CompletedRangesTest {

    @ParameterizedTest
    @EnumSource(Range.class)
    void everyRange_isCompletedByExactlyOneCell(Range range) {
        // When
        List<Cell> completingCells = Arrays.stream(Cell.values()).filter(cell -> CompletedRanges.getCompletedRangesByCell(cell).contains(range)).collect(Collectors.toUnmodifiableList());

        // Then
        assertThat(completingCells.size()).isEqualTo(1);
    }

    @Test
    void completedRangesByCellIndex_increasesInIndex() {
        for (int index = 1; index < 36; index++) {
            // Then
            assertThat(CompletedRanges.getCumulatedCompletedRangesByCellIndex(index)).containsAll(CompletedRanges.getCumulatedCompletedRangesByCellIndex(index - 1));
        }
    }

    @Test
    void completedRangesByCellIndex_containsAllRanges_whenIndexIsLastIndex() {
        // Given
        List<Range> allRanges = Arrays.asList(Range.values());

        // When
        List<Range> completedRanges = CompletedRanges.getCumulatedCompletedRangesByCellIndex(35);

        // Then
        assertThat(completedRanges.size()).isEqualTo(allRanges.size());
        assertThat(completedRanges).containsAll(allRanges);
    }
}


