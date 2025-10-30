class Solution {
    boolean[][] visited;
    int n,m;
    public void fill(char[][] grid) {
        // Code here
        n = grid.length;
        m = grid[0].length;
        visited = new boolean[n][m];
        
        for(int i=0;i<n;i++){
            if(grid[i][0]=='O') DFS(grid,i,0);
            if(grid[i][m-1]=='O') DFS(grid,i,m-1);
        }
        
        for(int i=0;i<m;i++){
            if(grid[0][i]=='O') DFS(grid,0,i);
            if(grid[n-1][i]=='O') DFS(grid,n-1,i);
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j])
                    grid[i][j] = 'X';
            }
        }
    }
    
    void DFS(char[][] grid,int r,int c){
        visited[r][c] = true;
        
        for(int[] d: new int[][]{{1,0},{0,1},{-1,0},{0,-1}}){
            int nexti = d[0] + r;
            int nextj = d[1] + c;
            
            if(nexti>=0 && nexti<n && nextj>=0 && nextj<m && 
                    !visited[nexti][nextj] && grid[nexti][nextj]=='O'){
                DFS(grid,nexti,nextj);
            }
        }
    }
}
