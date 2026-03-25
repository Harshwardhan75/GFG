class Solution {
    public ArrayList<Integer> minHeightRoot(int V, int[][] edges) {
        // Code here
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[V];
        Arrays.setAll(graph,o-> new ArrayList<>());
        int[] inDegree = new int[V];
        Arrays.fill(inDegree,-1);
        
        for(int[] e: edges){
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
            
            inDegree[e[0]]++;
            inDegree[e[1]]++;
        }
        
        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(inDegree[i]==0){
                que.offer(i);
            }
        }
        
        // System.out.println(Arrays.toString(inDegree));
        
        ArrayList<Integer> result = new ArrayList<>();
        
        while(!que.isEmpty()){
            int size = que.size();
            ArrayList<Integer> temp = new ArrayList<>();
            // System.out.println(que);
            for(int i=1;i<=size;i++){
                int node = que.poll();
                temp.add(node);
                // que.offer(node);
                
                for(int adj: graph[node]){
                    inDegree[adj]--;
                    if(inDegree[adj]==0)
                        que.offer(adj);
                }
            }
            
            result = temp;
        }
        
        return result;
    }
    
    ArrayList<Integer> findLeaves(ArrayList<Integer>[] graph,int last){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(last);
        int n = graph.length;
        boolean[] visited = new boolean[n];
        visited[last] = true;
        int[] outDegree = new int[n];
        
        Queue<Integer> que = new LinkedList<>();
        que.offer(last);
        
        while(!que.isEmpty()){
            int node = que.poll();
            
            for(int adj: graph[node]){
                if(!visited[adj]){
                    que.offer(adj);
                    visited[adj] = true;
                    outDegree[node]++;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            if(outDegree[i]==0)
                result.add(i);
        }
        
        return result;
    }
    
    int getLastNode(ArrayList<Integer>[] graph){
        int n = graph.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> que = new LinkedList<>();
        que.offer(0);
        visited[0] = true;
        int last = 0;
        
        while(!que.isEmpty()){
            last = que.poll();
            
            for(int adj: graph[last]){
                if(!visited[adj]){
                    visited[adj] = true;
                    que.offer(adj);
                }
            }
        }
        
        return last;
    }
}