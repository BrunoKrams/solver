package de.brunokrams.solver.kidssudoku;

public class TestDataProvider {

    private static final Integer[][] VALID_SUDOKU = {
            {null, 2, 1, 3, null, null},
            {3, null, 6, 2, null, null},
            {4, 6, null, null, 2, null},
            {1, null, null, null, 4, 3},
            {2, null, 4, null, null, 6},
            {null, null, null, 4, 3, null}
    };

    private static final Integer[][] INVALID_SUDOKU = {
            {null, 2, 1, 3, null, null},
            {3, null, 6, 2, 3, null},
            {4, 6, null, null, 2, 5},
            {1, null, null, null, 4, 3},
            {2, null, 4, null, null, 6},
            {null, null, null, 4, 3, null}
    };


    public static Integer[][] validSudoku() {
        return VALID_SUDOKU.clone();
    }

    public static Integer[][] invalidSudoku() {
        return INVALID_SUDOKU.clone();
    }
}
