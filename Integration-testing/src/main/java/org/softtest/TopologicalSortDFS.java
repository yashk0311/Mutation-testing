package org.softtest;

import java.util.*;

public class TopologicalSortDFS extends Graph {
    private Stack<Integer> stack;

    public TopologicalSortDFS(int vertices) {
        super(vertices);
        stack = new Stack<>();
    }

    public int[] topologicalSort() {
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topologicalSortUtil(i, visited);
            }
        }

        int[] result = new int[V];
        int index = 0;
        System.out.println("Topological Sort:");
        while (!stack.isEmpty()) {
            int a = stack.pop();
            result[index++] = a;
            System.out.print(a + " ");
        }
        return result;
    }

    private void topologicalSortUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;

        Iterator<Integer> iterator = adjList[vertex].listIterator();
        while (iterator.hasNext()) {
            int next = iterator.next();
            if (!visited[next]) {
                topologicalSortUtil(next, visited);
            }
        }
        stack.push(vertex);
    }
}
