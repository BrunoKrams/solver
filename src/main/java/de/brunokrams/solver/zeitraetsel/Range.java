package de.brunokrams.solver.zeitraetsel;

import java.util.List;

import static de.brunokrams.solver.zeitraetsel.Cell.*;

public enum Range {

    A_HORICONTAL(List.of(CELL_0_0, CELL_0_1, CELL_0_2, CELL_0_3, CELL_0_4, CELL_0_5)),
    G_HORICONTAL(List.of(CELL_1_0, CELL_1_1, CELL_1_2, CELL_1_3)),
    H_HORICONTAL(List.of(CELL_1_4, CELL_1_5)),
    I_HORICONTAL(List.of(CELL_2_0, CELL_2_1, CELL_2_2)),
    K_HORICONTAL(List.of(CELL_2_3, CELL_2_4, CELL_2_5)),
    M_HORICONTAL(List.of(CELL_3_0, CELL_3_1)),
    N_HORICONTAL(List.of(CELL_3_2, CELL_3_3, CELL_3_4, CELL_3_5)),
    P_HORICONTAL(List.of(CELL_4_0, CELL_4_1, CELL_4_2, CELL_4_3, CELL_4_4, CELL_4_5)),
    R_HORICONTAL(List.of(CELL_5_0, CELL_5_1, CELL_5_2, CELL_5_3)),
    S_HORICONTAL(List.of(CELL_5_4, CELL_5_5)),

    A_VERTICAL(List.of(CELL_0_0, CELL_1_0, CELL_2_0)),
    B_VERTICAL(List.of(CELL_0_1, CELL_1_1)),
    C_VERTICAL(List.of(CELL_0_2, CELL_1_2, CELL_2_2, CELL_3_2, CELL_4_2, CELL_5_2)),
    D_VERTICAL(List.of(CELL_0_3, CELL_1_3, CELL_2_3)),
    E_VERTICAL(List.of(CELL_0_4, CELL_1_4, CELL_2_4, CELL_3_4, CELL_4_4, CELL_5_4)),
    F_VERTICAL(List.of(CELL_0_5, CELL_1_5)),
    J_VERTICAL(List.of(CELL_2_1, CELL_3_1, CELL_4_1, CELL_5_1)),
    L_VERTICAL(List.of(CELL_2_5, CELL_3_5)),
    M_VERTICAL(List.of(CELL_3_0, CELL_4_0, CELL_5_0)),
    O_VERTICAL(List.of(CELL_3_3, CELL_4_3, CELL_5_3)),
    Q_VERTICAL(List.of(CELL_4_5, CELL_5_5));


    private List<Cell> cells;

    Range(List<Cell> cells) {
        this.cells = cells;
    }

    public List<Cell> getCells() {
        return cells;
    }
}