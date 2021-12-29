package de.brunokrams.solver.innur24;


import de.brunokrams.solver.Node;

import java.util.List;
import java.util.stream.Collectors;

public class BoardNode extends Node<Board> {

    public BoardNode(Board state) {
        super(state);
    }

    @Override
    public List<Node<Board>> getAdjacentNodes() {
        return getState().getSuccessors().stream().map(BoardNode::new).collect(Collectors.toList());
    }

}
