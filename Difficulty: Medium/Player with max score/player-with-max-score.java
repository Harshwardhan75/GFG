class Solution {

    static Boolean is1winner(int N, int arr[]) {
        // code here
        int[][] dp=new int[N][N];
        for(int[] i: dp)    Arrays.fill(i,-1);
        
        return solve(arr,0,N-1,1,dp)>=0;
    }
    
    static int solve(int[] arr,int start,int end,int turn,int[][] dp){
        if(start>end)
            return 0;
        
        if(dp[start][end]!=-1)
            return dp[start][end];
        
        if(turn==1){
            int s=arr[start]+solve(arr,start+1,end,2,dp);
            int e=arr[end]+solve(arr,start,end-1,2,dp);
            
            return dp[start][end] = Math.max(s,e);
        }
        else{
            int s=-arr[start]+solve(arr,start+1,end,1,dp);
            int e=-arr[end]+solve(arr,start,end-1,1,dp);
            
            return dp[start][end] = Math.min(s,e);
        }
    }
}