class Solution {
    public int largestArea(int n, int m, int[][] arr) {
        // code here
        int[][] matrix = new int[n][m];
        for(int[] a: arr){
            // matrix[a[0]-1][a[1]-1] = 1;
            int r = a[0]-1;
            int c = a[1]-1;
            
            for(int j=0;j<m;j++)    matrix[r][j] = 1;
            for(int i=0;i<n;i++)    matrix[i][c] = 1;
        }
        
        int max = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    max = Math.max(max,DFS(matrix,i,j));
                }
            }
        }
        
        return max;
    }
    
    int DFS(int[][] matrix,int r,int c){
        int n = matrix.length;
        int m = matrix[0].length;
        
        matrix[r][c] = 2;
        int count = 1;
        
        for(int[] d: new int[][]{{-1,0},{0,-1},{1,0},{0,1}}){
            int nexti = r + d[0];
            int nextj = c + d[1];
            
            if(nexti>=0 && nexti<n && nextj>=0 && nextj<m && matrix[nexti][nextj]==0){
                count = count + DFS(matrix,nexti,nextj);
            }
        }
        
        return count;
    }
}