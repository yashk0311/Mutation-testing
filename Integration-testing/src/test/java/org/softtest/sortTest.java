package org.softtest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class sortTest {
    @Test
    public void testMerge() {
        MergeSort mergeSort = new MergeSort();
        int[] arr1 = {2, 3, 4, 9, 7, 6 , 8, 5, 1, 0};
        mergeSort.mergeSort(arr1, 0, arr1.length - 1);
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(arr1, expected);
    }
    @Test
    public void testQuick() {
        QuickSort quickSort = new QuickSort();
        int[] arr1 = {8, 7, 9, 14, 12, 11 , 13, 10, 6, 5};
        quickSort.quickSort(arr1, 0, arr1.length - 1);
        int[] expected = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        assertArrayEquals(arr1, expected);
    }
}
