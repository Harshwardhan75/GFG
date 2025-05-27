class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        int n=nums.length;
        int[][] dp=new int[n][target+1];
        for(int[] i: dp)    Arrays.fill(i,-1);
        
        int zero=0;
        for(int i: nums)
            if(i==0)
                zero++;
        
        return (solve(nums,n-1,target,dp)*(int)Math.pow((double)2,zero));
    }
    
    int solve(int[] nums,int index,int sum,int[][] dp){
        if(sum==0)
            return 1;
            
        if(index==0){
            return nums[0]==sum?1:0;
        }
        
        if(dp[index][sum]!=-1)
            return dp[index][sum];
        
        int nottake = solve(nums,index-1,sum,dp);
        int take = 0;
        
        if(nums[index]!=0 && nums[index]<=sum)
            take = solve(nums,index-1,sum-nums[index],dp);
        
        return dp[index][sum]=take+nottake;
    }
}