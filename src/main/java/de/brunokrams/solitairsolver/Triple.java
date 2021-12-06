package de.brunokrams.solitairsolver;

public class Triple {

    private Cell start;
    private Cell middle;
    private Cell end;


    public Triple(Cell start, Cell middle, Cell end) {
        this.start = start;
        this.middle = middle;
        this.end = end;
    }

    public boolean canJump() {
        return start.containsMarble() && middle.containsMarble() && !end.containsMarble();
    }

    public void doJump() throws IllegalMoveException {
        if (!canJump()) {
            throw new IllegalMoveException();
        }
        start.markAsBlank();
        middle.markAsBlank();
        end.markAsContainingMarble();
    }

    @Override
    public String toString() {
        return start.toString() + middle.toString() + end.toString();
    }
}


