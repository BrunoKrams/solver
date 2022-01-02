package de.brunokrams.solver.pegsolitair;

import org.junit.jupiter.api.Test;

import java.util.List;

import static de.brunokrams.solver.pegsolitair.BoardTestData.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PegSolitairBoardTest {

    @Test
    void getSuccessors_returnsTheExpectedFour_whenCalledOnInitialBoard() {
        // Given
        PegSolitairBoard initialBoard = PegSolitairBoard.initialPosition();

        // When
        List<PegSolitairBoard> successors = initialBoard.getSuccessors();

        // Then
        assertThat(successors.size()).isEqualTo(4);
        assertThat(successors).contains(pegSolitairBoardAfterMove4916, pegSolitairBoardAfterMove141516, pegSolitairBoardAfterMove181716, pegSolitairBoardAfterMove282316);
    }

}
