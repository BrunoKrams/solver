package de.brunokrams.solver.kidssudoku;


import java.util.ArrayList;
import java.util.List;

public class KidsSudoku {

    private static final int ROW_NUMBER = 6;
    private static final int COLUMN_NUMBER = 6;
    private static final int RECTANGLES_ROW_NUMBER = 3;
    private static final int RECTANGLES_COLUMN_NUMBER = 2;

    private final Area[] rows = new Area[ROW_NUMBER];
    private final Area[] columns = new Area[COLUMN_NUMBER];

    private final Area[][] rectangles = new Area[RECTANGLES_ROW_NUMBER][RECTANGLES_COLUMN_NUMBER];


    private Cell[][] cells;

    private List<Area> allAreas;

    private KidsSudoku() {
    }

    public static KidsSudoku createFromMatrix(Integer[][] matrix) {
        if (matrix.length != ROW_NUMBER) {
            throw new IllegalArgumentException();
        }
        for (int row = 0; row < ROW_NUMBER; row++) {
            if (matrix[row].length != COLUMN_NUMBER) {
                throw new IllegalArgumentException();
            }
        }

        KidsSudoku kidsSudoku = new KidsSudoku();
        kidsSudoku.cells = new Cell[ROW_NUMBER][COLUMN_NUMBER];
        kidsSudoku.allAreas = new ArrayList<>();

        List[] rows = new List[ROW_NUMBER];
        List[] columns = new List[COLUMN_NUMBER];
        List[][] rectangles = new List[RECTANGLES_ROW_NUMBER][RECTANGLES_COLUMN_NUMBER];

        for (int i = 0; i < ROW_NUMBER; i++) {
            rows[i] = new ArrayList();
        }
        for (int i = 0; i < COLUMN_NUMBER; i++) {
            columns[i] = new ArrayList();
        }
        for (int i = 0; i < RECTANGLES_ROW_NUMBER; i++) {
            for (int j = 0; j < RECTANGLES_COLUMN_NUMBER; j++) {
                rectangles[i][j] = new ArrayList();
            }
        }

        for (int row = 0; row < ROW_NUMBER; row++) {
            for (int column = 0; column < COLUMN_NUMBER; column++) {
                Cell cell = new Cell(matrix[row][column]);
                kidsSudoku.cells[row][column] = new Cell(matrix[row][column]);
                rows[row].add(cell);
                columns[column].add(cell);
                rectangles[row * RECTANGLES_ROW_NUMBER / ROW_NUMBER][column * RECTANGLES_COLUMN_NUMBER / COLUMN_NUMBER].add(cell);
            }
        }

        for (int i = 0; i < ROW_NUMBER; i++) {
            Area row = Area.createArea(rows[i]);
            kidsSudoku.rows[i] = row;
            kidsSudoku.allAreas.add(row);
        }
        for (int i = 0; i < COLUMN_NUMBER; i++) {
            Area column = Area.createArea(columns[i]);
            kidsSudoku.columns[i] = column;
            kidsSudoku.allAreas.add(column);

        }
        for (int i = 0; i < RECTANGLES_ROW_NUMBER; i++) {
            for (int j = 0; j < RECTANGLES_COLUMN_NUMBER; j++) {
                Area rectangle = Area.createArea(rectangles[i][j]);
                kidsSudoku.rectangles[i][j] = rectangle;
                kidsSudoku.allAreas.add(rectangle);
            }
        }

        return kidsSudoku;
    }

    public boolean isFilled() {
        for (int row = 0; row < ROW_NUMBER; row++) {
            for (int column = 0; column < COLUMN_NUMBER; column++) {
                if (cells[row][column].getValue() == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValid() {
        return allAreas.stream().allMatch(Area::isValid);
    }

    public Integer[][] toIntegerArray() {
        Integer[][] result = new Integer[ROW_NUMBER][COLUMN_NUMBER];
        for (int row = 0; row < ROW_NUMBER; row++) {
            for (int column = 0; column < COLUMN_NUMBER; column++) {
                result[row][column] = cells[row][column].getValue();
            }
        }
        return result;
    }

    @Override
    public String toString() {
        List<String> rows = new ArrayList<>();
        for (int row = 0; row < ROW_NUMBER; row++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int colummn = 0; colummn < COLUMN_NUMBER; colummn++) {
                stringBuilder.append(cells[row][colummn].getValue() != null ? cells[row][colummn].getValue() : " ");
            }
            rows.add(stringBuilder.toString());
        }
        return String.join("\n", rows);
    }

}
