package de.brunokrams.solver.pegsolitair;

import de.brunokrams.solver.common.Node;

import java.util.List;
import java.util.stream.Collectors;

public class PegSolitairBoardNode extends Node<PegSolitairBoard> {

    public PegSolitairBoardNode(PegSolitairBoard state) {
        super(state);
    }

    @Override
    public List<Node<PegSolitairBoard>> getAdjacentNodes() {
        return getState().getSuccessors().stream().map(PegSolitairBoardNode::new).collect(Collectors.toList());
    }
}
