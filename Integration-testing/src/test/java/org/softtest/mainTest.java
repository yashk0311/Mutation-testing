package org.softtest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class mainTest{

    public dummyMain mainObj = new dummyMain();
    @Test
    public void testMainDijkstra() {
        int[] expectedDijkstra = {0, 1, 1, 2, 2, 3};
        int[] obtainedDijkstra = mainObj.performDijkstra();
        assertArrayEquals(expectedDijkstra, obtainedDijkstra);
    }
    @Test
    public void testMainTopological() {
        int[] expectedTopological = {5, 4, 2, 3, 1, 0};
        int[] obtainedTopological = mainObj.performTopological();
        assertArrayEquals(expectedTopological, obtainedTopological);
    }
}