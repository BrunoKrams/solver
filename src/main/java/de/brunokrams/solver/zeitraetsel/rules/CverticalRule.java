package de.brunokrams.solver.zeitraetsel.rules;

import de.brunokrams.solver.zeitraetsel.model.Range;
import de.brunokrams.solver.zeitraetsel.model.Riddle;

import java.util.List;

import static de.brunokrams.solver.zeitraetsel.model.Range.*;

public class CverticalRule implements Rule {

    private static CverticalRule INSTANCE;

    private CverticalRule() {
    }

    public static CverticalRule getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CverticalRule();
        }
        return INSTANCE;
    }

    @Override
    public boolean apply(Riddle riddle) {
        int valueOfCvertical = riddle.getValueOfRange(C_VERTICAL);
        int valueOfIhoricontal = riddle.getValueOfRange(I_HORICONTAL);
        int valueOfJvertical = riddle.getValueOfRange(J_VERTICAL);

        return valueOfCvertical == valueOfIhoricontal * valueOfJvertical;
    }

    @Override
    public List<Range> getAffectedRanges() {
        return List.of(C_VERTICAL, I_HORICONTAL, J_VERTICAL);
    }
}
