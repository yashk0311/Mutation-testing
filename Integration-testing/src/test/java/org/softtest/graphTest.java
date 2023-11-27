package org.softtest;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class graphTest {
    @Test
    public void testBFS() {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        int[] bfsResult = graph.BFS(0);
        int[] expectedBFS = {0, 1, 2, 3, 4, 5};
        assertArrayEquals(expectedBFS, bfsResult);
    }

    @Test
    public void testDFS() {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        int[] dfsResult = graph.DFS(0);
        int[] expectedDFS = {0, 1, 3, 5, 4, 2};
        assertArrayEquals(expectedDFS, dfsResult);
    }


    @Test
    public void testDijkstra() {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        int[] dijkstraResult = graph.dijkstra(0);
        int[] expectedDijkstra = {0, 1, 1, 2, 2, 3};
        assertArrayEquals(expectedDijkstra, dijkstraResult);
    }
    @Test
    public void testTopologicalSortDFS() {
        TopologicalSortDFS topoSort = new TopologicalSortDFS(6);
        topoSort.addEdge(5, 2);
        topoSort.addEdge(5, 0);
        topoSort.addEdge(4, 0);
        topoSort.addEdge(4, 1);
        topoSort.addEdge(2, 3);
        topoSort.addEdge(3, 1);

        int[] topologicalResult = topoSort.topologicalSort();
        int[] expectedTopological = {5, 4, 2, 3, 1, 0};
        assertArrayEquals(expectedTopological, topologicalResult);
    }

    @Test
    public void testShortestPathBFS(){
        ShortestPathBFS graph;
        graph = new ShortestPathBFS(6);

        // Adding edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        graph.shortestPath(0, 5);
        ArrayList<Integer> shortestPath = graph.shortestPath(0, 5);
        assertEquals(4, shortestPath.size());
        assertEquals(0, (int)shortestPath.get(0));
        assertEquals(3, (int)shortestPath.get(2));
    }
}
