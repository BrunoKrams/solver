package de.brunokrams.solitairsolver;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TripleTest {


    @ParameterizedTest
    @CsvSource({
            "true, true, true, false",
            "true, true, false, true",
            "true, false, true, false",
            "true, false ,false, false",
            "false, true, true, false",
            "false, true, false, false",
            "false, false, true, false",
            "false, false, false, false"
    })
    void canJump_returnsCorrectResult(boolean isStartCellBlank, boolean isMiddleCellBlank, boolean isEndCellBlank, boolean expectedCanJump) {
        // Given
        Triple triple = new Triple(new Cell(isStartCellBlank), new Cell(isMiddleCellBlank), new Cell(isEndCellBlank));

        // When
        boolean canJump = triple.canJump();

        // Then
        assertEquals(expectedCanJump, canJump);
    }

    @Test
    void doJump_setsCellsCorrectly() throws IllegalMoveException {
        // Given
        Cell start = new Cell(true);
        Cell middle = new Cell(true);
        Cell end = new Cell(false);
        Triple triple = new Triple(start, middle, end);

        // When
        triple.doJump();

        // Then
        assertFalse(start.containsMarble());
        assertFalse(middle.containsMarble());
        assertTrue(end.containsMarble());
    }

    @ParameterizedTest
    @CsvSource({
            "true, true, true",
            "true, false, true",
            "true, false ,false",
            "false, true, true",
            "false, true, false",
            "false, false, true",
            "false, false, false"
    })
    void doJump_throwsException_whenJumpIsNotPossible(boolean isStartCellBlank, boolean isMiddleCellBlank, boolean isEndCellBlank) {
        // Given
        Triple triple = new Triple(new Cell(isStartCellBlank), new Cell(isMiddleCellBlank), new Cell(isEndCellBlank));

        // Then
        assertThrows(IllegalMoveException.class, () -> {
            triple.doJump();
        });
    }

}