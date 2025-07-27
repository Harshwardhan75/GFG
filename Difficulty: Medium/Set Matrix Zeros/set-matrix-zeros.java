class Solution {
    public void setMatrixZeroes(int[][] mat) {
        // code here
        int col0=0;
        int n=mat.length;
        int m = mat[0].length;
        int[] row = new int[501];
        int[] col = new int[501];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    row[i]=1;   
                    col[j]=1;   
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1)
                    mat[i][j]=0;
            }
        }
    }
}