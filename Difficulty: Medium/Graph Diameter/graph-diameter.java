class Solution {
    public int diameter(int V, int[][] edges) {
        // Code here
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[V];
        Arrays.setAll(graph,o->new ArrayList<>());
        
        for(int[] e: edges){
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        
        int last = BFS(graph);
        
        int level = 0;
        Queue<Integer> que = new LinkedList<Integer>();
        boolean[] visited = new boolean[V];
        que.offer(last);
        visited[last] = true;
        
        while(!que.isEmpty()){
            int size = que.size();
            
            for(int i=1;i<=size;i++){
                int node = que.poll();
                
                for(int adj: graph[node]){
                    if(!visited[adj]){
                        visited[adj] = true;
                        que.offer(adj);
                    }
                }
            }
            
            level++;
        }
        
        return level - 1;
    }
    
    
    int BFS(ArrayList<Integer>[] graph){
        int V = graph.length;
        Queue<Integer> que = new LinkedList<Integer>();
        boolean[] visited = new boolean[V];
        que.offer(0);
        visited[0] = true;
        int last = 0;
        while(!que.isEmpty()){
            int size = que.size();
            
            for(int i=1;i<=size;i++){
                int node = que.poll();
                
                for(int adj: graph[node]){
                    if(!visited[adj]){
                        visited[adj] = true;
                        que.offer(adj);
                    }
                }
                
                last = node;
            }
        }
        
        return last;
    }
}