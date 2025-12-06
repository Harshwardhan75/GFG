
class Solution {
    int[] arr;
    int n;
    int[][][] dp;
    public int maximumAmount(int arr[]) {
        // code here
        this.arr = arr;
        this.n = arr.length;
        dp = new int[n][n][3];
        for(int[][] i: dp)  for(int[] j: i) Arrays.fill(j,-1);
        return solve(0,n-1,1);
    }
    
    int solve(int start,int end,int turn){
        if(start==end){
            return turn==1?arr[start]:0;
        }
        
        if(dp[start][end][turn]!=-1)
            return dp[start][end][turn];
        
        if(turn==1){
            int front = arr[start] + solve(start+1,end,2);
            int back = arr[end] + solve(start,end-1,2);
            
            return dp[start][end][turn] = Math.max(front,back);
        }
        else{
            int front = solve(start+1,end,1);
            int back = solve(start,end-1,1);
            
            return dp[start][end][turn] = Math.min(front,back);   
        }
    }
}
