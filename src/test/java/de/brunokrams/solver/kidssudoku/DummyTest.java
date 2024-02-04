package de.brunokrams.solver.kidssudoku;

import de.brunokrams.solver.common.Dfs;
import de.brunokrams.solver.common.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DummyTest {

    @Test
    void doSomething() {
        KidsSudoku start = KidsSudoku.createFromMatrix(TestDataProvider.validSudoku());
        KidsSudokuNode startingNode = new KidsSudokuNode(start);
        List<Node<KidsSudoku>> result  =Dfs.findAllFinalNodes(startingNode, kidsKidsSudoku -> kidsKidsSudoku.isFilled() && kidsKidsSudoku.isValid());

        for (Node<KidsSudoku> finalNode : result) {
            System.out.println(finalNode.getState());
        }
    }

}
