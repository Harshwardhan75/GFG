class Solution {
    int n,m;
    final int MOD = 1_000_000_000+7;
    int[] dp;
    public int countWays(int n, int m) {
        // code here
        this.n=n;
        this.m=m;
        this.dp = new int[n];
        Arrays.fill(dp,-1);
        
        return solve(0);
    }
    
    int solve(int r){
        if(r>n)
            return 0;
            
        if(r==n)
            return 1;
        
        if(dp[r]!=-1)
            return dp[r];
        
        int h = solve(r+1);
        int v = solve(r+m);
    
        return dp[r] = (h + v)%MOD;
    }
}