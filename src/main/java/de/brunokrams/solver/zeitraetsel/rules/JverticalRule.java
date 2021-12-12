package de.brunokrams.solver.zeitraetsel.rules;

import de.brunokrams.solver.zeitraetsel.model.Range;
import de.brunokrams.solver.zeitraetsel.model.Riddle;

import java.util.List;

import static de.brunokrams.solver.zeitraetsel.model.Range.J_VERTICAL;

public abstract class JverticalRule implements Rule {

    private static JverticalRule INSTANCE;

    private JverticalRule() {
    }

    public static JverticalRule getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new JverticalRule() {
            };
        }
        return INSTANCE;
    }

    @Override
    public boolean apply(Riddle riddle) {
        int valueOfJvertical = riddle.getValueOfRange(J_VERTICAL);

        return isPerfectSquare(multiplyDigits(valueOfJvertical));
    }

    private boolean isPerfectSquare(Integer value) {
        int integerRoot = (int) (Math.sqrt(value));
        return integerRoot * integerRoot == value;
    }

    @Override
    public List<Range> getAffectedRanges() {
        return List.of(J_VERTICAL);
    }

    private static Integer multiplyDigits(Integer i) {
        return i == 0 ? 1 : i % 10 * multiplyDigits(i / 10);
    }

}
