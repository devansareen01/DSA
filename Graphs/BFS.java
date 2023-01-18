
import java.util.*;

public class BFS {

    public static void printHelper(int graphs[][], int sv, boolean visited[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(sv);
    
        visited[sv] = true;
        while (!q.isEmpty()) {
            int front = q.poll();
            System.out.println(front);
            for (int i = 0; i < graphs.length; i++) {
                if (graphs[front][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true; 
                }
            }

        }
    }

    public static void print(int graph[][], int sv) {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                printHelper(graph, i, visited);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int v = scn.nextInt();// no. of vertices
        int e = scn.nextInt();// no. of edges
        int graph[][] = new int[v][v];
        for (int i = 0; i < e; i++) {
            int fv = scn.nextInt(); // first vertices
            int sv = scn.nextInt();// second vertices
            graph[fv][sv] = 1;
            graph[sv][fv] = 1;
        }
        print(graph, 0);
    }
}
