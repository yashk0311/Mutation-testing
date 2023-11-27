package org.softtest;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    public TreeNode root;

    public Tree() {
        root = null;
    }

    protected List<Integer> inOrder(TreeNode node) {
        List<Integer> result = new ArrayList<>();
        if (node != null) {
            result.addAll(inOrder(node.left));
            System.out.print(node.val + " ");
            result.add(node.val);
            result.addAll(inOrder(node.right));
        }
        return result;
    }

    public List<Integer> inOrderTraversal() {
        System.out.print("In-order Traversal: ");
        List<Integer> traversalResult = inOrder(root);
        System.out.println();
        return traversalResult;
    }

    protected int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = getHeight(node.left);
            int rightHeight = getHeight(node.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public int getHeightOfTree() {
        return getHeight(root);
    }
}
