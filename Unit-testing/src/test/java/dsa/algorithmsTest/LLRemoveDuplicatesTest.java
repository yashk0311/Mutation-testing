package dsa.algorithmsTest;
import java.util.HashSet;
import java.util.Set;

import dsa.algorithms.LLRemoveDuplicates;
import dsa.algorithms.ListNode;
import dsa.algorithms.ReverseLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LLRemoveDuplicatesTest {
    LLRemoveDuplicates lrd = new LLRemoveDuplicates();

    @Test
    public void NullInstances() {
        try{
            ListNode<Integer> head = null;
            lrd.remove(head);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void NotDuplicatedElements() {
        ListNode<Integer> head = createList(new Integer[] { 0, 1, 2, 3, 4 });

        lrd.remove(head);

        assertListContainsElements(new Integer[] { 0, 1, 2, 3, 4 }, head);
    }

    @Test public void DuplicatedElements() {
        ListNode<Integer> head = createList(new Integer[] { 0, 1, 0, 2, 2, 3, 4, 4 });

        lrd.remove(head);

        assertListContainsElements(new Integer[] { 0, 1, 2, 3, 4 }, head);
    }

    @Test
    public void NullInstances2() {
        try{
            lrd.remove2(null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void NotDuplicatedElements2() {
        ListNode<Integer> head = createList(new Integer[] { 0, 1, 2, 3, 4 });

        lrd.remove2(head);

        assertListContainsElements(new Integer[] { 0, 1, 2, 3, 4 }, head);
    }

    @Test public void DuplicatedElements2() {
        ListNode<Integer> head = createList(new Integer[] { 0, 1, 0, 2, 2, 3, 4, 4 });

        lrd.remove2(head);

        assertListContainsElements(new Integer[] { 0, 1, 2, 3, 4 }, head);
    }

    private ListNode<Integer> createList(Integer[] integers) {
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

    private void assertListContainsElements(Integer[] integers, ListNode<Integer> head) {
        int arrayLength = integers.length;
        ListNode<Integer> currentNode = head;

        int i = 0;
        while (i < arrayLength) {
            assertEquals(integers[i], currentNode.getData());
            currentNode = currentNode.getNext();
            i++;
        }
        Assertions.assertNull(currentNode);
    }
}
