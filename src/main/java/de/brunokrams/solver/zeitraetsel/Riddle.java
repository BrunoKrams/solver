package de.brunokrams.solver.zeitraetsel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Riddle {

    private final List<Integer> values;

    public static Riddle EMPTY = new Riddle();

    private Riddle() {
        this.values = new ArrayList<>();
    }

    private Riddle(List<Integer> values) {
        this.values = values;
    }

    public boolean isComplete() {
        return values.size() == 36;
    }

    public List<Riddle> getValidSuccessors() {
        return getAllSuccessors().stream().filter(Riddle::isValid).collect(Collectors.toList());
    }

    public Integer getValueOf(Range range) {
        // Todo implement
        return null;
    }

    private List<Riddle> getAllSuccessors() {
        List<Riddle> result = new ArrayList<>();
        List<Integer> newValues;
        for (int i = 0; i < 10; i++) {
            newValues = new ArrayList<>(values);
            newValues.add(i);
            result.add(new Riddle(newValues));
        }
        return result;
    }

    private boolean isValid() {
        Cell lastSetCell = getLastSetCell();
        if (lastSetCell == null) {
            return true;
        }
        return getApplicableRules().stream().allMatch(rule -> rule.apply(this));
    }

    private List<Rule> getApplicableRules() {
        // TODO implement
        return null;
    }

    private Cell getLastSetCell() {
        if (values.isEmpty()) {
            return null;
        }
        return Cell.values()[values.size() - 1];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        for (int row = 0; row < 6; row++) {
            for (int column = 0; column < 6; column++) {
                if (index < values.size()) {
                    stringBuilder.append(values.get(index));
                } else {
                    stringBuilder.append("X");
                }
                stringBuilder.append("\t");
                index++;
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
