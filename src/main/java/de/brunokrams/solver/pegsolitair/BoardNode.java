package de.brunokrams.solver.pegsolitair;

import java.util.List;
import java.util.stream.Collectors;

public class BoardNode extends Node<Board> {

    public BoardNode(Board state) {
        super(state);
    }

    @Override
    public List<Node<Board>> getSuccessors() {
        return getState().getSuccessors().stream().map(BoardNode::new).collect(Collectors.toList());
    }
}
