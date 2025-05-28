class Solution {
    public boolean ValidCorner(int mat[][]) {
        // Code here
        int n=mat.length;
        int m=mat[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    if(check(mat,i,j))
                        return true;
                }
            }
        }
        return false;
    }
    
    boolean check(int[][] mat,int row,int col){
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                if(mat[i][j]==1 && mat[row][j]==1 && mat[i][col]==1)
                    return true;
            }
        }
        return false;
    }
}