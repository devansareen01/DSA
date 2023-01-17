import java.util.Scanner;

public class DFS {
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

    public static void printHelper(int graph[][], int sv, boolean visited[]) {
        System.out.println(sv);
        visited[sv] = true;
        for (int i = 0; i < graph.length; i++) {
            if (graph[sv][i] == 1 && !visited[i]) {// if there is any disconnected graph it will check either any one is
                                                   // left or not
                printHelper(graph, i, visited);
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
}
