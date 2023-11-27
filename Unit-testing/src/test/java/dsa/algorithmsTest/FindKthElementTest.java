package dsa.algorithmsTest;
import java.util.HashSet;
import java.util.Set;

import dsa.algorithms.FindKthElement;
import dsa.algorithms.ListNode;
import dsa.algorithms.ReverseLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FindKthElementTest {
    FindKthElement fke = new FindKthElement();

    @Test public void NullListNodes() {
        try{
            fke.find(null, 4);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void NegativePositions() {
        try{
            fke.find(new ListNode<Integer>(3), -1);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void PositionsGreaterThanListSize() {
        try{
            fke.find(new ListNode<Integer>(3), 2);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void LastNodeIfPositionIsZero() {
        ListNode result = fke.find(new ListNode<Integer>(1), 0);

        ListNode<Integer> expectedNode = new ListNode<Integer>(1);
        assertEquals(expectedNode, result);
    }

    @Test public void tc3() {
        ListNode<Integer> list = createList(new int[] { 1, 2, 3 });

        ListNode result = fke.find(list, 2);

        ListNode<Integer> expectedNode = new ListNode<Integer>(1);
        assertEquals(expectedNode, result);
    }

    @Test public void KthToLastElement() {
        ListNode<Integer> list = createList(new int[] { 1, 2, 3 });

        ListNode result = fke.find(list, 1);

        ListNode<Integer> expectedNode = new ListNode<Integer>(2);
        assertEquals(expectedNode, result);
    }

    @Test public void NullListNodes2() {
        try {
            fke.find2(null, 4);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void NegativePositions2() {
        try {
            fke.find2(new ListNode<Integer>(3), -1);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void PositionsGreaterThanListSize2() {
        try{
            fke.find2(new ListNode<Integer>(3), 2);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void LastNodeIfPositionIsZero2() {
        ListNode result = fke.find2(new ListNode<Integer>(1), 0);

        ListNode<Integer> expectedNode = new ListNode<Integer>(1);
        assertEquals(expectedNode, result);
    }

    @Test public void tc1() {
        ListNode<Integer> list = createList(new int[] { 1, 2, 3 });

        ListNode result = fke.find2(list, 2);

        ListNode<Integer> expectedNode = new ListNode<Integer>(1);
        assertEquals(expectedNode, result);
    }

    @Test public void KthToLastElement2() {
        ListNode<Integer> list = createList(new int[] { 1, 2, 3 });

        ListNode result = fke.find2(list, 1);

        ListNode<Integer> expectedNode = new ListNode<Integer>(2);
        assertEquals(expectedNode, result);
    }

    @Test public void NullListNodes3() {
        try {
            fke.find3(null, 4);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void NegativePositions3() {
        try{
            fke.find3(new ListNode<Integer>(3), -1);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void PositionsGreaterThanListSize3() {
        try{
            fke.find3(new ListNode<Integer>(3), 2);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void LastNodeIfPositionIsZero3() {
        ListNode result = fke.find3(new ListNode<Integer>(1), 0);

        ListNode<Integer> expectedNode = new ListNode<Integer>(1);
        assertEquals(expectedNode, result);
    }

    @Test public void tc2() {
        ListNode<Integer> list = createList(new int[] { 1, 2, 3 });

        ListNode result = fke.find3(list, 2);

        ListNode<Integer> expectedNode = new ListNode<Integer>(1);
        assertEquals(expectedNode, result);
    }

    @Test public void KthToLastElement3() {
        ListNode<Integer> list = createList(new int[] { 1, 2, 3 });

        ListNode result = fke.find3(list, 1);

        ListNode<Integer> expectedNode = new ListNode<Integer>(2);
        assertEquals(expectedNode, result);
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
