package de.brunokrams.solver.innur24;

import static de.brunokrams.solver.innur24.State.*;

public class BoardTestData {

    public static final Innur24Board INNUR_24_BOARD_AFTER_MOVE_035 = createBoardAfterMove035();
    public static final Innur24Board INNUR_24_BOARD_AFTER_MOVE_234 = createBoardAfterMove234();
    public static final Innur24Board INNUR_24_BOARD_AFTER_MOVE_765 = createBoardAfterMove765();
    public static final Innur24Board INNUR_24_BOARD_AFTER_MOVE_964 = createBoardAfterMove964();

    public static final Innur24Board INNUR_24_BOARD_AFTER_MOVE_34 = createBoardAfterMove34();
    public static final Innur24Board INNUR_24_BOARD_AFTER_MOVE_35 = createBoardAfterMove35();
    public static final Innur24Board INNUR_24_BOARD_AFTER_MOVE_64 = createBoardAfterMove64();
    public static final Innur24Board INNUR_24_BOARD_AFTER_MOVE_65 = createBoardAfterMove65();

    public static final Innur24Board[] INNUR_24_BOARD_POSITIONS_AFTER_FIRST_MOVE = {
            INNUR_24_BOARD_AFTER_MOVE_035, INNUR_24_BOARD_AFTER_MOVE_234, INNUR_24_BOARD_AFTER_MOVE_765, INNUR_24_BOARD_AFTER_MOVE_964,
            INNUR_24_BOARD_AFTER_MOVE_34, INNUR_24_BOARD_AFTER_MOVE_35, INNUR_24_BOARD_AFTER_MOVE_64, INNUR_24_BOARD_AFTER_MOVE_65};

    private static Innur24Board createBoardAfterMove035() {
        State[] cells = createCellsOfInitialState();
        cells[0] = EMPTY;
        cells[5] = WHITE;
        return new Innur24Board(cells);
    }

    private static Innur24Board createBoardAfterMove234() {
        State[] cells = createCellsOfInitialState();
        cells[2] = EMPTY;
        cells[4] = WHITE;
        return new Innur24Board(cells);
    }

    private static Innur24Board createBoardAfterMove765() {
        State[] cells = createCellsOfInitialState();
        cells[5] = BLACK;
        cells[7] = EMPTY;
        return new Innur24Board(cells);
    }

    private static Innur24Board createBoardAfterMove964() {
        State[] cells = createCellsOfInitialState();
        cells[4] = BLACK;
        cells[9] = EMPTY;
        return new Innur24Board(cells);
    }

    private static Innur24Board createBoardAfterMove34() {
        State[] cells = createCellsOfInitialState();
        cells[3] = EMPTY;
        cells[4] = WHITE;
        return new Innur24Board(cells);
    }

    private static Innur24Board createBoardAfterMove35() {
        State[] cells = createCellsOfInitialState();
        cells[3] = EMPTY;
        cells[5] = WHITE;
        return new Innur24Board(cells);
    }

    private static Innur24Board createBoardAfterMove64() {
        State[] cells = createCellsOfInitialState();
        cells[4] = BLACK;
        cells[6] = EMPTY;
        return new Innur24Board(cells);
    }

    private static Innur24Board createBoardAfterMove65() {
        State[] cells = createCellsOfInitialState();
        cells[5] = BLACK;
        cells[6] = EMPTY;
        return new Innur24Board(cells);
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
