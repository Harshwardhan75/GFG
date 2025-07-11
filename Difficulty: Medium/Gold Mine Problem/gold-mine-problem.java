class Solution {
    public int maxGold(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int[][] dp=new int[n][m];
        for(int[] i: dp)    Arrays.fill(i,-1);
        
        int max = 0;
        
        for(int i=0;i<n;i++){
            max=Math.max(max,solve(i,0,mat,dp));
        }
        
        return max;
    }
    
    int solve(int row,int col,int[][] mat,int[][] dp){
        int n=mat.length;
        int m=mat[0].length;
        
        if(row<0 || row>=n)
            return -1_00_00_00;
        
        if(col==m-1){
            return mat[row][col];
        }
        
        if(dp[row][col]!=-1)
            return dp[row][col];
        
        int up = solve(row-1,col+1,mat,dp);
        int forward = solve(row,col+1,mat,dp);
        int down = solve(row+1,col+1,mat,dp);
        
        
        return dp[row][col] = Math.max(up,Math.max(forward,down))+mat[row][col];
    }
}