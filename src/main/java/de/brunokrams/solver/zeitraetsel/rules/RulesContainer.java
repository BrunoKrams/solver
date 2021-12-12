package de.brunokrams.solver.zeitraetsel.rules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static de.brunokrams.solver.zeitraetsel.model.Range.*;

public class RulesContainer {

    private static final List<Rule> allRules;

    static {
        List<Rule> intermediateList = new ArrayList<>();

        intermediateList.add(new PrimeRule(H_HORICONTAL));
        intermediateList.add(new PrimeRule(M_HORICONTAL));
        intermediateList.add(new PrimeRule(S_HORICONTAL));

        intermediateList.add(new PrimeRule(B_VERTICAL));
        intermediateList.add(new PrimeRule(F_VERTICAL));
        intermediateList.add(new PrimeRule(L_VERTICAL));
        intermediateList.add(new PrimeRule(Q_VERTICAL));

        intermediateList.add(new SquareRule(I_HORICONTAL));
        intermediateList.add(new SquareRule(K_HORICONTAL));

        intermediateList.add(new SquareRule(A_VERTICAL));
        intermediateList.add(new SquareRule(D_VERTICAL));
        intermediateList.add(new SquareRule(M_VERTICAL));
        intermediateList.add(new SquareRule(O_VERTICAL));

        allRules = Collections.unmodifiableList(intermediateList);
    }

    public static List<Rule> getAllRules() {
        return allRules;
    }

}
