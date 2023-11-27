package dsa.algorithms;

import dsa.algorithms.ListNode;

public class ReverseLinkedList {
    public ListNode reverseIterative(ListNode list) {
        validateInput(list);

        if (list.getNext() == null) {
            return list;
        }

        ListNode head = null;
        ListNode current = list;
        while (current != null) {
            ListNode save = current;
            current = current.getNext();
            save.setNext(head);
            head = save;
        }
        return head;
    }

    public ListNode<Integer> reverseRecursive(ListNode list) {
        validateInput(list);
        return reverseRecursiveInner(list);
    }

    private ListNode<Integer> reverseRecursiveInner(ListNode head) {
        if (head == null || head.getNext() == null) {
            return head;
        } else {
            ListNode reversedList = reverseRecursiveInner(head.getNext());
            head.getNext().setNext(head);
            return reversedList;
        }
    }

    private void validateInput(ListNode list) {
        if (list == null) {
            throw new IllegalArgumentException("You can't pass a null list as parameter.");
        }
    }
}
