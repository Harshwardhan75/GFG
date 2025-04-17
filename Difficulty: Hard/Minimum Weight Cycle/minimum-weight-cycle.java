//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            int V = Integer.parseInt(sc.nextLine());
            int E = Integer.parseInt(sc.nextLine());

            List<int[]> edgeList = new ArrayList<>();

            for (int i = 0; i < E; i++) {
                String[] parts = sc.nextLine().split(" ");
                int u = Integer.parseInt(parts[0]);
                int v = Integer.parseInt(parts[1]);
                int w = Integer.parseInt(parts[2]);
                edgeList.add(new int[] {u, v, w});
                edgeList.add(new int[] {v, u, w});
            }

            int[][] edges = new int[edgeList.size()][3];
            for (int i = 0; i < edgeList.size(); i++) {
                edges[i] = edgeList.get(i);
            }

            Solution obj = new Solution();
            int res = obj.findMinCycle(V, edges);

            System.out.println(res);
        }

        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    
    public int dijkstra(int src,int dst,ArrayList<int[]>[] graph){
        int[] dist=new int[graph.length];
        Arrays.fill(dist,(int)1e6);
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{src,0});
        dist[src]=0;
        
        while(!pq.isEmpty()){
            int node=pq.peek()[0];
            int d=pq.peek()[1];
            pq.poll();
            

            for(int[] adj: graph[node]){
                int adj_node=adj[0];
                int adj_w=adj[1];
                
                if((node==src && adj_node==dst) || (node==dst && adj_node==src))
                    continue;
                
                if(d+adj_w<dist[adj_node]){
                    dist[adj_node]=d+adj_w;
                    pq.offer(new int[]{adj_node,dist[adj_node]});
                }
            }
        }
        
        return dist[dst];
    }
    
    public int findMinCycle(int V, int[][] edges) {
        // code here
        ArrayList<int[]>[] graph=new ArrayList[V];
        for(int i=0;i<V;i++)
            graph[i]=new ArrayList<>();
        
        for(int[] e: edges){
            int u=e[0];
            int v=e[1];
            int w=e[2];
            graph[u].add(new int[]{v,w});
            graph[v].add(new int[]{u,w});
        }
        int min=Integer.MAX_VALUE;
        for(int[] e: edges){
            int d=dijkstra(e[0],e[1],graph);
            if(d!=(int)1e6)
                min=Math.min(min,d+e[2]);
        }
        return min;
    }
};