package de.brunokrams.solver.kidssudoku;

import de.brunokrams.solver.sudoku.Area;
import de.brunokrams.solver.sudoku.Cell;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AreaTest {

    @Test
    void isValid_returnsTrue_whenAreaIsValid() {
        // given
        Area area = Area.createArea(List.of(new Cell(1),new Cell(null),new Cell(3),new Cell(4)));

        // when
        boolean isValid = area.isValid();

        // then
        assertThat(isValid).isTrue();
    }


    @Test
    void isValid_returnsFalse_whenAreaIsInvalid() {
        // given
        Area area = Area.createArea(List.of(new Cell(1),new Cell(4),new Cell(3),new Cell(4)));

        // when
        boolean isValid = area.isValid();

        // then
        assertThat(isValid).isFalse();
    }
}