package de.brunokrams.solver.pegsolitair;

import de.brunokrams.solver.Dfs;
import de.brunokrams.solver.Node;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Node<Board> initialNode = new BoardNode(Board.initialPosition());
        Node<Board> targetNode = new BoardNode(Board.targetPosition());
        List<Node<Board>> resultingPath = Dfs.findSomePathBetweenNodes(initialNode, targetNode);
        resultingPath.stream().map(Node::getState).forEach(System.out::println);
    }

}
