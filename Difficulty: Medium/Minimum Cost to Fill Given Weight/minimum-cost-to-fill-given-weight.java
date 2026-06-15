class Solution {
    int[] cost;
    int n;
    int[][] dp;
    
    public int minimumCost(int[] cost, int w) {
        // code here
        this.cost = cost;
        this.n = cost.length;
        this.dp = new int[n][w+1];
        for(int[] i: dp)
            Arrays.fill(i,-1);
            
        int val = solve(0,w);
        
        return val>=1_00_00_00_00?-1:val;
    }
    
    int solve(int index,int W){
        if(W==0)
            return 0;
        
        if(index>=n){
            return W==0?0:1_00_00_00_00;
        }
        
        if(dp[index][W]!=-1)
            return dp[index][W];
        
        int nt = solve(index+1,W);
        int t = Integer.MAX_VALUE;
        
        if(cost[index]!=-1 && (index+1)<=W)
            t = cost[index] + solve(index,W-(index+1));
        
        return dp[index][W] = Math.min(nt,t);
    }
}