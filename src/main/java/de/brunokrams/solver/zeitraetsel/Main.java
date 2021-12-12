package de.brunokrams.solver.zeitraetsel;

import de.brunokrams.solver.zeitraetsel.model.Riddle;

public class Main {

    public static void main(String[] args) {
        Riddle.EMPTY.getValidSuccessors().stream().forEach(System.out::println);
    }
}
