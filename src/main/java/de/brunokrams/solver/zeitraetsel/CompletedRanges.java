package de.brunokrams.solver.zeitraetsel;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static de.brunokrams.solver.zeitraetsel.Cell.*;

public class CompletedRanges {

    private static final Map<Cell, List<Range>> completedRangesByCell;

    static {
        Map<Cell, List<Range>> intermediateList = new HashMap<>();

        intermediateList.put(CELL_0_0, Collections.emptyList());
        intermediateList.put(CELL_0_1, Collections.emptyList());
        intermediateList.put(CELL_0_2, Collections.emptyList());
        intermediateList.put(CELL_0_3, Collections.emptyList());
        intermediateList.put(CELL_0_4, Collections.emptyList());
        intermediateList.put(CELL_0_5, List.of(Range.A_HORICONTAL));
        intermediateList.put(CELL_1_0, Collections.emptyList());
        intermediateList.put(CELL_1_1, List.of(Range.B_VERTICAL));
        intermediateList.put(CELL_1_2, Collections.emptyList());
        intermediateList.put(CELL_1_3, List.of(Range.G_HORICONTAL));
        intermediateList.put(CELL_1_4, Collections.emptyList());
        intermediateList.put(CELL_1_5, List.of(Range.F_VERTICAL, Range.H_HORICONTAL));
        intermediateList.put(CELL_2_0, List.of(Range.A_VERTICAL));
        intermediateList.put(CELL_2_1, Collections.emptyList());
        intermediateList.put(CELL_2_2, List.of(Range.I_HORICONTAL));
        intermediateList.put(CELL_2_3, List.of(Range.D_VERTICAL));
        intermediateList.put(CELL_2_4, Collections.emptyList());
        intermediateList.put(CELL_2_5, List.of(Range.K_HORICONTAL));
        intermediateList.put(CELL_3_0, Collections.emptyList());
        intermediateList.put(CELL_3_1, List.of(Range.M_HORICONTAL));
        intermediateList.put(CELL_3_2, Collections.emptyList());
        intermediateList.put(CELL_3_3, Collections.emptyList());
        intermediateList.put(CELL_3_4, Collections.emptyList());
        intermediateList.put(CELL_3_5, List.of(Range.L_VERTICAL, Range.N_HORICONTAL));
        intermediateList.put(CELL_4_0, Collections.emptyList());
        intermediateList.put(CELL_4_1, Collections.emptyList());
        intermediateList.put(CELL_4_2, Collections.emptyList());
        intermediateList.put(CELL_4_3, Collections.emptyList());
        intermediateList.put(CELL_4_4, Collections.emptyList());
        intermediateList.put(CELL_4_5, List.of(Range.P_HORICONTAL));
        intermediateList.put(CELL_5_0, List.of(Range.M_VERTICAL));
        intermediateList.put(CELL_5_1, List.of(Range.J_VERTICAL));
        intermediateList.put(CELL_5_2, List.of(Range.C_VERTICAL));
        intermediateList.put(CELL_5_3, List.of(Range.O_VERTICAL, Range.R_HORICONTAL));
        intermediateList.put(CELL_5_4, List.of(Range.E_VERTICAL));
        intermediateList.put(CELL_5_5, List.of(Range.Q_VERTICAL, Range.S_HORICONTAL));

        completedRangesByCell = Collections.unmodifiableMap(intermediateList);
    }

    public static List<Range> getCompletedRangesByCell(Cell cell) {
        return completedRangesByCell.get(cell);
    }
}
