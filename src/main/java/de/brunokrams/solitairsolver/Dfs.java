package de.brunokrams.solitairsolver;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Dfs {

    public static List<Board> findSomePathBetweenBoards(Board start, Board target) {
        Stack<Board> toBeVisited = new Stack<>();
        List<Board> visited = new ArrayList<>();

        List<Board> currentPath = new ArrayList<>();

        toBeVisited.push(start);

        while (!toBeVisited.isEmpty()) {
            Board current = toBeVisited.pop();
            visited.add(current);
            currentPath.add(current);

            if (current.equals(target)) {
                return currentPath;
            }
            List<Board> nonVisitedChildren = current.getSuccessors().stream().filter(child -> !visited.contains(child)).collect(Collectors.toList());

            if (nonVisitedChildren.isEmpty()) {
                currentPath.remove(currentPath.size() - 1);
            } else {
                nonVisitedChildren.forEach(toBeVisited::push);
            }
        }
        return null;
    }


}


