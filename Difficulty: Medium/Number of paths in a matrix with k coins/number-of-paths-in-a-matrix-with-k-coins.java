class Solution {
    int n, m;
    int[][][] dp;
    public int numberOfPath(int[][] mat, int k) {
        // code here
        n = mat.length;
        m = mat[0].length;
        
        dp = new int[n][m][k+1];
        for(int[][] i: dp)  for(int[] j: i) Arrays.fill(j,-1);
        
        return solve(mat,0,0,k);
    }
    
    int solve(int[][] arr,int r,int c,int sum){
        if(sum<0 || r>=n || c>=m)
            return 0;
        
        if(r==n-1 && c==m-1)
            return sum-arr[r][c] == 0? 1: 0; 
        
        if(dp[r][c][sum]!=-1)
            return dp[r][c][sum];
        
        int down = solve(arr,r+1,c,sum - arr[r][c]);
        int right = solve(arr,r,c+1,sum - arr[r][c]);
        
        return dp[r][c][sum] = down + right;
    }
}