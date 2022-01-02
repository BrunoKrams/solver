package de.brunokrams.solver.innur24;

import org.junit.jupiter.api.Test;

import java.util.List;

import static de.brunokrams.solver.innur24.BoardTestData.*;
import static org.assertj.core.api.Assertions.assertThat;

public class Innur24BoardTest {

    @Test
    void getSuccessors_returnsTheExpected8_whenCalledOnInitialBoard() {
        // Given
        Innur24Board initialInnur24Board = Innur24Board.initialPosition();

        // When
        List<Innur24Board> successors = initialInnur24Board.getSuccessors();

        // Then
        assertThat(successors.size()).isEqualTo(8);
        assertThat(successors).contains(INNUR_24_BOARD_POSITIONS_AFTER_FIRST_MOVE);
    }

    @Test
    void getMovableTriples() {
        // When
        List<Triple> movableTriples = Innur24Board.initialPosition().getMovableTriples();

        // Then
        assertThat(movableTriples.size()).isEqualTo(4);
        assertThat(movableTriples).contains(Triple.TRIPLE_0_3_5, Triple.TRIPLE_2_3_4, Triple.TRIPLE_7_6_5, Triple.TRIPLE_9_6_4);
    }

    @Test
    void getMovableDobles() {
        // When
        List<Doble> movableDobles = Innur24Board.initialPosition().getMovableDobles();

        // Then
        assertThat(movableDobles.size()).isEqualTo(4);
        assertThat(movableDobles).contains(Doble.DOBLE_3_4, Doble.DOBLE_3_5, Doble.DOBLE_6_4, Doble.DOBLE_6_5);
    }


}
