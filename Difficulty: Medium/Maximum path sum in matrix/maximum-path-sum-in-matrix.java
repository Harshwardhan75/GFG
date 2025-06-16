// User function Template for Java
class Solution {
    public int maximumPath(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int[][] dp=new int[n][m];
        for(int[] i: dp)    Arrays.fill(i,-1);
        
        int max=0;
        
        for(int i=0;i<m;i++){
            max=Math.max(max,solve(mat,n-1,i,dp));
        }
        
        return max;
    }
    
    int solve(int[][] matrix,int r,int c,int[][] dp){
        int n=matrix.length;
        int m=matrix[0].length;
        
        if(c<0 || c>=m)
            return -1_00_000_000;
        
        if(r==0){
            return matrix[r][c];
        }
        
        if(dp[r][c]!=-1)
            return dp[r][c];
        
        int up_left=solve(matrix,r-1,c-1,dp);
        int up=solve(matrix,r-1,c,dp);
        int up_right=solve(matrix,r-1,c+1,dp);
        
        return dp[r][c] = Math.max(up,Math.max(up_left,up_right))+matrix[r][c];
    }
}