package dsa.algorithmsTest;
import dsa.algorithms.SetZeros;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetZerosTest {
    SetZeros sz = new SetZeros();

    @Test public void NullMatrix() {
        try{
            sz.rewrite(null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void OneDimensionMatrix() {
        int[][] matrix = { { 1, 0 }, { } };

        sz.rewrite(matrix);

        int[][] expectedMatrix = { { 0, 0 }, { } };
        Assertions.assertArrayEquals(expectedMatrix, matrix);
    }

    @Test public void NonZeroElements() {
        int[][] matrix = { { 1, 1 }, { 1, 1 } };

        sz.rewrite(matrix);

        int[][] expectedMatrix = { { 1, 1 }, { 1, 1 } };
        Assertions.assertArrayEquals(expectedMatrix, matrix);
    }

    @Test public void tc1() {
        int[][] matrix = {
                { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 }
        };

        sz.rewrite(matrix);

        int[][] expectedMatrix = {
                { 1, 0, 1 }, { 0, 0, 0 }, { 1, 0, 1 }
        };
        Assertions.assertArrayEquals(expectedMatrix, matrix);
    }

    @Test public void tc2() {
        int[][] matrix = {
                { 1, 1, 0 }, { 1, 0, 1 }, { 1, 1, 1 }
        };

        sz.rewrite(matrix);

        int[][] expectedMatrix = {
                { 0, 0, 0 }, { 0, 0, 0 }, { 1, 0, 0 }
        };
        Assertions.assertArrayEquals(expectedMatrix, matrix);
    }
}
