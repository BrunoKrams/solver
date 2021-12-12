package de.brunokrams.solver.zeitraetsel.rules;

import de.brunokrams.solver.zeitraetsel.model.Range;
import de.brunokrams.solver.zeitraetsel.model.Riddle;

import java.util.List;

import static de.brunokrams.solver.zeitraetsel.model.Range.*;

public class AhoricontalRule implements Rule {

    private static AhoricontalRule INSTANCE;

    private AhoricontalRule() {
    }

    public static AhoricontalRule getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AhoricontalRule();
        }
        return INSTANCE;
    }

    @Override
    public boolean apply(Riddle riddle) {
        int valueOfAhoricontal = riddle.getValueOfRange(A_HORICONTAL);
        int valueOfEvertical = riddle.getValueOfRange(E_VERTICAL);
        int valueOfPhoricontal = riddle.getValueOfRange(P_HORICONTAL);

        return valueOfAhoricontal == valueOfEvertical - valueOfPhoricontal;
    }

    @Override
    public List<Range> getAffectedRanges() {
        return List.of(A_HORICONTAL, E_VERTICAL, P_HORICONTAL);
    }
}
