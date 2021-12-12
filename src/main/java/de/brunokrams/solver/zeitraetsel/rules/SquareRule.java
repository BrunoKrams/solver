package de.brunokrams.solver.zeitraetsel.rules;

import de.brunokrams.solver.zeitraetsel.model.Range;
import de.brunokrams.solver.zeitraetsel.model.Riddle;

import java.util.List;

public class SquareRule implements Rule {

    private static final List<Integer> squaresBetween100And999 = List.of(
            100, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484, 529, 576, 625, 676, 729, 784, 841, 900, 961
    );

    Range range;

    public SquareRule(Range range) {
        this.range = range;
    }

    @Override
    public boolean apply(Riddle riddle) {
        return squaresBetween100And999.contains(riddle.getValueOfRange(range));
    }

    @Override
    public List<Range> getAffectedRanges() {
        return List.of(range);
    }
}
