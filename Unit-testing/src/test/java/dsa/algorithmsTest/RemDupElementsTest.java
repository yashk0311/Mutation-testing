package dsa.algorithmsTest;
import static org.junit.jupiter.api.Assertions.*;

import dsa.algorithms.RemDupElements;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemDupElementsTest {
    RemDupElements rde = new RemDupElements();

    @Test public void NullArrays_Set() {
        try{
            rde.removeUsingSet(null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void EmptyArrays_Set() {
        Integer[] array = new Integer[0];

        Integer[] result = rde.removeUsingSet(array);

        assertArrayEquals(new Integer[0], result);
    }

    @Test public void OneElement_Set() {
        Integer[] array = { 1 };

        Integer[] result = rde.removeUsingSet(array);

        Integer[] expected = { 1 };
        assertArrayEquals(expected, result);
    }

    @Test public void NoDuplicatedElements_Set() {
        Integer[] array = { 1, 2, 3 };

        Integer[] result = rde.removeUsingSet(array);
        Integer[] expected = { 1, 2, 3 };
        assertArrayEquals(expected, result);
    }

    @Test
    public void SameElement_Set() {
        Integer[] array = { 1, 1, 1, 1, 1 };

        Integer[] result = rde.removeUsingSet(array);
        Integer[] expected = { 1 };
        assertArrayEquals(expected, result);
    }

    @Test public void Sorted_Set() {
        Integer[] array = { 1, 2, 3, 3, 4, 4, 6, 6 };

        Integer[] result = rde.removeUsingSet(array);
        Integer[] expected = { 1, 2, 3, 4, 6 };
        assertArrayEquals(expected, result);
    }

    @Test public void NotSorted_Set() {
        Integer[] array = { 1, 1, 5, 6, 2, 3 };

        Integer[] result = rde.removeUsingSet(array);
        Integer[] expected = { 1, 2, 3, 5, 6};
        assertArrayEquals(expected, result);
    }

    @Test public void NullArrays_Sorting() {
        try{
            rde.removeUsingSorting(null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void EmptyArrays_Sorting() {
        Integer[] array = new Integer[0];

        Integer[] result = rde.removeUsingSorting(array);

        assertArrayEquals(new Integer[0], result);
    }

    @Test public void OneElement_Sorting() {
        Integer[] array = { 1 };

        Integer[] result = rde.removeUsingSorting(array);

        Integer[] expected = { 1 };
        assertArrayEquals(expected, result);
    }

    @Test public void NoDuplicatedElements_Sorting() {
        Integer[] array = { 1, 2, 3 };

        Integer[] result = rde.removeUsingSorting(array);
        Integer[] expected = { 1, 2, 3 };
        assertArrayEquals(expected, result);
    }

    @Test public void SameElement_Sorting() {
        Integer[] array = { 1, 1, 1, 1, 1 };

        Integer[] result = rde.removeUsingSorting(array);
        Integer[] expected = { 1 };
        assertArrayEquals(expected, result);
    }

    @Test public void Sorted_Sorting() {
        Integer[] array = { 1, 2, 3, 3, 4, 4, 6, 6 };

        Integer[] result = rde.removeUsingSorting(array);
        Integer[] expected = { 1, 2, 3, 4, 6 };
        assertArrayEquals(expected, result);
    }

    @Test public void NotSorted_Sorting() {
        Integer[] array = { 1, 1, 5, 6, 2, 3 };

        Integer[] result = rde.removeUsingSorting(array);
        Integer[] expected = { 1, 2, 3, 5, 6 };
        assertArrayEquals(expected, result);
    }

    @Test public void tc1_Sorting() {
        Integer[] array = {2, 2, 3, 4, 4, 5, 5 };

        Integer[] result = rde.removeUsingSorting(array);
        Integer[] expected = { 2, 3, 4, 5 };
        assertArrayEquals(expected, result);
    }
}
