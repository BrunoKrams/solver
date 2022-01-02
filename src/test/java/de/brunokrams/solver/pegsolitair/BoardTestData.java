package de.brunokrams.solver.pegsolitair;

import java.util.Arrays;

public class BoardTestData {

    public static PegSolitairBoard pegSolitairBoardAfterMove4916 = createBoardWithEmptyCells(4, 9);
    public static PegSolitairBoard pegSolitairBoardAfterMove141516 = createBoardWithEmptyCells(14, 15);
    public static PegSolitairBoard pegSolitairBoardAfterMove181716 = createBoardWithEmptyCells(18, 17);
    public static PegSolitairBoard pegSolitairBoardAfterMove282316 = createBoardWithEmptyCells(28, 23);

    private static PegSolitairBoard createBoardWithEmptyCells(int... emptyCells) {
        boolean[] cells = new boolean[33];
        Arrays.fill(cells, true);
        for (int cell : emptyCells) {
            cells[cell] = false;
        }
        return new PegSolitairBoard(cells);
    }




}
