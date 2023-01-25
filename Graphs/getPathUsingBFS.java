/*
    Time Complexity : O(V+E)
    Space Complexity : O(V)

    Where V is the number of nodes and E is the number of edges in the graph
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;


public class Solution {
    
    static ArrayList<Integer> getPath(int V, int E, ArrayList<Integer> a, ArrayList<Integer> b, int v1, int v2) {
    // Initialize a vector to store the parent of all the nodes.
    int[] par=new int[V];
    Arrays.fill(par, -1);

    // Map of List to store all the edges.
    HashMap<Integer,  ArrayList<Integer>> graph= new HashMap<>();
    for (int i = 0; i < a.size(); i++) {

        if(graph.get(a.get(i))==null)
        {
            graph.put(a.get(i),new ArrayList<Integer>());
        }

        if(graph.get(b.get(i))==null)
        {
            graph.put(b.get(i),new ArrayList<Integer>());
        }


        graph.get(a.get(i)).add(b.get(i));
        graph.get(b.get(i)).add(a.get(i));
    }

    // List to store the final answer.
    ArrayList<Integer> ans=new ArrayList<>();

    // If the first node is the last node return first node only.
    if (v1 == v2) {
        ans.add(v2);
        return ans;
    }

    // Queue to store the nodes of BFS.
    Queue<Integer> q=new LinkedList<>();

    // Start BFS from v1.
    q.add(v1);

    while (q.isEmpty()==false) {
        int t = q.peek();
        q.poll();

        if(graph.get(t)==null)
        {
            continue;
        }
        
        for (int i = 0; i < graph.get(t).size(); i++) {

            int curr = graph.get(t).get(i);

            // Avoid revisiting the nodes.
            if (curr == v1) {
                continue;
            }
            if (par[curr] != -1) {
                continue;
            }
            par[curr] = t;
            q.add(curr);
        }
    }

    /*
        Iterate in the parent array from the end
        node till you reach the starting node.
    */

    int k = v2;
    while (k != -1) {
        ans.add(k);
        k = par[k];
    }

    // If no path exist return an empty list.
    ArrayList<Integer> nPoss=new ArrayList<>();
    if (ans.get(ans.size() - 1) != v1) {
        return nPoss;
    }
    return ans;
       
    }
    
}
