package de.brunokrams.solver.common;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Dfs {

    public static <T> List<Node<T>> findSomePathBetweenNodes(Node<T> start, Node<T> target) {
        Stack<Node<T>> toBeVisited = new Stack<>();
        List<Node<T>> visited = new ArrayList<>();


        toBeVisited.push(start);

        while (!toBeVisited.isEmpty()) {
            Node<T> current = toBeVisited.pop();
            visited.add(current);

            if (current.equals(target)) {
                return buildBath(current);
            }
            List<Node<T>> nonVisitedChildren = current.getAdjacentNodes().stream().filter(child -> !visited.contains(child)).collect(Collectors.toList());

            if (!nonVisitedChildren.isEmpty()) {
                nonVisitedChildren.forEach(child-> {child.setPredecessor(current); toBeVisited.push(child);});
            }
        }
        return null;
    }

    private static <T> List<Node<T>> buildBath(Node<T> node) {
        List<Node<T>> result = new ArrayList<>();
        result.add(node);
        while(node.getPredecessor() != null) {
            node = node.getPredecessor();
            result.add(0, node);
        }
        return result;
    }

}


