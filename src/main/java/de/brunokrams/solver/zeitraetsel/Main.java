package de.brunokrams.solver.zeitraetsel;

public class Main {

    public static void main(String[] args) {
        Riddle.EMPTY.getValidSuccessors().stream().forEach(System.out::println);
    }
}
