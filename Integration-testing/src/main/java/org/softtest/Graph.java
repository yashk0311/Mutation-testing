package org.softtest;

import java.util.*;

public class Graph {
    protected int V;
    protected LinkedList<Integer>[] adjList;

    public Graph(int vertices) {
        V = vertices;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; ++i) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjList[source].add(destination);
    }

    public int[] BFS(int start) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            start = queue.poll();
            result.add(start);

            Iterator<Integer> iterator = adjList[start].listIterator();
            while (iterator.hasNext()) {
                int next = iterator.next();
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }

        int[] resultArray = result.stream().mapToInt(Integer::intValue).toArray();
        return resultArray;
    }

    public int[] DFS(int start) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        DFSUtil(start, visited, result);

        int[] resultArray = result.stream().mapToInt(Integer::intValue).toArray();
        return resultArray;
    }

    private void DFSUtil(int vertex, boolean[] visited, ArrayList<Integer> result) {
        visited[vertex] = true;
        result.add(vertex);

        Iterator<Integer> iterator = adjList[vertex].listIterator();
        while (iterator.hasNext()) {
            int next = iterator.next();
            if (!visited[next]) {
                DFSUtil(next, visited, result);
            }
        }
    }

    public int[] dijkstra(int start) {
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, visited);
            visited[u] = true;

            for (int v = 0; v < V; v++) {
                if (!visited[v] && adjList[u].contains(v) && dist[u] != Integer.MAX_VALUE && dist[u] + 1 < dist[v]) {
                    dist[v] = dist[u] + 1;
                }
            }
        }
        System.out.println("Shortest distances from vertex " + start + ":");
        for (int i = 0; i < V; i++) {
            System.out.println("Vertex " + i + ": " + dist[i]);
        }
        return dist;
    }

    private int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
}
