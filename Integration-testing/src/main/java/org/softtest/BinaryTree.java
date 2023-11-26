package org.softtest;

public class BinaryTree extends Tree {

    public BinaryTree() {
        super();
    }

    // Method to insert a node into the binary tree
    public void insert(int val) {
        root = insertNode(root, val);
    }

    // Helper method to insert a node into the binary tree
    private TreeNode insertNode(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        }

        if (val < node.val) {
            node.left = insertNode(node.left, val);
        } else if (val > node.val) {
            node.right = insertNode(node.right, val);
        }

        return node;
    }

    // Method to search for a value in the binary tree
    public boolean search(int val) {
        return searchNode(root, val);
    }

    // Helper method to search for a value in the binary tree
    private boolean searchNode(TreeNode node, int val) {
        if (node == null) {
            return false;
        }

        if (val == node.val) {
            return true;
        } else if (val < node.val) {
            return searchNode(node.left, val);
        } else {
            return searchNode(node.right, val);
        }
    }

    // Method to delete a node from the binary tree
    public void delete(int val) {
        root = deleteNode(root, val);
    }

    // Helper method to delete a node from the binary tree
    private TreeNode deleteNode(TreeNode node, int val) {
        if (node == null) {
            return null;
        }

        if (val < node.val) {
            node.left = deleteNode(node.left, val);
        } else if (val > node.val) {
            node.right = deleteNode(node.right, val);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            node.val = minValue(node.right);
            node.right = deleteNode(node.right, node.val);
        }

        return node;
    }

    // Helper method to find the minimum value in the binary tree
    private int minValue(TreeNode node) {
        int minValue = node.val;
        while (node.left != null) {
            minValue = node.left.val;
            node = node.left;
        }
        return minValue;
    }

    // Pre-order traversal for binary tree
    public void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    // Post-order traversal for binary tree
    public void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.val + " ");
        }
    }
}
