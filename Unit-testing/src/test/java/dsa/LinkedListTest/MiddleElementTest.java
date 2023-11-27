package dsa.LinkedListTest;

import dsa.LinkedListTest.MiddleElement;
import helper.methods.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleElementTest {

    MiddleElement me = new MiddleElement();

    @Test public void NullListInstances() {
        try{
            me.get(null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void AnEvenNumberOfElements() {
        ListNode<Integer> list = createList(new int[] { 1, 2, 3 });

        ListNode<Integer> middleElement = me.get(list);

        assertEquals(Integer.valueOf(2), middleElement.getData());
    }

    @Test public void OddNumberOfElements() {
        ListNode<Integer> list = createList(new int[] { 1, 2, 3, 4 });

        ListNode<Integer> middleElement = me.get(list);

        assertEquals(Integer.valueOf(2), middleElement.getData());
    }

    @Test public void NullListInstances2() {
        try{
            me.get2(null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void EvenNumberOfElements2() {
        ListNode<Integer> list = createList(new int[] { 1, 2, 3 });

        ListNode<Integer> middleElement = me.get2(list);

        assertEquals(Integer.valueOf(2), middleElement.getData());
    }

    @Test public void OddNumberOfElements2() {
        ListNode<Integer> list = createList(new int[] { 1, 2, 3, 4 });

        ListNode<Integer> middleElement = me.get2(list);

        assertEquals(Integer.valueOf(2), middleElement.getData());
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
