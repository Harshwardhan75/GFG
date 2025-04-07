//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();
            int[][] edges = new int[E][2];
            for (int i = 0; i < E; i++) {
                edges[i][0] = sc.nextInt();
                edges[i][1] = sc.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.isCyclic(V, edges);
            System.out.println(ans ? "true" : "false");
        }
        sc.close();
    }
}
// } Driver Code Ends


class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        boolean[]visited=new boolean[V];
        boolean[]pathvisited=new boolean[V];
        ArrayList<Integer>[] graph=new ArrayList[V];
        for(int i=0;i<V;i++)    graph[i]=new ArrayList<>();
        for(int[] e: edges){
            graph[e[0]].add(e[1]);
        }
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(DFS(graph,i,visited,pathvisited))
                    return true;
            }
        }
        
        return false;
    }
    
    boolean DFS(ArrayList<Integer>[] graph,int node,boolean[] visited,boolean[] pathvisited){
        visited[node]=pathvisited[node]=true;
        
        for(int adj: graph[node]){
            if(!visited[adj]){
                if(DFS(graph,adj,visited,pathvisited))
                    return true;
            }
            else if(pathvisited[adj])
                return true;
        }
        
        return pathvisited[node]=false;
    }
}