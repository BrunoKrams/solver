package de.brunokrams.solver.zeitraetsel.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static de.brunokrams.solver.zeitraetsel.model.Cell.*;
import static de.brunokrams.solver.zeitraetsel.model.Range.*;

public class CompletedRanges {

    private static final Map<Cell, List<Range>> completedRangesByCell;

    static {
        Map<Cell, List<Range>> intermediateList = new HashMap<>();

        intermediateList.put(CELL_0_0, Collections.emptyList());
        intermediateList.put(CELL_0_1, Collections.emptyList());
        intermediateList.put(CELL_0_2, Collections.emptyList());
        intermediateList.put(CELL_0_3, Collections.emptyList());
        intermediateList.put(CELL_0_4, Collections.emptyList());
        intermediateList.put(CELL_0_5, List.of(A_HORICONTAL));
        intermediateList.put(CELL_1_0, Collections.emptyList());
        intermediateList.put(CELL_1_1, List.of(B_VERTICAL));
        intermediateList.put(CELL_1_2, Collections.emptyList());
        intermediateList.put(CELL_1_3, List.of(G_HORICONTAL));
        intermediateList.put(CELL_1_4, Collections.emptyList());
        intermediateList.put(CELL_1_5, List.of(F_VERTICAL, H_HORICONTAL));
        intermediateList.put(CELL_2_0, List.of(A_VERTICAL));
        intermediateList.put(CELL_2_1, Collections.emptyList());
        intermediateList.put(CELL_2_2, List.of(I_HORICONTAL));
        intermediateList.put(CELL_2_3, List.of(D_VERTICAL));
        intermediateList.put(CELL_2_4, Collections.emptyList());
        intermediateList.put(CELL_2_5, List.of(K_HORICONTAL));
        intermediateList.put(CELL_3_0, Collections.emptyList());
        intermediateList.put(CELL_3_1, List.of(M_HORICONTAL));
        intermediateList.put(CELL_3_2, Collections.emptyList());
        intermediateList.put(CELL_3_3, Collections.emptyList());
        intermediateList.put(CELL_3_4, Collections.emptyList());
        intermediateList.put(CELL_3_5, List.of(L_VERTICAL, N_HORICONTAL));
        intermediateList.put(CELL_4_0, Collections.emptyList());
        intermediateList.put(CELL_4_1, Collections.emptyList());
        intermediateList.put(CELL_4_2, Collections.emptyList());
        intermediateList.put(CELL_4_3, Collections.emptyList());
        intermediateList.put(CELL_4_4, Collections.emptyList());
        intermediateList.put(CELL_4_5, List.of(P_HORICONTAL));
        intermediateList.put(CELL_5_0, List.of(M_VERTICAL));
        intermediateList.put(CELL_5_1, List.of(J_VERTICAL));
        intermediateList.put(CELL_5_2, List.of(C_VERTICAL));
        intermediateList.put(CELL_5_3, List.of(O_VERTICAL, R_HORICONTAL));
        intermediateList.put(CELL_5_4, List.of(E_VERTICAL));
        intermediateList.put(CELL_5_5, List.of(Q_VERTICAL, S_HORICONTAL));

        completedRangesByCell = Collections.unmodifiableMap(intermediateList);
    }

    private static final Map<Integer, List<Range>> cumulatedCompletedRangesByCellIndex;

