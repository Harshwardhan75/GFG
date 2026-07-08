class Solution {
    int[][] visited;
    int[][] mat;
    int n,m;
    
    public int countCoordinates(int[][] mat) {
        // code here
        this.n = mat.length;
        this.m = mat[0].length;
        this.visited = new int[n][m];
        this.mat = mat;
        
        for(int i=0;i<n;i++){
            DFS(i,0,1);
            DFS(i,m-1,2);
        }
        
        for(int j=0;j<m;j++){
            DFS(0,j,1);
            DFS(n-1,j,2);
        }
        
        int count = 0;
        
        for(int[] i: visited){
            for(int j: i)
                if(j==3)
                    count++;
        }
        
        return count;
    }
    
    void DFS(int r,int c,int mask){
        visited[r][c] |= mask;
        
        for(int[] d: new int[][]{{-1,0},{0,-1},{1,0},{0,1}}){
            int nexti = d[0] + r;
            int nextj = d[1] + c;
            
            if(nexti>=0 && nexti<n && nextj>=0 && nextj<m && 
                (visited[nexti][nextj]&mask)==0){
                
                if(mat[nexti][nextj]>=mat[r][c])
                    DFS(nexti,nextj,mask);
                
            }
        }
    }
}