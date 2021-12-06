package de.brunokrams.solitairsolver;


import java.util.Arrays;

public class Board {
    private Cell[] cells = new Cell[33];

    private Board() {
    }

    public static Board initialPosition() {
        Board board = new Board();
        for (int i = 0; i < 33; i++) {
            board.cells[i] = new Cell(true);
        }
        board.cells[16].markAsBlank();
        return board;
    }

    @Override
    public String toString() {
        return "  " + cells[0] + cells[1] + cells[2] + "  \n"
                + "  " + cells[3] + cells[4] + cells[5] + "  \n"
                + cells[6] + cells[7] + cells[8] + cells[9] + cells[10] + cells[11] + cells[12] + "\n"
                + cells[13] + cells[14] + cells[15] + cells[16] + cells[17] + cells[18] + cells[19] + "\n"
                + cells[20] + cells[21] + cells[22] + cells[23] + cells[24] + cells[25] + cells[26] + "\n"
                + "  " + cells[27] + cells[28] + cells[29] + "  \n"
                + "  " + cells[30] + cells[31] + cells[32] + "  ";
    }

}