class Solution {
    int[][] grid;
    int n,m;
    int[][][] dp;
    public int maxChocolate(int grid[][]) {
        // code here
        // c1,r,c2
        this.grid = grid;
        this.n = grid.length;
        this.m = grid[0].length;
        this.dp = new int[m][n][m];
        for(int[][] I: dp)
            for(int[] i: I)
                Arrays.fill(i,-1);
                
        return solve(0,0,m-1);
    }
    
    int solve(int c1,int row,int c2){
        if(row==n)
            return 0;
        
        if(c1<0 || c2<0 ||  c1>=m || c2>=m)
            return -1_00_00_00_00;
        
        if(dp[c1][row][c2]!=-1)
            return dp[c1][row][c2];
            
        int max = 0;
        
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                max = Math.max(max,solve(c1+i,row+1,c2+j));
            }
        }
        
        return dp[c1][row][c2] = max + (grid[row][c1] + (c1==c2?0:grid[row][c2]));
    }
}