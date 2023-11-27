package dsa.LinkedListTest;

import helper.methods.ListNode;
import java.util.Stack;
public class PalindromeList {
    private final ReverseLinkedList reverseLinkedList;

    public PalindromeList() {
        this.reverseLinkedList = new ReverseLinkedList();
    }
    public boolean checkReversing(ListNode list) {
        validateInput(list);

        ListNode<Integer> reversedList = reverseLinkedList.reverseIterative(list);

        boolean isPalindrome = true;
        while (list != null) {
            isPalindrome = list.equals(reversedList);
            if (!isPalindrome) {
                break;
            }
            reversedList = reversedList.getNext();
            list = list.getNext();
        }
        return isPalindrome;
    }

    public boolean checkIterative(ListNode list) {
        validateInput(list);

        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode fastPointer = list;
        ListNode slowPointer = list;
        while (fastPointer != null && fastPointer.getNext() != null) {
            stack.add(slowPointer);
            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext().getNext();
        }

        if (fastPointer != null) {
            slowPointer = slowPointer.getNext();
        }

        boolean isPalindrome = true;
        while (slowPointer != null) {
            if (!stack.pop().equals(slowPointer)) {
                isPalindrome = false;
                break;
            }
            slowPointer = slowPointer.getNext();
        }
        return isPalindrome;
    }

    private void validateInput(ListNode<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("You can't pass a null list as parameter.");
        }
    }
}
