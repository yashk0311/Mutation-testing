package dsa.algorithmsTest;
import static org.junit.jupiter.api.Assertions.*;

import dsa.algorithms.MoveZeros;
import org.junit.jupiter.api.Test;

import java.util.List;
public class MoveZerosTest {
    MoveZeros mz = new MoveZeros();
    @Test public void NullArrays_Sorting() {
        try{
            mz.moveSorting(null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void EmptyArray_Sorting() {
        int[] array = new int[0];

        mz.moveSorting(array);

        assertArrayEquals(new int[0], array);
    }

    @Test public void tc1_Sorting() {
        int[] array = {-1, 0, 2, 4, 0, -3, -5, 0, 6, -3, 0};

        mz.moveSorting(array);

        assertZerosAtRight(array);
    }

    @Test public void Zeros_Sorting() {
        int[] array = { 0, 0, 0, 0, 0 };

        mz.moveUsingTwoPointers(array);

        int[] expected = { 0, 0, 0, 0, 0 };
        assertArrayEquals(expected, array);
    }

    @Test public void tc2_Sorting() {
        int[] array = { 1, 1, 1, 1, 1 };

        mz.moveUsingTwoPointers(array);

        int[] expected = { 1, 1, 1, 1, 1 };
        assertArrayEquals(expected, array);
    }

    @Test public void tc3_Sorting() {
        int[] array = { 1, 0, 2, 3, 0 };

        mz.moveUsingTwoPointers(array);

        assertZerosAtRight(array);
    }

    @Test public void tc4_Sorting() {
        int[] array = { 1, 0, 2, -3, 0, 0, 0, 0, -1 };

        mz.moveUsingTwoPointers(array);

        assertZerosAtRight(array);
    }

    @Test public void NullArrays_Pointers() {
        try{
            mz.moveUsingTwoPointers(null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void EmptyArray_Pointers() {
        int[] array = new int[0];

        mz.moveUsingTwoPointers(array);

        assertArrayEquals(new int[0], array);
    }

    @Test public void Zeros_Pointers() {
        int[] array = { 0, 0, 0, 0, 0 };

        mz.moveUsingTwoPointers(array);

        int[] expected = { 0, 0, 0, 0, 0 };
        assertArrayEquals(expected, array);
    }

    @Test public void NonZeros_Pointers() {
        int[] array = { 1, 1, 1, 1, 1 };

        mz.moveUsingTwoPointers(array);

        int[] expected = { 1, 1, 1, 1, 1 };
        assertArrayEquals(expected, array);
    }

    @Test public void tc1_Pointers() {
        int[] array = { 1, 0, 2, 3, 0 };

        mz.moveUsingTwoPointers(array);

        assertZerosAtRight(array);
    }

    @Test public void tc2_Pointers() {
        int[] array = { 1, 0, 2, -3, 0, 0, 0, 0, -1 };

        mz.moveUsingTwoPointers(array);

        assertZerosAtRight(array);
    }

    private void assertZerosAtRight(int[] array) {
        boolean zeroFounded = false;
        for (int i : array) {
            if (zeroFounded) {
                assertEquals(0, i);
            } else if (i == 0) {
                zeroFounded = true;
            }
        }
    }
}
