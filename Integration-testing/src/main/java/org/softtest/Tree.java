package org.softtest;

public class Tree {
    protected TreeNode root;

    public Tree() {
        root = null;
    }

    protected void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.val + " ");
            inOrder(node.right);
        }
    }

    public void inOrderTraversal() {
        System.out.print("In-order Traversal: ");
        inOrder(root);
        System.out.println();
    }

    protected int getHeight(TreeNode node) {
        if (node == null) {
            return -1;
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
