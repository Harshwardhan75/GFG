class Solution {
    static int noOfWays(int m, int n, int x) {
        // code here
        int[][] dp=new int[n][x+1];
        for(int[] i: dp)    Arrays.fill(i,-1);
        return solve(n-1,m,x,dp);
    }
    
    static int solve(int n,int m,int x,int[][] dp){
        if(n==0){
            int count =0;
            
            if(x<=m && x!=0)
                return 1;
            
            return 0;
        }
        
        if(dp[n][x]!=-1)
            return dp[n][x];
            
        int count = 0;
        for(int i=1;i<=m;i++){
            if(x-i>0)
                count+=solve(n-1,m,x-i,dp);
        }
        
        return dp[n][x]=count;
    }
};