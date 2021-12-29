package de.brunokrams.solver.innur24;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DobleTest {

    @Test
    void toEachDoubleThereIsOneInTheOppositeDirection() {
        List<Doble> allDobles = List.of(Doble.values());
        for (Doble doble :allDobles) {
            assertTrue(allDobles.stream().anyMatch(current -> areInverse(current, doble)), "No reverse doble found for " + doble.name());
        }
    }

    private boolean areInverse(Doble first, Doble second) {
        return first.getFirstCell() == second.getLastCell()
                && first.getLastCell() == second.getFirstCell();
    }

}