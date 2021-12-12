package de.brunokrams.solver.zeitraetsel.rules;

import static de.brunokrams.solver.zeitraetsel.model.Range.A_VERTICAL;
import static de.brunokrams.solver.zeitraetsel.model.Range.P_HORICONTAL;

public class PhoricontalRule extends MultipleRule {

    private static PhoricontalRule INSTANCE;

    private PhoricontalRule() {
        super(P_HORICONTAL, A_VERTICAL);
    }

    public static PhoricontalRule getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PhoricontalRule();
        }
        return INSTANCE;
    }
}
