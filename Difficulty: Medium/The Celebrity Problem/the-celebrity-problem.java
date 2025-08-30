class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        
        int i = 0, j = n-1 ;
        
        while(i<j){
            if(mat[i][j]==1)
                i++;
            else
                j--;
        }
        
        for(i=0;i<n;i++){
            if((mat[i][j]==0 && i!=j) || (j!=i && mat[j][i]==1))
                return -1;
        }
        
        return j;
    }
}