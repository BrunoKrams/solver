package de.brunokrams.solver.zeitraetsel.model;

import de.brunokrams.solver.zeitraetsel.rules.Rule;
import de.brunokrams.solver.zeitraetsel.rules.RulesContainer;

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

    public Integer getValueOfRange(Range range) {
        List<Integer> digits = getDigitsOfRange(range);
        int result = 0;
        int power = 1;
        for (int i = digits.size() - 1; i >= 0; i--) {
            Integer digit = digits.get(i);
            if (digit == null) {
                return null;
            }
            result += digit * power;
            power *= 10;
        }
        return result;
    }

    public Integer getReverseValueOfRange(Range range) {
        List<Integer> digits = getDigitsOfRange(range);
        int result = 0;
        int power = 1;
        for (int i = 0; i < digits.size(); i++) {
            Integer digit = digits.get(i);
            if (digit == null) {
                return null;
            }
            result += digit * power;
            power *= 10;
        }
        return result;
    }

    private List<Integer> getDigitsOfRange(Range range) {
        return range.getCells().stream().map(cell -> cell.getIndex() < values.size() ? values.get(cell.getIndex()) : null).collect(Collectors.toList());
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
        if (values.size() == 0) {
            return true;
        }
        return getApplicableRules().stream().allMatch(rule -> rule.apply(this));
    }

    private List<Rule> getApplicableRules() {
        List<Range> completedRanges = CompletedRanges.getCumulatedCompletedRangesByCellIndex(values.size() - 1);
        return RulesContainer.getAllRules().stream().filter(rule -> completedRanges.containsAll(rule.getAffectedRanges())).collect(Collectors.toList());
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
