class Solution {
    public int findMotherVertex(int V, int[][] edges) {
        // code here
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[V];
        Arrays.setAll(graph,o-> new ArrayList<>());
        
        for(int[] e: edges)
            graph[e[0]].add(e[1]);
        
        boolean[] visited = new boolean[V];
        int ans = -1;
        for(int i=0;i<V;i++){
            if(!visited[i]){
                DFS(graph,visited,i);
                ans = i;
            }
        }
        
        Arrays.fill(visited,false);
        DFS(graph,visited,ans);
            
        for(var x: visited)
            if(!x)
                return -1;
                
        return ans;
    }
    
    void DFS(ArrayList<Integer>[] graph,boolean[] visited,int node){
        visited[node] = true;
        
        for(int adj: graph[node]){
            if(!visited[adj])
                DFS(graph,visited,adj);
        }
    }
}