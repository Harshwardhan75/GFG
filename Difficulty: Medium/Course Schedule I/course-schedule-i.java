class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        // code here
        @SuppressWarnings ("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[n];
        Arrays.setAll(graph,o->new ArrayList<>());
        
        int[] inDegree = new int[n];
        
        for(int[] e: prerequisites){
            graph[e[0]].add(e[1]);
            inDegree[e[1]]++;
        }
        
        Queue<Integer> que = new LinkedList<>();

        for(int i=0;i<n;i++){
            if(inDegree[i]==0)
                que.offer(i);
        }
        
        while(!que.isEmpty()){
            int node = que.poll();
            n--;
            
            for(int adj: graph[node]){
                inDegree[adj]--;
                if(inDegree[adj]==0)
                    que.offer(adj);
            }
        }
        
        return n==0;
    }
}