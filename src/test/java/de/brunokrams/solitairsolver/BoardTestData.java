package de.brunokrams.solitairsolver;

import java.util.Arrays;

public class BoardTestData {

    public static Board BOARD_AFTER_MOVE_4_9_16 = createBoardWithEmptyCells(4, 9);
    public static Board BOARD_AFTER_MOVE_14_15_16 = createBoardWithEmptyCells(14, 15);
    public static Board BOARD_AFTER_MOVE_18_17_16 = createBoardWithEmptyCells(18, 17);
    public static Board BOARD_AFTER_MOVE_28_23_16 = createBoardWithEmptyCells(28, 23);

    private static Board createBoardWithEmptyCells(int... emptyCells) {
        boolean[] cells = new boolean[33];
        Arrays.fill(cells, true);
        for (int cell : emptyCells) {
            cells[cell] = false;
        }
        return new Board(cells);
    }




}
