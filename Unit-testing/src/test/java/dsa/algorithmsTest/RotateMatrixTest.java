package dsa.algorithmsTest;
import dsa.algorithms.RotateMatrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateMatrixTest {

    RotateMatrix rm = new RotateMatrix();

    @Test public void NullMatrix() {
        try{
            rm.rotate(null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void DifferentHeightAndWidth() {
        try{
            int[][] matrix = new int[6][3];

            rm.rotate(matrix);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void EmptyMatrix() {
        try{
            int[][] matrix = new int[0][0];

            rm.rotate(matrix);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void shouldRotateMatrix() {
        int[][] matrix = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };

        rm.rotate(matrix);

        int[][] expectedResult = { { 6, 3, 0 }, { 7, 4, 1 }, { 8, 5, 2 } };
        Assertions.assertArrayEquals(expectedResult, matrix);
    }
}
