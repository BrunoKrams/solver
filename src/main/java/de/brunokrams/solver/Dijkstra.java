package de.brunokrams.solver;

import java.util.*;
import java.util.List;

public class Dijkstra {


    public static <T> List<Node<T>> findShortestPathBetweenNodes(Node<T> start, Node<T> goal) {
        List<Node<T>> openList = new ArrayList<>();
        openList.add(start);
        Map<Node<T>, Node<T>> predecessorMap = new HashMap<>();
        Map<Node<T>, Integer> distanceMap = new HashMap<>();
        distanceMap.put(start, 0);

        while (!openList.isEmpty()) {
            Node<T> current = openList.stream().min(Comparator.comparing(distanceMap::get)).get();
            if (current.equals(goal)) {
                return reconstructPath(predecessorMap, current);
            }
            openList.remove(current);

            List<Node<T>> adjacentNodes = current.getAdjacentNodes();
            for (Node<T> adjacentNode : adjacentNodes) {
                Integer tentativeDistance = distanceMap.get(current) + 1;

                if (!distanceMap.containsKey(adjacentNode) || tentativeDistance < distanceMap.get(adjacentNode)) {
                    predecessorMap.put(adjacentNode, current);

                    distanceMap.put(adjacentNode, tentativeDistance);

                    if (!openList.contains(adjacentNode)) {
                        openList.add(adjacentNode);
                    }

                }
            }
        }
        return null;
    }

    private static <T> List<Node<T>> reconstructPath(Map<Node<T>, Node<T>> predecessorMap, Node<T> node) {
        List<Node<T>> result = new ArrayList<>();
        result.add(node);

        Node<T> current = node;
        while (predecessorMap.containsKey(current)) {
            current = predecessorMap.get(current);
            result.add(current);
        }
        return result;
    }
}

