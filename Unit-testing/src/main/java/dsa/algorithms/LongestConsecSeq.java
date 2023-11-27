package dsa.algorithms;
import java.util.*;
import java.math.*;
public class LongestConsecSeq {
    public int findIterative(int[] numbers) {
        validateInput(numbers);
        if (numbers.length == 0) {
            return 0;
        }

        boolean consecutiveSequenceFound = false;
        int result = 0;
        int start = 0, end = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] < numbers[i]) {
                end = i;
            } else {
                start = i;
            }
            if (end - start > result) {
                consecutiveSequenceFound = true;
                result = end - start;
            }
        }
        if (consecutiveSequenceFound) {
            return result + 1;
        } else {
            return result;
        }
    }

    public int findRecursive(int[] array) {
        validateInput(array);
        return findRecursiveInner(array, 1, 0, 0);
    }

    private int findRecursiveInner(int[] array, int i, int acc, int maxLength) {
        if (array.length == 0) {
            return 0;
        } else if (array.length == i) {
            return maxLength == 0 ? 0 : 1 + maxLength;
        } else {
            int previous = array[i - 1];
            int current = array[i];
            if (previous >= current) {
                maxLength = Math.max(acc, maxLength);
                return findRecursiveInner(array, i + 1, 0, maxLength);
            } else {
                acc++;
                maxLength = Math.max(acc, maxLength);
                return findRecursiveInner(array, i + 1, acc, maxLength);
            }
        }
    }

    private void validateInput(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("You can't pass a null array as input.");
        }
    }
}
