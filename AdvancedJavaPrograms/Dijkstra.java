import java.util.*;

public class Dijkstra {
    public static void dijkstra(int[][] graph, int src) {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int count = 0; count < n - 1; count++) {
            int u = minDistance(dist, visited);
            visited[u] = true;
            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] != 0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
            }
        }

        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < n; i++)
            System.out.println(i + "\t\t" + dist[i]);
    }

    static int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE, minIdx = -1;
        for (int v = 0; v < dist.length; v++)
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIdx = v;
            }
        return minIdx;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 10, 0, 30, 100},
            {10, 0, 50, 0, 0},
            {0, 50, 0, 20, 10},
            {30, 0, 20, 0, 60},
            {100, 0, 10, 60, 0},
        };
        dijkstra(graph, 0);
    }
}