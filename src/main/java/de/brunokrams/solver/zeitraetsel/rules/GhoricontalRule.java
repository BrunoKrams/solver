package de.brunokrams.solver.zeitraetsel.rules;

import de.brunokrams.solver.zeitraetsel.model.Range;
import de.brunokrams.solver.zeitraetsel.model.Riddle;

import java.util.List;

import static de.brunokrams.solver.zeitraetsel.model.Range.G_HORICONTAL;
import static de.brunokrams.solver.zeitraetsel.model.Range.M_HORICONTAL;

public class GhoricontalRule implements Rule {

    private static GhoricontalRule INSTANCE;

    private GhoricontalRule() {
    }

    public static GhoricontalRule getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new GhoricontalRule();
        }
        return INSTANCE;
    }

    @Override
    public boolean apply(Riddle riddle) {
        int valueOfGHoricontal = riddle.getValueOfRange(G_HORICONTAL);
        int reverseValueOfMhoricontal = riddle.getReverseValueOfRange(M_HORICONTAL);
        return sumDigits(valueOfGHoricontal) == reverseValueOfMhoricontal;
    }

    @Override
    public List<Range> getAffectedRanges() {
        return List.of(G_HORICONTAL, M_HORICONTAL);
    }

    private static Integer sumDigits(Integer i) {
        return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
    }

}
