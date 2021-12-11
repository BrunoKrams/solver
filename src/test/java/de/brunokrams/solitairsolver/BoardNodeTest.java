package de.brunokrams.solitairsolver;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardNodeTest {

    @Test
    void state_isOfTypeBoard() {
        new BoardNode(Board.initialPosition());
    }

}