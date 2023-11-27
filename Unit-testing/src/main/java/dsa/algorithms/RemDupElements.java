package dsa.algorithms;

import java.util.*;

public class RemDupElements {
    public Integer[] removeUsingSet(Integer[] numbers) {
        validateArray(numbers);

        Set<Integer> uniqueElements = new HashSet<Integer>();
        for (int i : numbers) {
            uniqueElements.add(i);
        }
        return uniqueElements.toArray(new Integer[uniqueElements.size()]);
    }

    public Integer[] removeUsingSorting(Integer[] numbers) {
        validateArray(numbers);
        if (numbers.length == 1 || numbers.length == 0) {
            return numbers;
        }

        Collections.sort(Arrays.asList(numbers));
        List<Integer> result = new LinkedList<Integer>();
        for (int i = 0; i < numbers.length - 1; i++) {
            if (!numbers[i].equals(numbers[i + 1])) {
                result.add(numbers[i]);
            }
        }
        result.add(numbers[numbers.length - 1]);
        return result.toArray(new Integer[result.size()]);
    }

    private void validateArray(Integer[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("You can't pass a null array");
        }
    }
}
