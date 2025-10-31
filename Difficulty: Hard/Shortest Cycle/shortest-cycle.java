import java.util.*;
class Solution {
    public int shortCycle(int V, int[][] edges) {
        // Code here
        int min = Integer.MAX_VALUE;
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[V];
        Arrays.setAll(graph,o->new ArrayList<Integer>());
        
        for(int[] e: edges){
            graph[e[0]].add(e[1]);    
            graph[e[1]].add(e[0]);    
        }
        
        for(int[] e: edges){
            int totalEdges = find(graph,e[0],e[1]);
            
            if(totalEdges!=Integer.MAX_VALUE)
                min = Math.min(min,totalEdges+1);
        }
        
        return min==Integer.MAX_VALUE?-1:min;
    }
    
    int find(ArrayList<Integer>[] graph,int src,int dst){
        int n = graph.length;
        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;
        
        Queue<Integer> que = new LinkedList<Integer>();
        que.offer(src);
        
        while(!que.isEmpty()){
            int node = que.poll();
            
            if(node == dst) return dist[dst];
            
            for(int adj: graph[node]){
                if((node == src && adj==dst) || (node==dst && adj==src))
                    continue;
                    
                if(dist[node]+1<dist[adj]){
                    dist[adj] = dist[node]+1;
                    que.offer(adj);
                }
            }
        }
        
        return dist[dst];
    }
}