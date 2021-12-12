package de.brunokrams.solver.zeitraetsel.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class RangeTest {

    @ParameterizedTest
    @EnumSource(Cell.class)
    void eachCell_isContainedInExactly_OneHoricontalAndOneVerticalRange(Cell cell) {
        // When
        List<Range> containingRanges = Arrays.stream(Range.values()).filter(range -> range.getCells().contains(cell)).collect(Collectors.toList());

        // Then
        assertThat(containingRanges.size()).isEqualTo(2);

        List<String> rangesSuffixes = containingRanges.stream().map(range -> range.name().split("_")[1]).collect(Collectors.toList());
        assertThat(rangesSuffixes).containsAll(List.of("HORICONTAL", "VERTICAL"));
    }

    @ParameterizedTest
    @EnumSource(Range.class)
    void cellsInRange_areOrderdByIndex(Range range) {
        // When
        List<Integer> cellIndexes = range.getCells().stream().map(Cell::getIndex).collect(Collectors.toList());

        // Then
        assertThat(cellIndexes).isSorted();
    }

    @ParameterizedTest
    @EnumSource(Range.class)
    void cellsOfHoricontalRangesHaveAllTheSameRowIndex_cellsOfVerticalRangesHaveAllTheSameColumnIndex(Range range) {
        // When
        List<Integer> differentIndexes;
        if (range.name().endsWith("HORICONTAL")) {
            differentIndexes = range.getCells().stream().map(Cell::getRow).distinct().collect(Collectors.toList());
        } else {
            differentIndexes = range.getCells().stream().map(Cell::getColumn).distinct().collect(Collectors.toList());
        }

        // Then
        assertThat(differentIndexes.size()).isEqualTo(1);
    }
}

