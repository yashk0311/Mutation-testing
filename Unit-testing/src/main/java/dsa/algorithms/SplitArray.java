package dsa.algorithms;

public class SplitArray {
    public void splitSorting(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array passed as parameter can't be null.");
        }

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    flag = true;
                }
            }
        }
    }

    public void splitSwappingIterative(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array passed as parameter can't be null.");
        }

        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            boolean shouldChangeLeft = array[left] >= 0;
            boolean shouldChangeRight = array[right] < 0;
            if (shouldChangeLeft && shouldChangeRight) {
                swap(array, left, right);
                left++;
                right--;
            } else {
                if (!shouldChangeLeft) {
                    left++;
                } else if (!shouldChangeRight) {
                    right--;
                }
            }
        }
    }

    public void splitSwappingPartition(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array passed as parameter can't be null.");
        }

        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (array[left] < 0 && left < right) {
                left++;
            }
            while (array[right] >= 0 && left < right) {
                right--;
            }
            if (left < right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
    }

    public void splitSwappingRecursive(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array passed as parameter can't be null.");
        }

        if (array.length == 0) {
            return;
        }

        splitSwappingRecursiveInner(array, 0, array.length - 1);
    }

    private void splitSwappingRecursiveInner(int[] array, int left, int right) {
        if (left < right) {
            boolean shouldChangeLeft = array[left] >= 0;
            boolean shouldChangeRight = array[right] < 0;
            if (shouldChangeLeft && shouldChangeRight) {
                swap(array, left, right);
                splitSwappingRecursiveInner(array, left + 1, right - 1);
            } else {
                if (!shouldChangeLeft) {
                    splitSwappingRecursiveInner(array, left + 1, right);
                } else if (!shouldChangeRight) {
                    splitSwappingRecursiveInner(array, left, right - 1);
                }
            }
        }
    }

    private void swap(int[] array, int left, int right) {
        int aux = array[right];
        array[right] = array[left];
        array[left] = aux;
    }
}
