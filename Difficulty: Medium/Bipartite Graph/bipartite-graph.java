class Solution {
    public boolean isBipartite(int V, int[][] edges) {
        // Code here
        
        ArrayList<Integer>[] graph=new ArrayList[V];
        for(int i=0;i<V;i++)
            graph[i]=new ArrayList<>();
            
        for(int[] e: edges){
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        
        int[] color=new int[V];
        Arrays.fill(color,-1);
        for(int i=0;i<V;i++){
            if(color[i]==-1)
                if(find(graph,i,color,0))
                    return false;
        }
        
        return true;
    }
    
    boolean find(ArrayList<Integer>[] graph,int node,int[] color,int currC){
        color[node]=currC;
        
        for(int i: graph[node]){
            if(color[i]==-1){
                if(find(graph,i,color,1-currC))
                    return true;
            }
            if(color[i]==color[node])
                return true;
        }
        
        return false;
    }
}