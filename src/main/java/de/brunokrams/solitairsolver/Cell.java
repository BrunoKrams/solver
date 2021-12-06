package de.brunokrams.solitairsolver;

public class Cell {

    private boolean containsMarble;

    public Cell(boolean containsMarble) {
        this.containsMarble = containsMarble;
    }

    public boolean containsMarble() {
        return containsMarble;
    }

    public void markAsBlank() {
        this.containsMarble = false;
    }

    public void markAsContainingMarble() {
        this.containsMarble = true;
    }

    @Override
    public String toString() {
        return containsMarble ? "X" : "O";
    }
}
