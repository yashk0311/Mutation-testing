package dsa.algorithmsTest;

import dsa.algorithms.LongestConsecSeq;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LongestConsecSeqTest {
    LongestConsecSeq lcs = new LongestConsecSeq();

    @Test public void NullArraysIterative() {
        try{
            lcs.findIterative(null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void EmptyIterative() {
        int[] array = { };

        int sequenceLength = lcs.findIterative(array);

        assertEquals(0, sequenceLength);
    }

    @Test public void tc1_Iterative() {
        int[] array = { 6, 5, 4, 3, 2, 1 };

        int sequenceLength = lcs.findIterative(array);

        assertEquals(0, sequenceLength);
    }

    @Test public void tc2_Iterative() {
        int[] array = { 1, 2, 3, 4, 5, 6 };

        int sequenceLength = lcs.findIterative(array);

        assertEquals(6, sequenceLength);
    }

    @Test public void tc3_Iterative() {
        int[] array = { 1, 3, 4, 5, 64, 4, 5, 6, 7, 8, 9, 98, -1, -2 };

        int sequenceLength = lcs.findIterative(array);

        assertEquals(7, sequenceLength);
    }

    @Test
    public void tc4_Iterative() {
        int[] array = { 1, 1, 1, 1, 3, 4, 5, 64, 4, 5, 6, 7, 8, 9, 98, -1, -2 };

        int sequenceLength = lcs.findIterative(array);

        assertEquals(7, sequenceLength);
    }

    @Test public void NullArraysRecursive() {
        try{
            lcs.findRecursive(null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void EmptyRecursive() {
        int[] array = { };

        int sequenceLength = lcs.findRecursive(array);

        assertEquals(0, sequenceLength);
    }

    @Test public void tc1_Recursive() {
        int[] array = { 6, 5, 4, 3, 2, 1 };

        int sequenceLength = lcs.findRecursive(array);

        assertEquals(0, sequenceLength);
    }

    @Test public void tc2_Recursive() {
        int[] array = { 1, 2, 3, 4, 5, 6 };

        int sequenceLength = lcs.findRecursive(array);

        assertEquals(6, sequenceLength);
    }

    @Test public void tc3_Recursive() {
        int[] array = { 1, 3, 4, 5, 64, 4, 5, 6, 7, 8, 9, 98, -1, -2 };

        int sequenceLength = lcs.findRecursive(array);

        assertEquals(7, sequenceLength);
    }

    @Test
    public void tc4_Recursive() {
        int[] array = { 1, 1, 1, 1, 3, 4, 5, 64, 4, 5, 6, 7, 8, 9, 98, -1, -2 };

        int sequenceLength = lcs.findRecursive(array);

        assertEquals(7, sequenceLength);
    }
}
