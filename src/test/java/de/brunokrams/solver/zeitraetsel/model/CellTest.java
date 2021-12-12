package de.brunokrams.solver.zeitraetsel.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CellTest {

    @Test
    void getCellAt_returnsExpectedCell() {
        for (int row = 0; row < 6; row++) {
            for (int column = 0; column < 6; column++) {
                // When
                Cell cell = Cell.getCellAt(row, column);
                int rowFromName = Integer.parseInt(cell.name().split("_")[1]);
                int columnFromName = Integer.parseInt(cell.name().split("_")[2]);

                // Then
                assertEquals(row, rowFromName);
                assertEquals(column, columnFromName);
            }
        }
    }

    @ParameterizedTest
    @EnumSource(Cell.class)
    void cellsIndex_equalsItsPositionInEnum(Cell cell) {
        // When
        Cell cellAtIndex = Cell.values()[cell.getIndex()];

        // Then
        assertEquals(cell, cellAtIndex);
    }

}