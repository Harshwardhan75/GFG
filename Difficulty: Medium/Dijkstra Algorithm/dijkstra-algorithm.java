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

            int src = Integer.parseInt(sc.nextLine());

            Solution obj = new Solution();
            int[] res = obj.dijkstra(V, edges, src);

            for (int val : res) {
                System.out.print(val + " ");
            }
            System.out.println();
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        ArrayList<int[]>[] graph=new ArrayList[V];
        for(int i=0;i<V;i++)
            graph[i]=new ArrayList<>();
        
        for(int[] e: edges){
            graph[e[0]].add(new int[]{e[1],e[2]});
            graph[e[1]].add(new int[]{e[0],e[2]});
        }
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{src,0});
        int[] dist=new int[V];
        Arrays.fill(dist,(int)1e9);
        dist[src]=0;
        
        while(!pq.isEmpty()){
            int node=pq.peek()[0];
            int d=pq.peek()[1];
            pq.poll();
            
            for(int[] adj: graph[node]){
                int adjnode=adj[0];
                int adjwt=adj[1];
                
                if(d+adjwt<dist[adjnode]){
                    dist[adjnode]=d+adjwt;
                    pq.offer(new int[]{adjnode,dist[adjnode]});
                }
            }
        }
        
        return dist;
    }
}