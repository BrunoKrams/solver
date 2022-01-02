package de.brunokrams.solver.pegsolitair;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PegSolitairBoard {
    private boolean[] cells;

    public PegSolitairBoard(boolean[] cells) {
        this.cells = cells;
    }

    public static PegSolitairBoard initialPosition() {
        boolean[] cells = new boolean[33];
        Arrays.fill(cells, true);
        cells[16] = false;
        return new PegSolitairBoard(cells);
    }

    public static PegSolitairBoard targetPosition() {
        boolean[] cells = new boolean[33];
        cells[16] = true;
        return new PegSolitairBoard(cells);
    }

    public List<PegSolitairBoard> getSuccessors() {
        return getMovableTriples().stream().map(this::performMoveOnTriple).collect(Collectors.toList());
    }

    private List<Triple> getMovableTriples() {
        return Arrays.stream(Triple.values()).filter(this::isMovable).collect(Collectors.toList());
    }

    private boolean isMovable(Triple triple) {
        return cells[triple.getFirstCell()] && cells[triple.getMiddleCell()] && !cells[triple.getLastCell()];
    }

    private PegSolitairBoard performMoveOnTriple(Triple triple) {
        boolean[] newCells = cells.clone();
        newCells[triple.getFirstCell()] = false;
        newCells[triple.getMiddleCell()] = false;
        newCells[triple.getLastCell()] = true;
        return new PegSolitairBoard(newCells);
    }

    @Override
    public String toString() {
        return "  " + booleanToXO(cells[0]) + booleanToXO(cells[1]) + booleanToXO(cells[2]) + "  \n"
                + "  " + booleanToXO(cells[3]) + booleanToXO(cells[4]) + booleanToXO(cells[5]) + "  \n"
                + booleanToXO(cells[6]) + booleanToXO(cells[7]) + booleanToXO(cells[8]) + booleanToXO(cells[9]) + booleanToXO(cells[10]) + booleanToXO(cells[11]) + booleanToXO(cells[12]) + "\n"
                + booleanToXO(cells[13]) + booleanToXO(cells[14]) + booleanToXO(cells[15]) + booleanToXO(cells[16]) + booleanToXO(cells[17]) + booleanToXO(cells[18]) + booleanToXO(cells[19]) + "\n"
                + booleanToXO(cells[20]) + booleanToXO(cells[21]) + booleanToXO(cells[22]) + booleanToXO(cells[23]) + booleanToXO(cells[24]) + booleanToXO(cells[25]) + booleanToXO(cells[26]) + "\n"
                + "  " + booleanToXO(cells[27]) + booleanToXO(cells[28]) + booleanToXO(cells[29]) + "  \n"
                + "  " + booleanToXO(cells[30]) + booleanToXO(cells[31]) + booleanToXO(cells[32]) + "  ";
    }

    private String booleanToXO(boolean value) {
        return value ? "X" : "O";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PegSolitairBoard board = (PegSolitairBoard) o;
        return Arrays.equals(cells, board.cells);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(cells);
    }

}