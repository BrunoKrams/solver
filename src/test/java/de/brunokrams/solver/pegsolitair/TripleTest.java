package de.brunokrams.solver.pegsolitair;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TripleTest {

    @Test
    void toEachTripleThereIsOneInTheOppositeDirection() {
        List<Triple> allTriples = List.of(Triple.values());
        for (Triple triple : allTriples) {
            assertTrue(allTriples.stream().anyMatch(current -> areInverse(current, triple)), "No reverse Triple found for " + triple.name());
        }
    }

    private boolean areInverse(Triple first, Triple second) {
        return first.getFirstCell() == second.getLastCell()
                && first.getMiddleCell() == second.getMiddleCell()
                && first.getLastCell() == second.getFirstCell();
    }


}