// User function Template for Java

class Solution {
    long numberOfPath(int n, int k, int[][] arr) {
        // code here
        int[][] dp=new int[n][n];
        return solve(arr,n-1,n-1,k);
    }
    
    long solve(int[][] arr,int row,int col,int k){
        if(row==0 && col==0)
            return arr[row][col]==k?1:0;
        
        if(row<0 || col<0)
            return 0;
        
        long up=arr[row][col]<=k?solve(arr,row-1,col,k-arr[row][col]):0;
        long down=arr[row][col]<=k?solve(arr,row,col-1,k-arr[row][col]):0;
        
        return up+down;
    }
}