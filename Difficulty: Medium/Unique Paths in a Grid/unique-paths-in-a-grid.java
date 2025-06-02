class Solution {
    public int uniquePaths(int[][] grid) {
        // code here
        int n=grid.length;
        int m=grid[0].length;
        
        if(grid[0][0]==1 || grid[n-1][m-1]==1)
            return 0;
            
        int[][] dp=new int[n][m];
        
        for(int[] i: dp)    Arrays.fill(i,-1);
    
        return solve(grid,dp,n-1,m-1);
    }
    
    int solve(int[][] grid,int[][] dp,int i,int j){
        if(i>=0 && j>=0 && grid[i][j]==1)
            return 0;
        
        if(i==0 && j==0)
            return 1;
        
        if(i<0 || j<0)  
            return 0;
        
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        return dp[i][j]=solve(grid,dp,i-1,j) + solve(grid,dp,i,j-1);
    }
};