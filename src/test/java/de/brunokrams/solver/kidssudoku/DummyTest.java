package de.brunokrams.solver.kidssudoku;

import de.brunokrams.solver.common.Dfs;
import de.brunokrams.solver.common.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DummyTest {

    @Test
    void doSomething() {
        Sudoku start = Sudoku.createFromMatrix(TestDataProvider.validSudoku());
        KidsSudokuNode startingNode = new KidsSudokuNode(start);
        List<Node<Sudoku>> result  =Dfs.findAllFinalNodes(startingNode, kidsSudoku -> kidsSudoku.isFilled() && kidsSudoku.isValid());

        for (Node<Sudoku> finalNode : result) {
            System.out.println(finalNode.getState());
        }
    }

}
