package dsa.LinkedListTest;

import dsa.LinkedListTest.ReverseLinkedList;
import helper.methods.ListNode;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ReverseLLTest {

    ReverseLinkedList rll = new ReverseLinkedList();

    @Test public void NullElements_Iterative() {
        try {
            rll.reverseIterative(null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void OneElement_Iterative() {
        ListNode<Integer> head = new ListNode<Integer>(1);

        assertEquals(head, rll.reverseIterative(head));
    }

    @Test public void ReverseLinkedList_Iterative() {
        ListNode<Integer> head = new ListNode<Integer>(1);
        ListNode<Integer> n2 = new ListNode<Integer>(2);
        ListNode<Integer> n3 = new ListNode<Integer>(3);
        ListNode<Integer> n4 = new ListNode<Integer>(4);
        head.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        ListNode reversedList = rll.reverseIterative(head);

        assertEquals(n4, reversedList);
        assertEquals(n3, reversedList.getNext());
        assertEquals(n2, reversedList.getNext().getNext());
        assertEquals(head, reversedList.getNext().getNext().getNext());
    }


    @Test public void NullElements_Recursive() {
        try {
            rll.reverseRecursive(null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void OneElements_Recursive() {
        ListNode<Integer> head = new ListNode<Integer>(1);

        assertEquals(head, rll.reverseRecursive(head));
    }

    @Test public void ReverseLinkedList_Recursive() {
        ListNode<Integer> head = new ListNode<Integer>(1);
        ListNode<Integer> n2 = new ListNode<Integer>(2);
        ListNode<Integer> n3 = new ListNode<Integer>(3);
        ListNode<Integer> n4 = new ListNode<Integer>(4);
        head.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        ListNode reversedList = rll.reverseRecursive(head);

        assertEquals(n4, reversedList);
        assertEquals(n3, reversedList.getNext());
        assertEquals(n2, reversedList.getNext().getNext());
        assertEquals(head, reversedList.getNext().getNext().getNext());
    }
}
