class Solution {
    Integer[][] dp;
    public int minCutCost(int n, int[] cuts) {
        // code here
        Arrays.sort(cuts);
        int[] arr = new int[cuts.length+2];
        arr[0]=0;arr[arr.length-1]=n;
        
        for(int i=1;i<arr.length-1;i++)
            arr[i] = cuts[i-1];
        
        dp = new Integer[arr.length][arr.length];
        return solve(arr,0,arr.length-1);
    }
    
    int solve(int[] cuts,int i,int j){
        if(j-i==1)
            return 0;
        
        if(dp[i][j]!=null)
            return dp[i][j];
        
        int min = 1_000_000_00;
        
        for(int k=i+1;k<j;k++){
            min = Math.min(min,
                cuts[j]-cuts[i] + solve(cuts,i,k) + solve(cuts,k,j)
            );
        }
        
        return dp[i][j] = min;
    }
}
