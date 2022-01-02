package de.brunokrams.solver;

import de.brunokrams.solver.common.Dfs;
import de.brunokrams.solver.common.Dijkstra;
import de.brunokrams.solver.common.Node;
import de.brunokrams.solver.innur24.Innur24Board;
import de.brunokrams.solver.innur24.Innur24BoardNode;
import de.brunokrams.solver.pegsolitair.PegSolitairBoard;
import de.brunokrams.solver.pegsolitair.PegSolitairBoardNode;

import java.util.List;

public class Application {

    private static final String PEG_SOLITAIR = "pegsolitair";
    private static final String IN_NUR_24 = "innur24";

    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.err.println("No arguments provided.");
            System.exit(1);
        }
        String game = args[0];

        if (PEG_SOLITAIR.equals(game)) {
            print(solvePegSolitair());
            System.exit(0);
        }

        if (IN_NUR_24.equals(game)) {
            print(solveInnur24());
            System.exit(0);
        }
        System.err.println("Wrong arguments provided.");
    }

    private static <T> void print(List<Node<T>> solutionList) {
        solutionList.forEach(node -> {
            System.out.println(node.getState());
            System.out.println("\n");
        });
    }

    private static List<Node<Innur24Board>> solveInnur24() {
        return Dijkstra.findShortestPathBetweenNodes(
                new Innur24BoardNode(Innur24Board.initialPosition()),
                new Innur24BoardNode(Innur24Board.targetPosition())
        );
    }

    private static List<Node<PegSolitairBoard>> solvePegSolitair() {
        return Dfs.findSomePathBetweenNodes(
                new PegSolitairBoardNode(PegSolitairBoard.initialPosition()),
                new PegSolitairBoardNode(PegSolitairBoard.targetPosition())
        );
    }

}
