class Solution {
    public ArrayList<Integer> safeNodes(int V, int[][] edges) {
        // Code here
        boolean[] visited = new boolean[V];
        boolean[] pathVisited = new boolean[V];
        
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[V];
        
        Arrays.setAll(graph,o->new ArrayList<>());
        
        for(int[] e: edges){
            graph[e[0]].add(e[1]);
        }
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<V;i++){
            if(!visited[i])
                DFS(graph,i,visited,pathVisited,st);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        while(!st.isEmpty())
            result.add(st.pop());
        
        return result;
    }
    
    boolean DFS(ArrayList<Integer>[] graph,int node,boolean[] visited,
                boolean[] pathVisited,Stack<Integer> st){
        visited[node]=pathVisited[node] = true;
        
        for(int adj: graph[node]){
            if(!visited[adj]){
                if(DFS(graph,adj,visited,pathVisited,st))
                    return true;
            }
            else if(pathVisited[adj])
                return true;
        }
        
        st.push(node);
        return pathVisited[node] = false;
    }
}