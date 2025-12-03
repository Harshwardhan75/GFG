class Solution {
    int n;
    int[][] cost;
    int[][] dp;
    
    public int tsp(int[][] cost) {
        // code here
        n = cost.length;
        this.cost = cost;
        int min = Integer.MAX_VALUE;
        dp = new int[n+1][1<<n];
        for(int[] i: dp)    Arrays.fill(i,-1);
        
        int visited = 0;
        for(int i=0;i<n;i++){
            min = Math.min(min,cost[0][i]+solve(i,visited));
        }
        
        return min;
    }
    
    
    int solve(int node,int visited){
        if(node==0){
            int totalNodes = 1;
            for(int i=0;i<=16;i++){
                if((visited&(1<<i))!=0)
                    totalNodes++;
            }
            return totalNodes==n?0:1_000_000_00;
        }
        
        if(dp[node][visited]!=-1)
            return dp[node][visited];
        
        visited |= 1<<node;
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if((visited&(1<<i))==0)
                min = Math.min(min,cost[node][i]+solve(i,visited));
        }
        visited &= ~(1<<node);
        return dp[node][visited] = min;
    }
}