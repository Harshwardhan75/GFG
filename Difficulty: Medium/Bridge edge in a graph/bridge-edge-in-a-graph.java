//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

class Solution {
    public boolean isBridge(int V, int[][] edges, int c, int d) {
        // code here
        boolean[] visited=new boolean[V];
        int[] tin=new int[V];
        int[] low=new int[V];
        Arrays.fill(tin,-1);
        Arrays.fill(low,-1);
        ArrayList<Integer>[] graph=new ArrayList[V];
        
        for(int i=0;i<V;i++)    graph[i]=new ArrayList<>();
        
        for(int[] e: edges){
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        
        DFS(graph,tin,low,visited,c,-1,new int[1]);
        // for(int i: tin)System.out.print(i+" ");
        // System.out.println();
        // for(int i: low)System.out.print(i+" ");
        // System.out.println();
        return tin[c]<low[d];
    }
    
    void DFS(ArrayList<Integer>[] graph,int[] tin,int[] low,boolean[] visited
        , int node,int parent, int[] time){
            visited[node]=true;
            tin[node]=low[node]=time[0];
            time[0]++;
            
            for(int adj: graph[node]){
                if(adj==parent) continue;
                
                if(!visited[adj]){
                    DFS(graph,tin,low,visited,adj,node,time);
                    low[node]=Math.min(low[node],low[adj]);
                }
                else{
                    low[node]=Math.min(low[node],low[adj]);
                }
            }
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            // V and E on separate lines
            int V = Integer.parseInt(sc.nextLine().trim());
            int E = Integer.parseInt(sc.nextLine().trim());

            // Using a 2D array to store edges.
            int[][] edges = new int[E][2];
            for (int i = 0; i < E; i++) {
                // Use split("\\s+") to handle one or more whitespace characters
                String[] parts = sc.nextLine().trim().split("\\s+");
                edges[i][0] = Integer.parseInt(parts[0]);
                edges[i][1] = Integer.parseInt(parts[1]);
            }

            // c and d on separate lines
            int c = Integer.parseInt(sc.nextLine().trim());
            int d = Integer.parseInt(sc.nextLine().trim());

            Solution obj = new Solution();
            boolean result = obj.isBridge(V, edges, c, d);
            System.out.println(result ? "true" : "false");
            System.out.println("~");
        }

        sc.close();
    }
}
// } Driver Code Ends