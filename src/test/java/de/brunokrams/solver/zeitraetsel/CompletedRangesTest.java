package de.brunokrams.solver.zeitraetsel;

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
}
