// User function Template for Java

class Solution {
    int[] dp=new int[10001];
    public int MinSquares(int n) {
        // Code here
        Arrays.fill(dp,-1);
        return solve(n);
    }
    
    int solve(int n){
        if(n==0)
            return 0;
        
        if(n<0)
            return 1_00000000;
        
        if(dp[n]!=-1)
            return dp[n];
            
        int min=Integer.MAX_VALUE;
        
        for(int i=1;i*i<=n;i++){
            min=Math.min(min,1+solve(n-(i*i)));
        }
        
        return dp[n]=min;
    }
}