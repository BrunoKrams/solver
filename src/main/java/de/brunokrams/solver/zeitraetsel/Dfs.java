package de.brunokrams.solver.zeitraetsel;

import de.brunokrams.solver.zeitraetsel.model.Riddle;

import java.util.List;
import java.util.Stack;

public class Dfs {

    public static Riddle solve(Riddle riddle) {
        Stack<Riddle> toBeVisited = new Stack<Riddle>();
        toBeVisited.push(riddle);

        Riddle current;
        while (!toBeVisited.isEmpty()) {
            current = toBeVisited.pop();
            if (current.isComplete()) {
                return current;
            }
            List<Riddle> successors = current.getValidSuccessors();
            successors.forEach(toBeVisited::push);
        }
        return null;
    }
}
