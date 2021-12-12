package de.brunokrams.solver.zeitraetsel.rules;

import de.brunokrams.solver.zeitraetsel.model.Range;
import de.brunokrams.solver.zeitraetsel.model.Riddle;

import java.util.List;

public class PrimeRule implements Rule {

    private static final List<Integer> primesUpTo100 = List.of(
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
    );

    private Range range;

    public PrimeRule(Range range) {
        this.range = range;
    }

    @Override
    public boolean apply(Riddle riddle) {
        return primesUpTo100.contains(riddle.getValueOf(range));
    }

    @Override
    public List<Range> getAffectedRanges() {
        return List.of(range);
    }
}
