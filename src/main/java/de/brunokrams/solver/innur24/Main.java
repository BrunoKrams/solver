package de.brunokrams.solver.innur24;

import de.brunokrams.solver.Dijkstra;
import de.brunokrams.solver.Node;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Node<Board> initialNode = new BoardNode(Board.initialPosition());
        Node<Board> targetNode = new BoardNode(Board.targetPosition());
        List<Node<Board>> resultingPath = Dijkstra.findShortestPathBetweenNodes(initialNode, targetNode);
        for (int i=0; i<resultingPath.size(); i++) {
            System.out.println(resultingPath.get(i).getState() + "\n");
        }
    }

}
