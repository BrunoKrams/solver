package de.brunokrams.solver.zeitraetsel.rules;

import de.brunokrams.solver.zeitraetsel.model.Range;
import de.brunokrams.solver.zeitraetsel.model.Riddle;

import java.util.List;

import static de.brunokrams.solver.zeitraetsel.model.Range.E_VERTICAL;
import static de.brunokrams.solver.zeitraetsel.model.Range.S_HORICONTAL;

public abstract class EverticalRule implements Rule {

    private static EverticalRule INSTANCE;

    private EverticalRule() {
    }

    public static EverticalRule getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new EverticalRule() {
            };
        }
        return INSTANCE;
    }

    @Override
    public boolean apply(Riddle riddle) {
        int reverseValueOfEvertical = riddle.getReverseValueOfRange(E_VERTICAL);
        int valueOfShoricontal = riddle.getValueOfRange(S_HORICONTAL);

        return reverseValueOfEvertical % valueOfShoricontal == 0;
    }

    @Override
    public List<Range> getAffectedRanges() {
        return List.of(E_VERTICAL, S_HORICONTAL);
    }
}
