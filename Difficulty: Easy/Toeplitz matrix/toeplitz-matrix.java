class Solution {
    public boolean isToeplitz(int[][] mat) {
        // code here
        int n = mat.length;   
        int m = mat[0].length;   
        
        for(int i = 0;i<n;i++){
            int row = i;
            int col = 0;
            int value = mat[row][col];
            
            while(row<n && col<m){
                if(mat[row][col]!=value)
                    return false;
                row++;
                col++;
            }
        }
        
        for(int j=1;j<m;j++){
            int row = 0;
            int col = j;
            int value = mat[row][col];
            
            while(row<n && col<m){
                if(mat[row][col]!=value)
                    return false;
                row++;
                col++;
            }
        }
        
        return true;
    }
}