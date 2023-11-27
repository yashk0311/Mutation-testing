package dsa.algorithms;
import dsa.algorithms.ListNode;
public class MiddleElement {
    public ListNode<Integer> get(ListNode<Integer> list) {
        validateInput(list);

        int size = getListSize(list);
        int middleElementPosition = size % 2 != 0 ? size / 2 : (size / 2) - 1;
        ListNode middleElement = list;
        for (int i = 0; i < middleElementPosition; i++) {
            middleElement = middleElement.getNext();
        }
        return middleElement;
    }

    private int getListSize(ListNode<Integer> list) {
        int size = 0;
        ListNode currentNode = list;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.getNext();
        }
        return size;
    }

    public ListNode<Integer> get2(ListNode<Integer> list) {
        validateInput(list);

        ListNode<Integer> currentNode = list;
        ListNode<Integer> fastNode = list.getNext();
        while (fastNode != null && fastNode.getNext() != null) {
            currentNode = currentNode.getNext();
            fastNode = fastNode.getNext().getNext();
        }
        return currentNode;
    }

    private void validateInput(ListNode list) {
        if (list == null) {
            throw new IllegalArgumentException("You can't pass a null instance of list");
        }
    }
}
