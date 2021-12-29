package de.brunokrams.solver.innur24;

public enum Triple {
    TRIPLE_0_3_5(0, 3, 5),
    TRIPLE_2_3_4(2, 3, 4),
    TRIPLE_4_3_2(4, 3, 2),
    TRIPLE_4_6_9(4, 6, 9),
    TRIPLE_5_3_0(5, 3, 0),
    TRIPLE_5_6_7(5, 6, 7),
    TRIPLE_7_6_5(7, 6, 5),
    TRIPLE_9_6_4(9, 6, 4);

    private final int firstCell;
    private final int middleCell;
    private final int lastCell;

    Triple(int firstCell, int middleCell, int lastCell) {
        this.firstCell = firstCell;
        this.middleCell = middleCell;
        this.lastCell = lastCell;
    }


    public int getLastCell() {
        return lastCell;
    }

    public int getMiddleCell() {
        return middleCell;
    }

    public int getFirstCell() {
        return firstCell;
    }

}
