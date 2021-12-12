package de.brunokrams.solver.zeitraetsel;

public enum Cell {
    CELL_0_0(0, 0, 0),
    CELL_0_1(1, 0, 1),
    CELL_0_2(2, 0, 2),
    CELL_0_3(3, 0, 3),
    CELL_0_4(4, 0, 4),
    CELL_0_5(5, 0, 5),
    CELL_1_0(6, 1, 0),
    CELL_1_1(7, 1, 1),
    CELL_1_2(8, 1, 2),
    CELL_1_3(9, 1, 3),
    CELL_1_4(10, 1, 4),
    CELL_1_5(11, 1, 5),
    CELL_2_0(12, 2, 0),
    CELL_2_1(13, 2, 1),
    CELL_2_2(14, 2, 2),
    CELL_2_3(15, 2, 3),
    CELL_2_4(16, 2, 4),
    CELL_2_5(17, 2, 5),
    CELL_3_0(18, 3, 0),
    CELL_3_1(19, 3, 1),
    CELL_3_2(20, 3, 2),
    CELL_3_3(21, 3, 3),
    CELL_3_4(22, 3, 4),
    CELL_3_5(23, 3, 5),
    CELL_4_0(24, 4, 0),
    CELL_4_1(25, 4, 1),
    CELL_4_2(26, 4, 2),
    CELL_4_3(27, 4, 3),
    CELL_4_4(28, 4, 4),
    CELL_4_5(29, 4, 5),
    CELL_5_0(30, 5, 0),
    CELL_5_1(31, 5, 1),
    CELL_5_2(32, 5, 2),
    CELL_5_3(33, 5, 3),
    CELL_5_4(34, 5, 4),
    CELL_5_5(35, 5, 5);

    private int index;
    private int row;
    private int column;

    Cell(int index, int row, int column) {
        this.index = index;
        this.row = row;
        this.column = column;
    }

    public int getIndex() {
        return index;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public static Cell getCellAt(int row, int column) {
        return values()[row * 6 + column];
    }
}
