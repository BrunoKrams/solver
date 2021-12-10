package de.brunokrams.solitairsolver;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<Board>> result = Dfs.calculateAllPathsBetweenBoards(Board.initialPosition(), Board.targetPosition());
        for (int i = 0; i<result.size(); i++) {
            System.out.println("\nNow printing path: "  + i);
            for (Board board: result.get(i)) {
                System.out.println("\n");
                System.out.println(board);
            }
        }
    }
}
