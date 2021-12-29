package de.brunokrams.solver.innur24;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static de.brunokrams.solver.innur24.State.*;

public class BoardTestData {

    public static final Board BOARD_AFTER_MOVE_0_3_5 = createBoardAfterMove035();
    public static final Board BOARD_AFTER_MOVE_2_3_4 = createBoardAfterMove234();
    public static final Board BOARD_AFTER_MOVE_7_6_5 = createBoardAfterMove765();
    public static final Board BOARD_AFTER_MOVE_9_6_4 = createBoardAfterMove964();

    public static final Board BOARD_AFTER_MOVE_3_4 = createBoardAfterMove34();
    public static final Board BOARD_AFTER_MOVE_3_5 = createBoardAfterMove35();
    public static final Board BOARD_AFTER_MOVE_6_4 = createBoardAfterMove64();
    public static final Board BOARD_AFTER_MOVE_6_5 = createBoardAfterMove65();

    public static final Board[] BOARD_POSITIONS_AFTER_FIRST_MOVE = {
            BOARD_AFTER_MOVE_0_3_5, BOARD_AFTER_MOVE_2_3_4, BOARD_AFTER_MOVE_7_6_5, BOARD_AFTER_MOVE_9_6_4,
            BOARD_AFTER_MOVE_3_4, BOARD_AFTER_MOVE_3_5, BOARD_AFTER_MOVE_6_4, BOARD_AFTER_MOVE_6_5};

    private static Board createBoardAfterMove035() {
        State[] cells = createCellsOfInitialState();
        cells[0] = EMPTY;
        cells[5] = WHITE;
        return new Board(cells);
    }

    private static Board createBoardAfterMove234() {
        State[] cells = createCellsOfInitialState();
        cells[2] = EMPTY;
        cells[4] = WHITE;
        return new Board(cells);
    }

    private static Board createBoardAfterMove765() {
        State[] cells = createCellsOfInitialState();
        cells[5] = BLACK;
        cells[7] = EMPTY;
        return new Board(cells);
    }

    private static Board createBoardAfterMove964() {
        State[] cells = createCellsOfInitialState();
        cells[4] = BLACK;
        cells[9] = EMPTY;
        return new Board(cells);
    }

    private static Board createBoardAfterMove34() {
        State[] cells = createCellsOfInitialState();
        cells[3] = EMPTY;
        cells[4] = WHITE;
        return new Board(cells);
    }

    private static Board createBoardAfterMove35() {
        State[] cells = createCellsOfInitialState();
        cells[3] = EMPTY;
        cells[5] = WHITE;
        return new Board(cells);
    }

    private static Board createBoardAfterMove64() {
        State[] cells = createCellsOfInitialState();
        cells[4] = BLACK;
        cells[6] = EMPTY;
        return new Board(cells);
    }

    private static Board createBoardAfterMove65() {
        State[] cells = createCellsOfInitialState();
        cells[5] = BLACK;
        cells[6] = EMPTY;
        return new Board(cells);
    }

    private static State[] createCellsOfInitialState() {
        State[] cells = new State[10];

        for (int i = 0; i <= 3; i++) {
            cells[i] = WHITE;
        }

        cells[4] = EMPTY;
        cells[5] = EMPTY;

        for (int i = 6; i <= 9; i++) {
            cells[i] = BLACK;
        }

        return cells;
    }
}