    static {
        Map<Integer, List<Range>> intermediateList = new HashMap<>();

        intermediateList.put(0, Collections.emptyList());
        intermediateList.put(1, Collections.emptyList());
        intermediateList.put(2, Collections.emptyList());
        intermediateList.put(3, Collections.emptyList());
        intermediateList.put(4, Collections.emptyList());
        intermediateList.put(5, List.of(A_HORICONTAL));
        intermediateList.put(6, List.of(A_HORICONTAL));
        intermediateList.put(7, List.of(A_HORICONTAL, B_VERTICAL));
        intermediateList.put(8, List.of(A_HORICONTAL, B_VERTICAL));
        intermediateList.put(9, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL));
        intermediateList.put(10, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL));
        intermediateList.put(11, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL));
        intermediateList.put(12, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL));
        intermediateList.put(13, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL));
        intermediateList.put(14, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL));
        intermediateList.put(15, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL));
        intermediateList.put(16, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL));
        intermediateList.put(17, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL, K_HORICONTAL));
        intermediateList.put(18, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL, K_HORICONTAL));
        intermediateList.put(19, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL, K_HORICONTAL, M_HORICONTAL));
        intermediateList.put(20, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL, K_HORICONTAL, M_HORICONTAL));
        intermediateList.put(21, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL, K_HORICONTAL, M_HORICONTAL));
        intermediateList.put(22, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL, K_HORICONTAL, M_HORICONTAL));
        intermediateList.put(23, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL, K_HORICONTAL, M_HORICONTAL, L_VERTICAL, N_HORICONTAL));
        intermediateList.put(24, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL, K_HORICONTAL, M_HORICONTAL, L_VERTICAL, N_HORICONTAL));
        intermediateList.put(25, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL, K_HORICONTAL, M_HORICONTAL, L_VERTICAL, N_HORICONTAL));
        intermediateList.put(26, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL, K_HORICONTAL, M_HORICONTAL, L_VERTICAL, N_HORICONTAL));
        intermediateList.put(27, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL, K_HORICONTAL, M_HORICONTAL, L_VERTICAL, N_HORICONTAL));
        intermediateList.put(28, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL, K_HORICONTAL, M_HORICONTAL, L_VERTICAL, N_HORICONTAL));
        intermediateList.put(29, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL, K_HORICONTAL, M_HORICONTAL, L_VERTICAL, N_HORICONTAL, P_HORICONTAL));
        intermediateList.put(30, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL, K_HORICONTAL, M_HORICONTAL, L_VERTICAL, N_HORICONTAL, P_HORICONTAL, M_VERTICAL));
        intermediateList.put(31, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL, K_HORICONTAL, M_HORICONTAL, L_VERTICAL, N_HORICONTAL, P_HORICONTAL, M_VERTICAL, J_VERTICAL));
        intermediateList.put(32, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL, K_HORICONTAL, M_HORICONTAL, L_VERTICAL, N_HORICONTAL, P_HORICONTAL, M_VERTICAL, J_VERTICAL, C_VERTICAL));
        intermediateList.put(33, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL, K_HORICONTAL, M_HORICONTAL, L_VERTICAL, N_HORICONTAL, P_HORICONTAL, M_VERTICAL, J_VERTICAL, C_VERTICAL, O_VERTICAL, R_HORICONTAL));
        intermediateList.put(34, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL, K_HORICONTAL, M_HORICONTAL, L_VERTICAL, N_HORICONTAL, P_HORICONTAL, M_VERTICAL, J_VERTICAL, C_VERTICAL, O_VERTICAL, R_HORICONTAL, E_VERTICAL));
        intermediateList.put(35, List.of(A_HORICONTAL, B_VERTICAL, G_HORICONTAL, F_VERTICAL, H_HORICONTAL, A_VERTICAL, I_HORICONTAL, D_VERTICAL, K_HORICONTAL, M_HORICONTAL, L_VERTICAL, N_HORICONTAL, P_HORICONTAL, M_VERTICAL, J_VERTICAL, C_VERTICAL, O_VERTICAL, R_HORICONTAL, E_VERTICAL, Q_VERTICAL, S_HORICONTAL));

        cumulatedCompletedRangesByCellIndex = Collections.unmodifiableMap(intermediateList);
    }

    public static List<Range> getCompletedRangesByCell(Cell cell) {
        return completedRangesByCell.get(cell);
    }

    public static List<Range> getCumulatedCompletedRangesByCellIndex(int index) {
        if (index < 0 || index > 35) {
            return Collections.emptyList();
        }
        return cumulatedCompletedRangesByCellIndex.get(index);
    }
}
