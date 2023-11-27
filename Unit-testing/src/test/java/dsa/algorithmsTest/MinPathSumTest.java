package dsa.algorithmsTest;
import static org.junit.jupiter.api.Assertions.*;

import dsa.algorithms.MinPathSum;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MinPathSumTest {
    MinPathSum mps = new MinPathSum();

    @Test public void RegularGrid() {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        assertEquals(7, mps.minimumPathSum(grid));
    }

    @Test public void OneRowOneColumnGrid() {
        int[][] grid = {{2}};
        assertEquals(2, mps.minimumPathSum(grid));
    }

    @Test public void EmptyGrid() {
        int[][] grid = {{}};
        assertEquals(0, mps.minimumPathSum(grid));
    }

    @Test public void OneColumn() {
        int[][] grid = {{1}, {2}, {3}};
        assertEquals(6, mps.minimumPathSum(grid));
    }

    @Test public void OneRow() {
        int[][] grid = {{1, 2, 3}};
        assertEquals(6, mps.minimumPathSum(grid));
    }

    @Test public void DiffRowAndColumn() {
        int[][] grid = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        assertEquals(30, mps.minimumPathSum(grid));
    }

    @Test public void testMinimumPathSumWithNegativeNumberGrid() {
        int[][] grid = {{1, 3, 1}, {3, 4, 1}, {4, -3, 1}};
        assertEquals(6, mps.minimumPathSum(grid));
    }
}
