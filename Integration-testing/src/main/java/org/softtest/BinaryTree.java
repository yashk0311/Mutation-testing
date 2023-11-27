package org.softtest;
import java.util.*;
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
    public int minValue(TreeNode node) {
        int minValue = node.val;
        while (node.left != null) {
            minValue = node.left.val;
            node = node.left;
        }
        return minValue;
    }

    // Pre-order traversal for binary tree
    public List<Integer> preOrderTraversal(TreeNode node) {
        List<Integer> result = new ArrayList<>();
        preOrderTraversalUtil(node, result);
        //System.out.print("Pre-order Traversal: ");
        result.forEach(val -> System.out.print(val + " "));
        return result;
    }

    private void preOrderTraversalUtil(TreeNode node, List<Integer> result) {
        if (node != null) {
            result.add(node.val);
            preOrderTraversalUtil(node.left, result);
            preOrderTraversalUtil(node.right, result);
        }
    }

    public List<Integer> postOrderTraversal(TreeNode node) {
        List<Integer> result = new ArrayList<>();
        postOrderTraversalUtil(node, result);
        //System.out.print("Post-order Traversal: ");
        result.forEach(val -> System.out.print(val + " "));
        return result;
    }

    private void postOrderTraversalUtil(TreeNode node, List<Integer> result) {
        if (node != null) {
            postOrderTraversalUtil(node.left, result);
            postOrderTraversalUtil(node.right, result);
            result.add(node.val);
        }
    }

    public List<Integer> levelOrderTraversal(TreeNode node) {
        List<Integer> result = new ArrayList<>();
        if (node == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            result.add(current.val);

            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        System.out.print("Level-order Traversal: ");
        result.forEach(val -> System.out.print(val + " "));
        return result;
    }

}
