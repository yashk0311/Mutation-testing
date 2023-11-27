package dsa.algorithms;

import java.util.HashSet;
import java.util.Set;

public class SetZeros {
    public void rewrite(int[][] matrix) {
        validateInput(matrix);

        Set<Integer> rowsToSkip = new HashSet<Integer>();
        Set<Integer> columnsToSkip = new HashSet<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (shouldPaintRowAndColumn(matrix, i, j, rowsToSkip, columnsToSkip)) {
                    rewriteRow(matrix, i, rowsToSkip);
                    rewriteColumn(matrix, j, columnsToSkip);
                }
            }
        }
    }

    private void rewriteRow(int[][] matrix, int i, Set<Integer> rowsToSkip) {
        rowsToSkip.add(i);
        for (int x = 0; x < matrix.length; x++) {
            matrix[i][x] = 0;
        }
    }

    private void rewriteColumn(int[][] matrix, int j, Set<Integer> columnsToSkip) {
        columnsToSkip.add(j);
        for (int y = 0; y < matrix[j].length; y++) {
            matrix[y][j] = 0;
        }
    }

    private boolean shouldPaintRowAndColumn(int[][] matrix, int i, int j, Set<Integer> rowsToSkip,
                                            Set<Integer> columnsToSkip) {
        return matrix[i][j] == 0 && !rowsToSkip.contains(i) && !columnsToSkip.contains(j);
    }

    private void validateInput(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("You can't pass a null instance as input parameter.");
        }
    }
}
