package de.brunokrams.solver.zeitraetsel.rules;

import de.brunokrams.solver.zeitraetsel.model.Range;
import de.brunokrams.solver.zeitraetsel.model.Riddle;

import java.util.List;

public interface Rule {

    boolean apply(Riddle riddle);

    List<Range> getAffectedRanges();
}
