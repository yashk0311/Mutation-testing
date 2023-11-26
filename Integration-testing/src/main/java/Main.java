import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nAlgorithm Menu");
            System.out.println("1. Graph Algorithms");
            System.out.println("2. Tree Algorithms");
            System.out.println("3. Sorting Algorithms");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performGraphAlgorithms();
                    break;
                case 2:
                    performTreeAlgorithms();
                    break;
                case 3:
                    testSortingAlgorithms();
                    break;
                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);
    }

    private static void performGraphAlgorithms() {
        System.out.println("Performing graph algorithms...");
        Graph graph = createSampleGraph();
        graph.BFS(0);
        graph.DFS(0);
        graph.dijkstra(0); // Perform Dijkstra's algorithm for shortest path

        // Example: Performing Topological Sort
        TopologicalSortDFS topologicalSortDFS = new TopologicalSortDFS(6);
        topologicalSortDFS.addEdge(5, 2);
        topologicalSortDFS.addEdge(5, 0);
        topologicalSortDFS.addEdge(4, 0);
        topologicalSortDFS.addEdge(4, 1);
        topologicalSortDFS.addEdge(2, 3);
        topologicalSortDFS.addEdge(3, 1);

        System.out.println("Performing Topological Sort:");
        topologicalSortDFS.topologicalSort();
    }

    private static void performTreeAlgorithms() {
        System.out.println("Performing tree algorithms...");
        BinaryTree binaryTree = createSampleBinaryTree();
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(7);
        binaryTree.insert(2);
        binaryTree.insert(4);
        binaryTree.insert(6);
        binaryTree.insert(8);
        binaryTree.inOrderTraversal();
        int height = binaryTree.getHeightOfTree();
        System.out.println("Height of the binary tree: " + height);

        boolean isFound = binaryTree.search(7);
        System.out.println("Value 7 found in the binary tree: " + isFound);

        binaryTree.delete(3);
        binaryTree.inOrderTraversal();

        System.out.println("Pre-order traversal of the binary tree:");
        binaryTree.preOrderTraversal(binaryTree.root);

        System.out.println("\nPost-order traversal of the binary tree:");
        binaryTree.postOrderTraversal(binaryTree.root);
    }

    private static Graph createSampleGraph() {
        Graph graph = new Graph(6); // Change '6' to the desired number of vertices
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        return graph;
    }

    private static BinaryTree createSampleBinaryTree() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new TreeNode(6); // Root node
        return binaryTree;
    }

    private static void testSortingAlgorithms() {
        System.out.println("Testing sorting algorithms...");

        int[] arr1 = generateRandomArray(10); // Change size as needed
        int[] arr2 = generateRandomArray(10); // Change size as needed

        // Displaying original arrays
        System.out.println("Original array 1: " + Arrays.toString(arr1));
        System.out.println("Original array 2: " + Arrays.toString(arr2));

        // Testing Merge Sort
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr1, 0, arr1.length - 1);
        System.out.println("Merge Sorted array 1: " + Arrays.toString(arr1));

        // Testing Quick Sort
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr2, 0, arr2.length - 1);
        System.out.println("Quick Sorted array 2: " + Arrays.toString(arr2));
    }

    private static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100); // Change limit as needed
        }
        return arr;
    }
}
