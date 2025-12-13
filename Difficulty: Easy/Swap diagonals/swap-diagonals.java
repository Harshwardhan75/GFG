class Solution {
    public void swapDiagonal(int[][] mat) {
        // code here
        int n = mat.length;

        for(int i=0;i<n;i++){
            int start = i;
            int end = n-1-i;
            
            int temp = mat[i][start];
            mat[i][start] = mat[i][end];
            mat[i][end] = temp;
        }
    }
}