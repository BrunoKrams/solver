package de.brunokrams.solver.innur24;


import de.brunokrams.solver.common.Node;

import java.util.List;
import java.util.stream.Collectors;

public class Innur24BoardNode extends Node<Innur24Board> {

    public Innur24BoardNode(Innur24Board state) {
        super(state);
    }

    @Override
    public List<Node<Innur24Board>> getAdjacentNodes() {
        return getState().getSuccessors().stream().map(Innur24BoardNode::new).collect(Collectors.toList());
    }

}
