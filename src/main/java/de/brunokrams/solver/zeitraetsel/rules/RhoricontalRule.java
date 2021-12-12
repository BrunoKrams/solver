package de.brunokrams.solver.zeitraetsel.rules;

import de.brunokrams.solver.zeitraetsel.model.Range;
import de.brunokrams.solver.zeitraetsel.model.Riddle;

import java.util.List;

import static de.brunokrams.solver.zeitraetsel.model.Range.*;

public class RhoricontalRule implements Rule {

    private static RhoricontalRule INSTANCE;

    private RhoricontalRule() {
    }

    public static RhoricontalRule getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RhoricontalRule();
        }
        return INSTANCE;
    }

    @Override
    public boolean apply(Riddle riddle) {
        int valueOfRhoricontal = riddle.getValueOfRange(R_HORICONTAL);
        int valueOfJvertical = riddle.getValueOfRange(J_VERTICAL);
        int valueOfGHoricontal = riddle.getValueOfRange(G_HORICONTAL);

        return valueOfRhoricontal == valueOfJvertical + valueOfGHoricontal;
    }

    @Override
    public List<Range> getAffectedRanges() {
        return List.of(R_HORICONTAL, J_VERTICAL, G_HORICONTAL);
    }
}
