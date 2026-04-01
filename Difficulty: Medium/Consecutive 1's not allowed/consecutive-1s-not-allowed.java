class Solution {
    int[][] dp;
    int countStrings(int n) {
        // code here
        dp = new int[n+1][2];
        for(int[] i: dp)
            Arrays.fill(i,-1);
        return solve(n,0);
    }
    
    int solve(int n,int prev){
        if(n==0)
            return 1;
        
        if(dp[n][prev]!=-1)
            return dp[n][prev];
        
        return dp[n][prev] = solve(n-1,0) + (prev==0?solve(n-1,1):0);
    }
}