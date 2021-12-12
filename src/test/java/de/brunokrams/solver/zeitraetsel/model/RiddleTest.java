package de.brunokrams.solver.zeitraetsel.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class RiddleTest {

    @Test
    void isComplete_worksForEmptyRiddle() {
        assertFalse(Riddle.EMPTY.isComplete());
    }

}