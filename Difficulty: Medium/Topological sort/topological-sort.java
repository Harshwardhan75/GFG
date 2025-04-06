//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());

            int[][] edges = new int[E][2];
            for (int i = 0; i < E; i++) {
                edges[i][0] = sc.nextInt();
                edges[i][1] = sc.nextInt();
                adj.get(edges[i][0]).add(edges[i][1]);
            }

            ArrayList<Integer> res = new Solution().topoSort(V, edges);

            if (check(adj, V, res) == true)
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
        }
    }

    static boolean check(ArrayList<ArrayList<Integer>> adj, int V,
                         ArrayList<Integer> res) {

        if (V != res.size()) return false;

        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res.get(i)] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : adj.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        boolean[] visited=new boolean[V];
        
        ArrayList<Integer>[] graph=new ArrayList[V];
        for(int i=0;i<V;i++)
            graph[i]=new ArrayList<>();
        
        for(int[] e: edges) graph[e[0]].add(e[1]);
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                DFS(graph,result,visited,i);
            }
        }
        
        Collections.reverse(result);
        
        return result;
    }
    
    static void DFS(ArrayList<Integer>[] graph,ArrayList<Integer> result,boolean[] visited,int node){
        visited[node]=true;
        
        for(int i: graph[node]){
            if(!visited[i])
                DFS(graph,result,visited,i);
        }
        
        result.add(node);
    }
}