package de.brunokrams.solver.innur24;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static de.brunokrams.solver.innur24.BoardTestData.*;
import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {

    @Test
    void getSuccessors_returnsTheExpected8_whenCalledOnInitialBoard() {
        // Given
        Board initialBoard = Board.initialPosition();

        // When
        List<Board> successors = initialBoard.getSuccessors();

        // Then
        assertThat(successors.size()).isEqualTo(8);
        assertThat(successors).contains(BOARD_POSITIONS_AFTER_FIRST_MOVE);
    }

    @Test
    void getMovableTriples() {
        // When
        List<Triple> movableTriples = Board.initialPosition().getMovableTriples();

        // Then
        assertThat(movableTriples.size()).isEqualTo(4);
        assertThat(movableTriples).contains(Triple.TRIPLE_0_3_5, Triple.TRIPLE_2_3_4, Triple.TRIPLE_7_6_5, Triple.TRIPLE_9_6_4);
    }

    @Test
    void getMovableDobles() {
        // When
        List<Doble> movableDobles = Board.initialPosition().getMovableDobles();

        // Then
        assertThat(movableDobles.size()).isEqualTo(4);
        assertThat(movableDobles).contains(Doble.DOBLE_3_4, Doble.DOBLE_3_5, Doble.DOBLE_6_4, Doble.DOBLE_6_5);
    }


}
