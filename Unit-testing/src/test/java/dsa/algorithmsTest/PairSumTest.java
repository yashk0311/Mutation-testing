package dsa.algorithmsTest;

import helper.methods.Pair;
import dsa.algorithms.PairSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PairSumTest {

    PairSum findSums = new PairSum();

    @Test public void NullArrays() {
        try {
            findSums.find(null, 2);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void EmptyArray() {
        int[] inputArray = { };

        List<Pair<Integer, Integer>> result = findSums.find(inputArray, 3);

        Assertions.assertTrue(result.isEmpty());
    }

    @Test public void FindEveryPair() {
        int[] inputArray = { 5, 2, 6, 1, 9 };
        int inputValue = 7;

        List<Pair<Integer, Integer>> result = findSums.find(inputArray, inputValue);

        Assertions.assertTrue(result.contains(new Pair<Integer, Integer>(5, 2)));
        Assertions.assertTrue(result.contains(new Pair<Integer, Integer>(6, 1)));
    }

    @Test public void NegativeIntegers() {
        int[] inputArray = { 5, 2, -17, 6, 1, 9 };
        int inputValue = -8;

        List<Pair<Integer, Integer>> result = findSums.find(inputArray, inputValue);

        Assertions.assertTrue(result.contains(new Pair<Integer, Integer>(-17, 9)));
    }

    @Test public void NullArrays_Linear() {
        try {
            findSums.findLinearComplexityOrder(null, 2);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void EmptyArray_Linear() {
        int[] inputArray = { };

        List<Pair<Integer, Integer>> result = findSums.findLinearComplexityOrder(inputArray, 3);

        Assertions.assertTrue(result.isEmpty());
    }

    @Test public void EveryPair_Linear() {
        int[] inputArray = { 5, 2, 6, 1, 9 };
        int inputValue = 7;

        List<Pair<Integer, Integer>> result =
                findSums.findLinearComplexityOrder(inputArray, inputValue);

        Assertions.assertTrue(result.contains(new Pair<Integer, Integer>(2, 5)));
        Assertions.assertTrue(result.contains(new Pair<Integer, Integer>(1, 6)));
    }

    @Test public void NegativeIntegers_Linear() {
        int[] inputArray = { 5, 2, -17, 6, 1, 9 };
        int inputValue = -8;

        List<Pair<Integer, Integer>> result =
                findSums.findLinearComplexityOrder(inputArray, inputValue);

        Assertions.assertTrue(result.contains(new Pair<Integer, Integer>(9, -17)));
    }
}
