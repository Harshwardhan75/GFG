class Solution {
    ArrayList<String> result;
    int[][] maze;
    boolean[][] visited;
    int n;
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        result = new ArrayList<>();
        this.n = maze.length;
        this.maze = maze;
        this.visited = new boolean[n][n];
        
        if(maze[0][0]==0 || maze[n-1][n-1]==0)
            return result;
            
        solve(0,0,"");
        return result;
    }
    
    private void solve(int r,int c,String res){
        if(r==n-1 && c==n-1){
            result.add(res);
            return;
        }
        
        visited[r][c] = true;
        String s = "DLRU";
        int[][] dir = new int[][]{{1,0},{0,-1},{0,1},{-1,0}};
        
        for(int i=0;i<4;i++){
            int nexti = r + dir[i][0];
            int nextj = c + dir[i][1];
            
            if(nexti>=0 && nexti<n && nextj>=0 && nextj<n && 
                !visited[nexti][nextj] && maze[nexti][nextj]==1)
                solve(nexti,nextj,res+s.charAt(i));
        }
        
        visited[r][c] = false;
    }
}