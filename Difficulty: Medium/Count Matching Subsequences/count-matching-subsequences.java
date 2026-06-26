class Solution {
    String s1,s2;
    int n,m;
    int[][] dp;
    int MOD = 1_000_000_000+7;
    public int countWays(String s1, String s2) {
        // code here
        this.s1 = s1;
        this.s2 = s2;
        n = s1.length();
        m = s2.length();
        dp = new int[n][m];
        for(int[] i: dp)
            Arrays.fill(i,-1);
            
        return solve(0,0);
    }
    
    int solve(int i,int j){
        if(j>=m)
            return 1;
        
        if(i>=n)
            return 0;
        
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        int a = solve(i+1,j);
        
        int b = 0;
        
        if(s1.charAt(i)==s2.charAt(j))
            b = solve(i+1,j+1);
        
        return dp[i][j] = (a + b)%MOD;
    }
}
