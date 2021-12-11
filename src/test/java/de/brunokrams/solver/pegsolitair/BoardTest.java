package de.brunokrams.solver.pegsolitair;

import org.junit.jupiter.api.Test;

import java.util.List;

import static de.brunokrams.solver.pegsolitair.BoardTestData.*;
import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {

    @Test
    void getSuccessors_returnsTheExpectedFour_whenCalledOnInitialBoard() {
        // Given
        Board initialBoard = Board.initialPosition();

        // When
        List<Board> successors = initialBoard.getSuccessors();

        // Then
        assertThat(successors.size()).isEqualTo(4);
        assertThat(successors).contains(BOARD_AFTER_MOVE_4_9_16, BOARD_AFTER_MOVE_14_15_16, BOARD_AFTER_MOVE_18_17_16, BOARD_AFTER_MOVE_28_23_16);
    }

}
