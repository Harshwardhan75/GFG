class Solution {
    int[] dp;
    public int maxSum(int n) {
        // code here.
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n);
    }
    
    int solve(int n){
        if(n==0)
            return 0;
        
        if(dp[n]!=-1)
            return dp[n];
                
        return dp[n] = Math.max(n,solve(n/2)+solve(n/3)+solve(n/4));
    }
}
