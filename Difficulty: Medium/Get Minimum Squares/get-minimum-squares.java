class Solution {
    Integer[] dp = new Integer[100001];
    public int minSquares(int n) {
        // Code here
        int count = 0;
        
        return solve(n);
    }
    
    int solve(int n){
        if(n==0)
            return 0;
        
        if(n<0)
            return 1000000;
        
        if(dp[n]!=null)
            return dp[n];
        
        int min = Integer.MAX_VALUE;
        
        for(int i=1;i*i<=n;i++){
            min = Math.min(min, 1 + solve(n-(i*i)));
        }
        
        return dp[n] = min;
    }
}