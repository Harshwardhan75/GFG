class Solution {
    public ArrayList<Integer> findOrder(int n, int[][] prerequisites) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[n];
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[n];
        Arrays.setAll(graph,o->new ArrayList<>());
        
        for(int[] e: prerequisites){
            graph[e[0]].add(e[1]);
        }
        
        for(int i=0;i<n;i++){
            if(!visited[i])
                if(!solve(graph,i,visited,new boolean[n],result))
                    return new ArrayList<>();
        }

        if(result.size()!=n)
            return new ArrayList<>();
        
        return result;
    }
    
    boolean solve(ArrayList<Integer>[] graph,int node,boolean[] visited,
            boolean[] pathvisited,ArrayList<Integer> result){
        visited[node] = pathvisited[node] =true;
        
        for(int adj: graph[node]){
            if(!visited[adj]){
                if(!solve(graph,adj,visited,pathvisited,result))    
                   return false;
            }
            else if(pathvisited[adj])
                return false;
        }
        
        result.add(node);
        pathvisited[node] = false;
        return true;
    }
}