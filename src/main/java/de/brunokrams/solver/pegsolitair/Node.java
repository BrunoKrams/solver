package de.brunokrams.solver.pegsolitair;

import java.util.List;
import java.util.Objects;

public abstract class Node<T> {

    private T state;

    public Node(T state) {
        this.state = state;
    }

    public abstract List<Node<T>> getSuccessors();

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

}
