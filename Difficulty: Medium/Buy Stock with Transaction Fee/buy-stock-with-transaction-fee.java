class Solution {
    int[] arr;
    int[][] dp;
    public int maxProfit(int arr[], int k) {
        // Code here
        this.arr = arr;
        dp = new int[arr.length][2];
        for(int[] i: dp)
            Arrays.fill(i,-1);
            
        return solve(0,k,0);
    }
    
    int solve(int index,int k,int buy){
        if(index>=arr.length)
            return 0;
        
        if(dp[index][buy]!=-1)
            return dp[index][buy];
        
        if(buy==0){
            int t = -arr[index] + solve(index+1,k,1-buy);
            int nt = solve(index+1,k,buy);
            
            return dp[index][buy] = Math.max(t,nt);
        }
        else{
            int t = arr[index] - k + solve(index+1,k,1-buy);
            int nt = solve(index+1,k,buy);
            
            return dp[index][buy] = Math.max(t,nt);
        }
    }
}