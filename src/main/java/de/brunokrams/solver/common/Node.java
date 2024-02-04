package de.brunokrams.solver.common;

import java.util.List;
import java.util.Objects;

public abstract class Node<T> {

    private final T state;

    private Node<T> predecessor;

    public Node(T state) {
        this.state = state;
    }

    public abstract List<Node<T>> getAdjacentNodes();

    public T getState() {
        return state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(state, node.state);
    }

    public Node<T> getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Node<T> predecessor) {
        this.predecessor = predecessor;
    }
}
