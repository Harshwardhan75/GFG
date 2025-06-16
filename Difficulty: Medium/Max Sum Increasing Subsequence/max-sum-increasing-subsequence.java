// User function Template for Java

class Solution {
    public int maxSumIS(int arr[]) {
        // code here.
        int n=arr.length;
        int[][] dp=new int[n][n+1];
        for(int[] i: dp)
            Arrays.fill(i,-1);
            
        return solve(arr,0,-1,dp);
    }
    
    int solve(int[] arr,int index,int prev,int[][] dp){
        if(index>=arr.length)
            return 0;
        
        if(dp[index][prev+1]!=-1)
            return dp[index][prev+1];
        
        int nottake = solve(arr,index+1,prev,dp);
        int take = 0;
        
        if(prev==-1 || arr[prev]<arr[index])
            take = arr[index]+solve(arr,index+1,index,dp);
        
        return dp[index][prev+1] = Math.max(take,nottake);
    }
}