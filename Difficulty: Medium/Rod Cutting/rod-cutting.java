class Solution {
    public int cutRod(int[] price) {
        // code here
        int n=price.length;
        int[][] dp=new int[n][n+1];
        for(int[] i: dp)    Arrays.fill(i,-1);
        
        return solve(price,n-1,n,dp);
    }
    
    int solve(int[] prices,int index,int target,int[][] dp){
        if(target==0)
            return 0;
        
        if(index==0)
            return prices[0]*target;
        
        if(dp[index][target]!=-1)
            return dp[index][target];
        
        int nottake = solve(prices,index-1,target,dp);
        int take = 0;
        int rodLength=index+1;
        if(rodLength<=target)
            take=prices[index]+solve(prices,index,target-rodLength,dp);
        
        return dp[index][target] = Math.max(take,nottake);
    }
}