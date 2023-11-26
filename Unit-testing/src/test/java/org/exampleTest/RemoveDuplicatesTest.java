package org.exampleTest;

import java.util.HashSet;
import java.util.Set;

import org.example.RemoveDuplicates;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class RemoveDuplicatesTest {

    RemoveDuplicates rd = new RemoveDuplicates();


    @Test public void shouldSupportEmptyArraysBasedOnSet() {
        Integer[] array = new Integer[0];
        Integer[] result = rd.removeUsingSet(array);

        Assertions.assertArrayEquals(new Integer[0], result);
    }

    @Test public void shouldReturnAnArrayWithJustOneElementIfInputJustContainsOneElementBasedOnSet() {
        Integer[] array = { 1 };

        Integer[] result = rd.removeUsingSet(array);

        Integer[] expected = { 1 };
        Assertions.assertArrayEquals(expected, result);
    }

    @Test public void shouldSupportArraysWithoutDuplicatedElementsBasedOnSet() {
        Integer[] array = { 1, 3, 2 };

        Integer[] result = rd.removeUsingSet(array);

        Assertions.assertTrue(containsUniqueElements(result));
    }

    @Test
    public void shouldReturnAnArrayWithJustOneElementIfTheArrayIsFullOfTheSameElementBasedOnSet() {
        Integer[] array = { 1, 1, 1, 1, 1 };

        Integer[] result = rd.removeUsingSet(array);

        Assertions.assertTrue(containsUniqueElements(result));
    }

    @Test public void shouldRemoveDuplicatesIfTheInputIsSortedBasedOnSet() {
        Integer[] array = { 1, 2, 3, 3, 4, 4, 6, 6 };

        Integer[] result = rd.removeUsingSet(array);

        Assertions.assertTrue(containsUniqueElements(result));
    }

    @Test public void shouldRemoveDuplicatesIfTheInputIsNotSortedBasedOnSet() {
        Integer[] array = { 1, 1, 5, 6, 2, 3 };

        Integer[] result = rd.removeUsingSet(array);

        Assertions.assertTrue(containsUniqueElements(result));
    }


    @Test public void shouldSupportEmptyArraysSorting() {
        Integer[] array = new Integer[0];

        Integer[] result = rd.removeUsingSorting(array);

        Assertions.assertArrayEquals(new Integer[0], result);
    }

    @Test public void shouldReturnAnArrayWithJustOneElementIfInputJustContainsOneElementSorting() {
        Integer[] array = { 1 };

        Integer[] result = rd.removeUsingSorting(array);

        Integer[] expected = { 1 };
        Assertions.assertArrayEquals(expected, result);
    }

    @Test public void shouldSupportArraysWithoutDuplicatedElementsSorting() {
        Integer[] array = { 1, 2, 3 };

        Integer[] result = rd.removeUsingSorting(array);

        Assertions.assertTrue(containsUniqueElements(result));
    }

    @Test public void shouldReturnAnArrayWithJustOneElementIfTheArrayIsFullOfTheSameElementSorting() {
        Integer[] array = { 1, 1, 1, 1, 1 };

        Integer[] result = rd.removeUsingSorting(array);

        Assertions.assertTrue(containsUniqueElements(result));
    }

    @Test public void shouldRemoveDuplicatesIfTheInputIsSortedSorting() {
        Integer[] array = { 1, 2, 3, 3, 4, 4, 6, 6 };

        Integer[] result = rd.removeUsingSorting(array);

        Assertions.assertTrue(containsUniqueElements(result));
    }

    @Test public void shouldRemoveDuplicatesIfTheInputIsNotSortedSorting() {
        Integer[] array = { 1, 1, 5, 6, 2, 3 };

        Integer[] result = rd.removeUsingSorting(array);

        Assertions.assertTrue(containsUniqueElements(result));
    }

    private boolean containsUniqueElements(Integer[] result) {
        Set<Integer> elements = new HashSet<Integer>();
        for (int i : result) {
            if (elements.contains(i)) {
                return false;
            }
        }
        return true;
    }
}
