package dsa.algorithms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
public class PairSum {
    public List<Pair<Integer, Integer>> find(int[] numbers, int value) {
        validateInput(numbers);
        List<Pair<Integer, Integer>> sums = new LinkedList<Pair<Integer, Integer>>();
        for (int number : numbers) {
            for (int i : numbers) {
                if (number + i == value) {
                    sums.add(new Pair<>(number, i));
                }
            }
        }
        return sums;
    }

    public List<Pair<Integer, Integer>> findLinearComplexityOrder(int[] numbers, int n) {
        validateInput(numbers);
        List<Pair<Integer, Integer>> sums = new LinkedList<Pair<Integer, Integer>>();
        Map<Integer, Integer> partialElements = new HashMap<Integer, Integer>();
        for (int number : numbers) {
            if (partialElements.containsKey(number)) {
                sums.add(new Pair<Integer, Integer>(number, partialElements.get(number)));
            } else {
                partialElements.put(n - number, number);
            }
        }
        return sums;
    }

    private void validateInput(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("You can't pass a null array of numbers.");
        }
    }
}
