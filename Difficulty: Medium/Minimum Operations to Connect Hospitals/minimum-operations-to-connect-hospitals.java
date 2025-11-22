class Solution {
    public int minConnect(int V, int[][] ee) {
        // code here
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[V];
        
        Arrays.setAll(graph,o-> new ArrayList<>());
        
        for(int[] e: ee){
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        
        boolean[] visited = new boolean[V];
        
        int component = 0;
        int extra = 0;
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                int[] nodes = new int[1];
                int edges = DFS(graph,visited,i,nodes);
                edges /=2;
                
                int total = nodes[0]-1;
                
                extra += edges - total;
                component ++ ;
            }
        }
        // System.out.println(extra);
        return extra<component-1?-1:component -1 ;
    }
    
    int DFS(ArrayList<Integer>[] graph,boolean[] visited,int node,int[] nodes){
        nodes[0] ++;
        
        int edge = 0;
        visited[node] = true;
        
        for(int adj: graph[node]){
            edge ++;
            if(!visited[adj])
                edge += DFS(graph,visited,adj,nodes);
        }
        
        return edge;
    }
}
