package org.softtest;
import java.util.*;
public class dummyMain{


    public int[] performDijkstra() {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        return graph.dijkstra(0); // Perform Dijkstra's algorithm for shortest path
        // Example: Performing Topological Sort
    }

    public int[] performTopological(){
        TopologicalSortDFS topologicalSortDFS = new TopologicalSortDFS(6);
        topologicalSortDFS.addEdge(5, 2);
        topologicalSortDFS.addEdge(5, 0);
        topologicalSortDFS.addEdge(4, 0);
        topologicalSortDFS.addEdge(4, 1);
        topologicalSortDFS.addEdge(2, 3);
        topologicalSortDFS.addEdge(3, 1);

        return topologicalSortDFS.topologicalSort();
    }
}