class Solution {
    int n,m,xd,yd;
    int[][] mat;
    boolean[][] visited;
    
    public int longestPath(int[][] mat, int xs, int ys, int xd, int yd) {
        // code here
        this.mat = mat;
        this.n = mat.length;    
        this.m = mat[0].length;    
        this.xd = xd;
        this.yd = yd;
        this.visited = new boolean[n][m];
        
        return Math.max(-1,solve(xs,ys));
    }
    
    int solve(int r,int c){
        if(r==xd && c==yd)
            return 0;
            
        int max = -1_000_000_000;
        visited[r][c] = true;
        
        for(int[] d: new int[][]{{-1,0},{0,-1},{1,0},{0,1}}){
            int nexti = r + d[0];    
            int nextj = c + d[1];    
            
            if(nexti>=0 && nexti<n && nextj>=0 && nextj<m 
                && !visited[nexti][nextj] && mat[nexti][nextj]==1)
                max = Math.max(max,1 + solve(nexti,nextj));
        }
        
        visited[r][c] = false;
        
        return max;
    }
}