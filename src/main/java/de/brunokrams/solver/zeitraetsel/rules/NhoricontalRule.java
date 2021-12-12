package de.brunokrams.solver.zeitraetsel.rules;

import static de.brunokrams.solver.zeitraetsel.model.Range.H_HORICONTAL;
import static de.brunokrams.solver.zeitraetsel.model.Range.N_HORICONTAL;

public class NhoricontalRule extends MultipleRule {

    private static NhoricontalRule INSTANCE;

    private NhoricontalRule() {
        super(N_HORICONTAL, H_HORICONTAL);
    }

    public static NhoricontalRule getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new NhoricontalRule();
        }
        return INSTANCE;
    }
}
