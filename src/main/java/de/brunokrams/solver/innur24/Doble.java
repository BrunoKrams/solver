package de.brunokrams.solver.innur24;

public enum Doble {

    DOBLE_0_3(0, 3),
    DOBLE_1_3(1, 3),
    DOBLE_2_3(2, 3),
    DOBLE_3_0(3, 0),
    DOBLE_3_1(3, 1),
    DOBLE_3_2(3, 2),
    DOBLE_3_4(3, 4),
    DOBLE_3_5(3, 5),
    DOBLE_4_3(4, 3),
    DOBLE_4_6(4, 6),
    DOBLE_5_3(5, 3),
    DOBLE_5_6(5, 6),
    DOBLE_6_4(6, 4),
    DOBLE_6_5(6, 5),
    DOBLE_6_7(6, 7),
    DOBLE_6_8(6, 8),
    DOBLE_6_9(6, 9),
    DOBLE_7_6(7, 6),
    DOBLE_8_6(8, 6),
    DOBLE_9_6(9, 6);

    private final int firstCell;
    private final int lastCell;

    Doble(int firstCell, int lastCell) {
        this.firstCell = firstCell;
        this.lastCell = lastCell;
    }


    public int getLastCell() {
        return lastCell;
    }

    public int getFirstCell() {
        return firstCell;
    }
}
