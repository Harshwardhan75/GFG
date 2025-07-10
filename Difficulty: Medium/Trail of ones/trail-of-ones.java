class Solution {
    public int countConsec(int n) {
        // code here
        int[][] dp=new int[n][2];
        for(int[] i: dp)
            Arrays.fill(i,-1);
        
        return (1<<n) - solve(0,dp,0);
    }
    
    int solve(int index,int[][] dp,int prev){
        if(index>=dp.length)
            return 1;
        
        if(dp[index][prev]!=-1)
            return dp[index][prev];
        
        int zero = solve(index+1,dp,0);
        int one = 0;
        if(prev==0)
            one = solve(index+1,dp,1);
        
        return dp[index][prev] = zero+one;
    }
}
