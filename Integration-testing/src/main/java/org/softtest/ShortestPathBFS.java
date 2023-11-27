package org.softtest;

import java.util.*;

public class ShortestPathBFS extends Graph {
    public ShortestPathBFS(int V) {
        super(V);
    }

    public ArrayList<Integer> shortestPath(int start, int end) {
        boolean[] visited = new boolean[V];
        int[] dist = new int[V];
        int[] prev = new int[V];
        Queue<Integer> queue = new LinkedList<>();

        Arrays.fill(dist, Integer.MAX_VALUE); // Initialize distances to infinity
        visited[start] = true;
        queue.add(start);
        dist[start] = 0;
        prev[start] = -1;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == end) {
                System.out.println("Shortest distance from " + start + " to " + end + " is " + dist[end]);
                return reconstructShortestPath(start, end, prev);
            }

            for (int n : adjList[current]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                    dist[n] = dist[current] + 1;
                    prev[n] = current;
                }
            }
        }

        System.out.println("No path exists from " + start + " to " + end);
        return new ArrayList<>();
    }

    private ArrayList<Integer> reconstructShortestPath(int start, int end, int[] prev) {
        ArrayList<Integer> shortestPath = new ArrayList<>();
        int at = end;
        while (at != -1) {
            shortestPath.add(at);
            at = prev[at];
        }
        Collections.reverse(shortestPath);
        return shortestPath;
    }
}
