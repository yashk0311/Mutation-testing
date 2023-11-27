package dsa.algorithmsTest;
import java.util.HashSet;
import java.util.Set;

import dsa.algorithms.ReverseLinkedList;
import dsa.algorithms.SumLists;
import dsa.algorithms.ListNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumListsTest {
    SumLists sl = new SumLists();

    @Test
    public void NullList_FirstParameter_Reverse() {
        try{
            sl.sumReverse(null, new ListNode<Integer>(0));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test
    public void testSumReverseWithNullInput() {
        try {
            sl.sumReverse(null, null);
            // If no exception is thrown, fail the test
            assert false : "Expected IllegalArgumentException but no exception was thrown";
        } catch (IllegalArgumentException e) {
            // Expected IllegalArgumentException
            // You can add additional assertions related to the exception if needed
        }
    }

    @Test
    public void NullList_SecondParameter_Reverse() {
        try{
            sl.sumReverse(new ListNode<Integer>(0), null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void SumNumbers1_Reverse() {
        ListNode<Integer> n1 = createList(new int[] { 3 });
        ListNode<Integer> n2 = createList(new int[] { 8 });

        int result = sl.sumReverse(n1, n2);

        assertEquals(11, result);
    }

    @Test public void SumNumbers3_Reverse() {
        ListNode<Integer> n1 = createList(new int[] { 5, 5, 1 });
        ListNode<Integer> n2 = createList(new int[] { 4, 1, 3 });

        int result = sl.sumReverse(n1, n2);

        assertEquals(469, result);
    }

    @Test public void SumNumbers_diff_Reverse() {
        ListNode<Integer> n1 = createList(new int[] { 5, 5, 1 });
        ListNode<Integer> n2 = createList(new int[] { 5 });

        int result = sl.sumReverse(n1, n2);

        assertEquals(160, result);
    }

    @Test
    public void NullList_FirstParameter() {
        try{
            sl.sum(null, new ListNode<Integer>(0));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test
    public void NullList_SecondParameter() {
        try{
            sl.sum(new ListNode<Integer>(0), null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void SumNumbers1() {
        ListNode<Integer> n1 = createList(new int[] { 3 });
        ListNode<Integer> n2 = createList(new int[] { 8 });

        int result = sl.sum(n1, n2);

        assertEquals(11, result);
    }

    @Test public void SumNumbers3() {
        ListNode<Integer> n1 = createList(new int[] { 1, 5, 5 });
        ListNode<Integer> n2 = createList(new int[] { 3, 1, 4 });

        int result = sl.sum(n1, n2);

        assertEquals(469, result);
    }

    @Test public void SumNumbers_diff() {
        ListNode<Integer> n1 = createList(new int[] { 1, 5, 5 });
        ListNode<Integer> n2 = createList(new int[] { 5 });

        int result = sl.sum(n1, n2);

        assertEquals(160, result);
    }

    private ListNode<Integer> createList(int[] integers) {
        ListNode<Integer> head = new ListNode<Integer>(integers[0]);
        if (integers.length > 1) {
            ListNode<Integer> prevNode = head;
            for (int i = 1; i < integers.length; i++) {
                ListNode<Integer> currentNode = new ListNode<Integer>(integers[i]);
                prevNode.setNext(currentNode);
                prevNode = currentNode;
            }
        }
        return head;
    }
}
