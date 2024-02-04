package de.brunokrams.solver.kidssudoku;

import de.brunokrams.solver.common.Node;

import java.util.ArrayList;
import java.util.List;

public class KidsSudokuNode extends Node<KidsSudoku> {

    public KidsSudokuNode(KidsSudoku state) {
        super(state);
    }

    @Override
    public List<Node<KidsSudoku>> getAdjacentNodes() {
        List<Node<KidsSudoku>> result = new ArrayList<>();
        Integer[][] sudokuAsIntegerMatrix = getState().toIntegerArray();
        for (int row = 0; row < sudokuAsIntegerMatrix.length; row++) {
            for (int column = 0; column < sudokuAsIntegerMatrix[row].length; column++) {
                if (sudokuAsIntegerMatrix[row][column] == null) {
                    for (int i = 1; i <= 6; i++) {
                        Integer[][] next = sudokuAsIntegerMatrix.clone();
                        next[row][column] = i;
                        KidsSudoku nextKidsKidsSudoku = KidsSudoku.createFromMatrix(next);
                        if (nextKidsKidsSudoku.isValid()) {
                            result.add(new KidsSudokuNode(nextKidsKidsSudoku)
                            );
                        }
                    }
                }
            }
        }
        return result;
    }
}
