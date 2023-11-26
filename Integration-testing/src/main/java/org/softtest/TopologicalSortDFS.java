package org.softtest;

import java.util.Stack;

public class TopologicalSortDFS extends Graph {
    public TopologicalSortDFS(int V) {
        super(V);
    }

    public void topologicalSort() {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        System.out.println("Topological Sort:");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public void topologicalSortUtil(int v, boolean[] visited, Stack<Integer> stack) {
        visited[v] = true;

        for (int n : adjList[v]) {
            if (!visited[n]) {
                topologicalSortUtil(n, visited, stack);
            }
        }

        stack.push(v);
    }
}
