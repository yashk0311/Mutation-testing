import java.util.*;

public class Graph {
    protected int V; // Number of vertices
    protected LinkedList<Integer>[] adjList; // Adjacency list representation

    public Graph(int V) {
        this.V = V;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; ++i)
            adjList[i] = new LinkedList<>();
    }

    public void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    public void BFS(int start) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            start = queue.poll();
            System.out.print(start + " ");

            for (int n : adjList[start]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        System.out.println();
    }

    public void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int n : adjList[v]) {
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    public void DFS(int start) {
        boolean[] visited = new boolean[V];
        DFSUtil(start, visited);
        System.out.println();
    }

    public void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>(V, Comparator.comparingInt(a -> a.weight));
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            int u = pq.poll().vertex;

            for (int v : adjList[u]) {
                int weight = getWeight(u, v); // Function to get weight of edge u-v
                if (dist[v] > dist[u] + weight) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Node(v, dist[v]));
                }
            }
        }

        System.out.println("Shortest distances from vertex " + start + ":");
        for (int i = 0; i < V; i++) {
            System.out.println("Vertex " + i + ": " + dist[i]);
        }
    }

    private static class Node {
        int vertex;
        int weight;

        public Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    // Function to get weight of edge between vertices u and v
    private int getWeight(int u, int v) {
        // Replace this with your implementation to get weight from an edge list or matrix
        return 1; // For now, assuming all weights are 1
    }
}
