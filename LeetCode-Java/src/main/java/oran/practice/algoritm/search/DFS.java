package oran.practice.algoritm.search;

/**
 * Depth First Search (DFS) algorithm implementation in Java.
 *
 * This class demonstrates the DFS algorithm for traversing a graph represented as an adjacency
 * matrix. The DFS algorithm explores as far as possible along each branch before backtracking. It
 * is commonly used for searching and traversing tree or graph data structures.
 * 
 * * Example usage: *
 * 
 * <pre>
 * int[][] graph = { { 0, 1, 0, 1, 0 }, { 1, 0, 1, 0, 1 }, { 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 1 }, { 0, 1, 0, 1, 0 } };
 * boolean[] visited = new boolean[graph.length];
 * DFS.dfs(graph, 0, visited);
 * // Output: 0 1 2 3 4
 * </pre>
 * 
 * * * Note: The graph is represented as an adjacency matrix where graph[i][j] = 1 indicates an edge
 * between vertex i and vertex j.
 * 
 * * * The DFS algorithm uses recursion to explore each vertex and its adjacent vertices, marking
 * them as visited to avoid cycles. The algorithm starts from a given vertex and explores all
 * its adjacent vertices before backtracking to explore other branches.
 * * * * This implementation assumes the graph is undirected and connected. If the graph is
 * disconnected, the DFS function can be called for each unvisited vertex to ensure all vertices are visited.
 * * * * * The time complexity of DFS is O(V + E), where V is the number of vertices and E is the
 * number of edges in the graph. The space complexity is O(V) due to the recursion stack and visited array.
 */
public class DFS {
    /**
     * Performs Depth First Search (DFS) on a graph represented as an adjacency matrix.
     *
     * @param graph   The adjacency matrix representing the graph.
     * @param vertex  The starting vertex for DFS traversal.
     * @param visited An array to keep track of visited vertices.
     */
    public static void dfs(int[][] graph, int vertex, boolean[] visited) {
        visited[vertex] = true; // Mark the current vertex as visited
        System.out.print(vertex + " "); // Print the current vertex

        // Recur for all the vertices adjacent to this vertex
        for (int i = 0; i < graph[vertex].length; i++) {
            if (graph[vertex][i] == 1 && !visited[i]) {
                dfs(graph, i, visited);
            }
        }
    }
    /**
     * Main method to demonstrate the DFS algorithm.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[][] graph = new int[][]{
                {0, 1, 0, 1, 0},
                {1, 0, 1, 0, 1},
                {0, 1, 0, 0, 0},
                {1, 0, 0, 0, 1},
                {0, 1, 0, 1, 0}
        };

        boolean[] visited = new boolean[graph.length];
        System.out.println("Depth First Search (DFS) starting from vertex 0:");
        dfs(graph, 0, visited);
    }
}
