/*You are required to complete this method */
class Solution {
    Integer[][][] dp;
    public boolean isKPartitionPossible(int[] arr, int k) {
        // Your code here
        int sum = Arrays.stream(arr).sum();
        if(sum%k!=0)
            return false;
        dp = new Integer[1<<arr.length][sum+1][k+1];
        
        return solve(arr,0,sum/k,0,k)==1;
    }
    
    int solve(int[] arr,int visited,int curr,int total,int cap){
        if(cap == 0)
            return 1;
        
        int take = 0;
        
        if(dp[visited][curr][cap]!=null)
            return dp[visited][curr][cap];
        
        if(curr==total)
            return solve(arr,visited,curr,0,cap-1);
        
        for(int i=0;i<arr.length;i++){
            if((visited & (1<<i))==0){
                if(arr[i]+total<=curr)
                    take |= solve(arr,visited | 1<<i,curr,total+arr[i],cap);
            }
        }
        
        return dp[visited][curr][cap] = take;
    }
}