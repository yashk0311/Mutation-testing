package org.softtest;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathBFS extends Graph {
    public ShortestPathBFS(int V) {
        super(V);
    }

    public void shortestPath(int start, int end) {
        boolean[] visited = new boolean[V];
        int[] dist = new int[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);
        dist[start] = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == end) {
                System.out.println("Shortest path from " + start + " to " + end + " is " + dist[end]);
                return;
            }

            for (int n : adjList[current]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                    dist[n] = dist[current] + 1;
                }
            }
        }

        System.out.println("No path exists from " + start + " to " + end);
    }
}
