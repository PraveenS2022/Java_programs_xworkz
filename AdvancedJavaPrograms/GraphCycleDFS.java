import java.util.*;

public class GraphCycleDFS {
    static boolean hasCycle(List<List<Integer>> adj, int v, boolean[] visited, int parent) {
        visited[v] = true;
        for (int neighbor : adj.get(v)) {
            if (!visited[neighbor]) {
                if (hasCycle(adj, neighbor, visited, v)) return true;
            } else if (neighbor != parent) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        adj.get(0).add(1); adj.get(1).add(0);
        adj.get(1).add(2); adj.get(2).add(1);
        adj.get(2).add(3); adj.get(3).add(2);
        adj.get(3).add(4); adj.get(4).add(3);
        adj.get(4).add(1); adj.get(1).add(4);

        boolean[] visited = new boolean[V];
        System.out.println(hasCycle(adj, 0, visited, -1)); // true
    }
}