package de.brunokrams.solver.sudoku;

import de.brunokrams.solver.common.Node;

import java.util.ArrayList;
import java.util.List;

public class SudokuNode extends Node<Sudoku> {

    public SudokuNode(Sudoku state) {
        super(state);
    }

    @Override
    public List<Node<Sudoku>> getAdjacentNodes() {
        List<Node<Sudoku>> result = new ArrayList<>();
        Integer[][] sudokuAsIntegerMatrix = getState().toIntegerArray();
        for (int row = 0; row < sudokuAsIntegerMatrix.length; row++) {
            for (int column = 0; column < sudokuAsIntegerMatrix[row].length; column++) {
                if (sudokuAsIntegerMatrix[row][column] == null) {
                    for (int i = 1; i <= 6; i++) {
                        Integer[][] next = sudokuAsIntegerMatrix.clone();
                        next[row][column] = i;
                        Sudoku nextSudoku = Sudoku.createFromMatrix(next);
                        if (nextSudoku.isValid()) {
                            result.add(new SudokuNode(nextSudoku)
                            );
                        }
                    }
                }
            }
        }
        return result;
    }
}
