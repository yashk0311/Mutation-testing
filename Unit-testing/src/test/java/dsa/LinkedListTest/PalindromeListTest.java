package dsa.LinkedListTest;

import dsa.LinkedListTest.PalindromeList;
import helper.methods.ListNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class PalindromeListTest {
    PalindromeList pl = new PalindromeList();

    @Test public void NullList_Reversing() {
        try{
            pl.checkReversing(null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void OneNode_Reversing() {
        ListNode<Integer> list = new ListNode<Integer>(1);

        boolean result = pl.checkReversing(list);

        Assertions.assertTrue(result);
    }

    @Test public void SameValue_Reversing() {
        ListNode<Integer> list = createList(new int[] { 1, 1 });

        boolean result = pl.checkReversing(list);

        Assertions.assertTrue(result);
    }

    @Test public void Palindrome_Reversing() {
        ListNode<Integer> list = createList(new int[] { 1, 2, 1 });

        boolean result = pl.checkReversing(list);

        Assertions.assertTrue(result);
    }

    @Test public void NotPalindrome_Reversing() {
        ListNode<Integer> list = createList(new int[] { 1, 1, 3 });

        boolean result = pl.checkReversing(list);

        Assertions.assertFalse(result);
    }

    @Test public void NullList_Iterative() {
        try{
            pl.checkIterative(null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void OneNode_Iterative() {
        ListNode<Integer> list = new ListNode<Integer>(1);

        boolean result = pl.checkIterative(list);

        Assertions.assertTrue(result);
    }

    @Test public void SameValue_Iterative() {
        ListNode<Integer> list = createList(new int[] { 1, 1 });

        boolean result = pl.checkIterative(list);

        Assertions.assertTrue(result);
    }

    @Test public void Palindrome_Iterative() {
        ListNode<Integer> list = createList(new int[] { 1, 2, 1 });

        boolean result = pl.checkIterative(list);

        Assertions.assertTrue(result);
    }

    @Test public void NotPalindrome_Iterative() {
        ListNode<Integer> list = createList(new int[] { 1, 1, 3 });

        boolean result = pl.checkIterative(list);

        Assertions.assertFalse(result);
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
