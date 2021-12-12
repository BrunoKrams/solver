package de.brunokrams.solver.zeitraetsel;

import java.util.List;

public interface Rule {

    boolean apply(Riddle riddle);

    List<Range> affectedRanges();
}
