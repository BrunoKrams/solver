package de.brunokrams.solitairsolver;


import java.util.ArrayList;
import java.util.List;

public class Dfs {

    private static List<Board> visited;
    private static List<List<Board>> result;
    private static List<Board> currentPath;

    public static List<List<Board>> calculateAllPathsBetweenBoards(Board initialBoard, Board finalBoard) {
        visited = new ArrayList<>();
        result = new ArrayList<>();
        currentPath = new ArrayList<>();
        dfsAll(initialBoard, finalBoard);
        return result;
    }

    private static void dfsAll(Board u, Board v) {
        if (visited.contains(u)) {
            return;
        }
        visited.add(u);
        currentPath.add(u);

        if (u.equals(v)) {
            result.add(currentPath);
            System.out.println("Number of paths found: " + result.size());
            visited.remove(u);
            currentPath.remove(currentPath.size() - 1);
            return;
        }
        for (Board successor : u.getSuccessors()) {
            dfsAll(successor, v);
        }
        currentPath.remove(currentPath.size() - 1);
        visited.remove(u);
    }
}


