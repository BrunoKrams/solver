package de.brunokrams.solver.innur24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static de.brunokrams.solver.innur24.State.*;

public class Board {
    private State[] cells;

    public Board(State[] cells) {
        this.cells = cells;
    }

    public static Board initialPosition() {
        State[] cells = new State[10];

        for (int i = 0; i<= 3;i++) {
            cells[i] = WHITE;
        }

        cells[4] = EMPTY;
        cells[5] = EMPTY;

        for (int i = 6; i<= 9;i++) {
            cells[i] = BLACK;
        }

        return new Board(cells);
    }

    public static Board targetPosition() {
        State[] cells = new State[10];

        for (int i = 0; i<= 3;i++) {
            cells[i] = BLACK;
        }

        cells[4] = EMPTY;
        cells[5] = EMPTY;

        for (int i = 6; i<= 9;i++) {
            cells[i] = WHITE;
        }

        return new Board(cells);
    }

    public List<Board> getSuccessors() {
        List<Board> result = new ArrayList<>();
        result.addAll(getMovableTriples().stream().map(this::performMoveOnTriple).collect(Collectors.toList()));
        result.addAll(getMovableDobles().stream().map(this::performMoveOnDoble).collect(Collectors.toList()));
        return result;
    }

    public List<Doble> getMovableDobles() {
        return Arrays.stream(Doble.values()).filter(this::isMovable).collect(Collectors.toList());
    }

    private boolean isMovable(Doble doble) {
        return cells[doble.getFirstCell()] != EMPTY &&
                cells[doble.getLastCell()] == EMPTY;
    }

    public List<Triple> getMovableTriples() {
        return Arrays.stream(Triple.values()).filter(this::isMovable).collect(Collectors.toList());
    }

    private Board performMoveOnDoble(Doble doble) {
        State[] newCells = cells.clone();
        newCells[doble.getFirstCell()] = EMPTY;
        newCells[doble.getLastCell()] = cells[doble.getFirstCell()];
        return new Board(newCells);
    }

    private boolean isMovable(Triple triple) {
        return cells[triple.getFirstCell()] != EMPTY &&
        cells[triple.getMiddleCell()] != EMPTY &&
        cells[triple.getLastCell()] == EMPTY;
    }

    private Board performMoveOnTriple(Triple triple) {
        State[] newCells = cells.clone();
        newCells[triple.getFirstCell()] = EMPTY;
        newCells[triple.getLastCell()] = cells[triple.getFirstCell()];
        return new Board(newCells);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(" ");
        stringBuilder.append(stateToString(cells[0]));
        stringBuilder.append(" ");
        stringBuilder.append(stateToString(cells[4]));
        stringBuilder.append(" ");
        stringBuilder.append(stateToString(cells[7]));

        stringBuilder.append("\n");

        stringBuilder.append(stateToString(cells[1]));
        stringBuilder.append(" ");
        stringBuilder.append(stateToString(cells[3]));
        stringBuilder.append(" ");
        stringBuilder.append(stateToString(cells[6]));
        stringBuilder.append(" ");
        stringBuilder.append(stateToString(cells[8]));

        stringBuilder.append("\n");

        stringBuilder.append(" ");
        stringBuilder.append(stateToString(cells[2]));
        stringBuilder.append(" ");
        stringBuilder.append(stateToString(cells[5]));
        stringBuilder.append(" ");
        stringBuilder.append(stateToString(cells[9]));

        return stringBuilder.toString();
    }

    private String stateToString(State state) {
        switch (state) {
            case BLACK:
                return "B";
            case WHITE:
                return "W";
            case EMPTY:
                return "E";
            default:
                throw new IllegalStateException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Arrays.equals(cells, board.cells);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(cells);
    }

}