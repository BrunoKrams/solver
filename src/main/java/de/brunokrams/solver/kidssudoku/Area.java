package de.brunokrams.solver.kidssudoku;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Area {

    private List<Cell> cells;

    private Area() {
    }

    static Area createArea(List<Cell> cells) {
        Area area = new Area();
        area.cells = cells;
        return area;
    }

    public boolean isValid() {
        Set<Integer> alreadySeen = new HashSet<>();
        for (Cell cell :cells) {
            Integer value = cell.getValue();
            if (value != null ) {
                if (alreadySeen.contains(value)) {
                    return false;
                } else {
                    alreadySeen.add(value);
                }
            }
        }
        return true;
    }
}
