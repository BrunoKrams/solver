package de.brunokrams.solver.zeitraetsel.rules;

import de.brunokrams.solver.zeitraetsel.model.Range;
import de.brunokrams.solver.zeitraetsel.model.Riddle;

import java.util.List;

public abstract class MultipleRule implements Rule {

    protected Range multiple;
    protected Range part;

    protected MultipleRule(Range multiple, Range part) {
        this.multiple = multiple;
        this.part = part;
    }

    @Override
    public boolean apply(Riddle riddle) {
        int valueOfMultiple = riddle.getValueOfRange(multiple);
        int valueOfPart = riddle.getValueOfRange(part);

        return valueOfMultiple % valueOfPart == 0;
    }

    @Override
    public List<Range> getAffectedRanges() {
        return List.of(multiple, part);
    }
}
