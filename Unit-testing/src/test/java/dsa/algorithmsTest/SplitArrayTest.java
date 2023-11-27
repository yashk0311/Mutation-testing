package dsa.algorithmsTest;
import dsa.algorithms.SplitArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SplitArrayTest {
    SplitArray sa = new SplitArray();

    @Test public void NullArraysSorting() {
        try{
            sa.splitSorting(null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void EmptyArraysSorting() {
        int[] array = new int[0];

        sa.splitSorting(array);

        NegBeforePos(array);
    }

    @Test public void PositiveNumbersSorting() {
        int[] array = { 1, 2, 1, 3, 4, 6 };

        sa.splitSorting(array);

        NegBeforePos(array);
    }

    @Test public void NegativeNumbersSorting() {
        int[] array = { 1, 2, 1, 3, 4, 6 };

        sa.splitSorting(array);

        NegBeforePos(array);
    }

    @Test public void tc1_Sorting() {
        int[] array = { 1, 2, -1, -3, 4, -6 };

        sa.splitSorting(array);

        NegBeforePos(array);
    }

    @Test public void tc2_Sorting() {
        int[] array = { 1, -2, -1, -3, 4, -6 };

        sa.splitSorting(array);

        NegBeforePos(array);
    }

    @Test
    public void NullArraysIterative() {
        try{
            sa.splitSwappingIterative(null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void EmptyArraysIterative() {
        int[] array = new int[0];

        sa.splitSwappingIterative(array);

        NegBeforePos(array);
    }

    @Test public void PositiveIterative() {
        int[] array = { 1, 2, 1, 3, 4, 6 };

        sa.splitSwappingIterative(array);

        NegBeforePos(array);
    }

    @Test public void NegativeIterative() {
        int[] array = { 1, 2, 1, 3, 4, 6 };

        sa.splitSwappingIterative(array);

        NegBeforePos(array);
    }

    @Test public void tc1_Iterative() {
        int[] array = { 1, 2, -1, -3, 4, -6 };

        sa.splitSwappingIterative(array);

        NegBeforePos(array);
    }

    @Test
    public void tc2_Iterative() {
        int[] array = { 1, -2, -1, -3, 4, -6 };

        sa.splitSwappingIterative(array);

        NegBeforePos(array);
    }

    @Test public void NullArraysPartition() {
        try{
            sa.splitSwappingPartition(null); }
        catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }

    @Test public void EmptyArraysPartition() {
        int[] array = new int[0];

        sa.splitSwappingPartition(array);

        NegBeforePos(array);
    }

    @Test public void tc1_Partition() {
        int[] array = { 1, 2, 1, 3, 4, 6 };

        sa.splitSwappingPartition(array);

        NegBeforePos(array);
    }

    @Test public void tc2_Partition() {
        int[] array = { 1, 2, 1, 3, 4, 6 };

        sa.splitSwappingPartition(array);

        NegBeforePos(array);
    }

    @Test public void tc3_Partition() {
        int[] array = { 1, 2, -1, -3, 4, -6 };

        sa.splitSwappingPartition(array);

        NegBeforePos(array);
    }

    @Test
    public void tc4_Partition() {
        int[] array = { 1, -2, -1, -3, 4, -6 };

        sa.splitSwappingPartition(array);

        NegBeforePos(array);
    }

    @Test
    public void NullArraysRecursive() {
        try{
            sa.splitSwappingRecursive(null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void EmptyArraysRecursive() {
        int[] array = new int[0];

        sa.splitSwappingRecursive(array);

        NegBeforePos(array);
    }

    @Test public void tc1_Recursive() {
        int[] array = { 1, 2, 1, 3, 4, 6 };

        sa.splitSwappingRecursive(array);

        NegBeforePos(array);
    }

    @Test public void tc2_Recursive() {
        int[] array = { 1, 2, 1, 3, 4, 6 };

        sa.splitSwappingRecursive(array);

        NegBeforePos(array);
    }

    @Test public void tc3_Recursive() {
        int[] array = { 1, 2, -1, -3, 4, -6 };

        sa.splitSwappingRecursive(array);

        NegBeforePos(array);
    }

    @Test
    public void tc4_Recursive() {
        int[] array = { 1, -2, -1, -3, 4, -6 };

        sa.splitSwappingRecursive(array);

        NegBeforePos(array);
    }

    private void NegBeforePos(int[] array) {
        if (array.length != 0) {
            boolean foundPositiveNumbers = false;
            for (int element : array) {
                if (foundPositiveNumbers) {
                    Assertions.assertTrue(element >= 0);
                } else if (element >= 0) {
                    foundPositiveNumbers = true;
                }
            }
        }
    }
}
