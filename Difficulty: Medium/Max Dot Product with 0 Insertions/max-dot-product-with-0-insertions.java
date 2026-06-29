class Solution {
    int n,m;
    int[] a;
    int[] b;
    int[][] dp;
    public int maxDotProduct(int[] a, int[] b) {
        // code here
        this.a = a;
        this.b = b;
        this.n = a.length;
        this.m = b.length;
        this.dp = new int[n][m];
        for(int[] I: dp)    Arrays.fill(I,-1);
        
        return solve(0,0);
    }
    
    int solve(int i,int j){
        if(i>=n)
            return j>=m?0:Integer.MIN_VALUE;
        
        if(j>=m)
            return 0;
        
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        int zero = (a[i]*0) + solve(i+1,j);
        int same = (a[i]*b[j]) + solve(i+1,j+1);
        
        return dp[i][j] = Math.max(zero,same);
    }
}