package org.softtest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class treeTest {
    private BinaryTree binaryTree;

    @BeforeEach
    public void setUp() {
        binaryTree = new BinaryTree();
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(7);
        binaryTree.insert(2);
        binaryTree.insert(4);
        binaryTree.insert(6);
        binaryTree.insert(8);
    }

    @Test
    public void testInOrderTraversal() {
        List<Integer> expected = List.of(2, 3, 4, 5, 6, 7, 8);
        List<Integer> result = binaryTree.inOrderTraversal();
        assertEquals(expected, result);
    }

    @Test
    public void testHeightOfTree() {
        int expectedHeight = 3; // As the tree has 3 levels
        int height = binaryTree.getHeightOfTree();
        assertEquals(expectedHeight, height);
    }

    @Test
    public void testSearch() {
        assertTrue(binaryTree.search(6));
        assertFalse(binaryTree.search(10));
    }

    @Test
    public void testPreOrderTraversal() {
        List<Integer> expected = List.of(5, 3, 2, 4, 7, 6, 8);
        List<Integer> result = binaryTree.preOrderTraversal(binaryTree.root);
        assertEquals(expected, result);
    }

    @Test
    public void testPostOrderTraversal() {
        List<Integer> expected = List.of(2, 4, 3, 6, 8, 7, 5);
        List<Integer> result = binaryTree.postOrderTraversal(binaryTree.root);
        assertEquals(expected, result);
    }

    @Test
    public void testLevelOrderTraversal() {
        List<Integer> expected = List.of(5, 3, 7, 2, 4, 6, 8);
        List<Integer> result = binaryTree.levelOrderTraversal(binaryTree.root);
        assertEquals(expected, result);
    }

    @Test
    public void testDelete() {
        binaryTree.delete(4);
        List<Integer> expectedAfterDeletion = List.of(2, 3, 5, 6, 7, 8);
        List<Integer> result = binaryTree.inOrderTraversal();
        assertEquals(expectedAfterDeletion, result);
        binaryTree.delete(2);
        assertFalse(binaryTree.search(2));

        // Test deletion of a node with one child
        binaryTree.delete(3);
        assertFalse(binaryTree.search(3));
        assertTrue(binaryTree.search(8));

        // Test deletion of a node with two children
        binaryTree.delete(5);
        assertFalse(binaryTree.search(5));
        assertTrue(binaryTree.search(6));
        assertTrue(binaryTree.search(7));
    }

    @Test
    public void testMinValue(){
        assertEquals(2, binaryTree.minValue(binaryTree.root));
    }

    @Test
    public void buildInvalidTree(){
        binaryTree = new BinaryTree();
        binaryTree.insert(5);
        binaryTree.insert(5);
        binaryTree.insert(5);
    }
}
