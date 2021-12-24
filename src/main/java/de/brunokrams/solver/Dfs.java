package de.brunokrams.solver;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Dfs {

    public static <T> List<Node<T>> findSomePathBetweenNodes(Node<T> start, Node<T> target) {
        Stack<Node<T>> toBeVisited = new Stack<>();
        List<Node<T>> visited = new ArrayList<>();

        List<Node<T>> currentPath = new ArrayList<>();

        toBeVisited.push(start);

        while (!toBeVisited.isEmpty()) {
            Node<T> current = toBeVisited.pop();
            visited.add(current);
            currentPath.add(current);

            if (current.equals(target)) {
                return currentPath;
            }
            List<Node<T>> nonVisitedChildren = current.getSuccessors().stream().filter(child -> !visited.contains(child)).collect(Collectors.toList());

            if (nonVisitedChildren.isEmpty()) {
                currentPath.remove(currentPath.size() - 1);
            } else {
                nonVisitedChildren.forEach(toBeVisited::push);
            }
        }
        return null;
    }

    public static <T> List<Node<T>> findSomePathOfBetweenNodesOfLengthLessThanAllowedLength(Node<T> start, Node<T> target, int allowedLength) {
        Stack<Node<T>> toBeVisited = new Stack<>();
        List<Node<T>> visited = new ArrayList<>();

        List<Node<T>> currentPath = new ArrayList<>();

        toBeVisited.push(start);

        while (!toBeVisited.isEmpty()) {
            Node<T> current = toBeVisited.pop();
            visited.add(current);
            currentPath.add(current);

            if (current.equals(target)) {
                return currentPath;
            }

            List<Node<T>> nonVisitedChildren = current.getSuccessors().stream().filter(child -> !visited.contains(child)).collect(Collectors.toList());
            if (currentPath.size() >= allowedLength || nonVisitedChildren.isEmpty()) {
                currentPath.remove(currentPath.size() - 1);
            } else {
                nonVisitedChildren.forEach(toBeVisited::push);
            }
        }
        return null;
    }


}


