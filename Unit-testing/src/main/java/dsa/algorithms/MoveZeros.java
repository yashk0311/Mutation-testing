package dsa.algorithms;

public class MoveZeros {
    public void moveSorting(int[] array) {
        validateArray(array);

        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == 0 && array[i + 1] != 0) {
                    swap(array, i, i + 1);
                    swap = true;
                }
            }
        }
    }

    public void moveUsingTwoPointers(int[] array) {
        validateArray(array);

        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] == 0 && array[right] != 0) {
                swap(array, left, right);
            }
            if (array[left] != 0) {
                left++;
            }
            if (array[right] == 0) {
                right--;
            }
        }
    }

    private void validateArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("You can't pass a null array as argument.");
        }
    }

    private void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
