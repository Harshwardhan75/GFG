class Solution {
    public int countPaths(int[][] edges, int V, int src, int dest) {
        // Code here
        ArrayList<Integer>[] graph=new ArrayList[V];
        
        for(int i=0;i<V;i++)    graph[i]=new ArrayList<>();
        
        for(int[] e: edges)
            graph[e[0]].add(e[1]);
            
            
        int[] dp=new int[V];
        Arrays.fill(dp,-1);

        return solve(graph,src,dest,dp);
    }
    
    int solve(ArrayList<Integer>[] graph,int node,int dst,int[] dp){
        if(node==dst)
            return 1;
        
        if(dp[node]!=-1)
            return dp[node];
        
        int count = 0;

        for(int i: graph[node]){
            count+=solve(graph,i,dst,dp);
        }
        
        return dp[node] = count;
    }
}