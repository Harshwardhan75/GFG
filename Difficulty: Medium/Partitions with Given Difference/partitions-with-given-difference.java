class Solution {
    int[] arr;
    int[][] dp;
    public int countPartitions(int[] arr, int diff) {
        // code here
        int sum = Arrays.stream(arr).sum();
        
        if(sum-diff<0 || (sum-diff)%2==1)
            return 0;
            
        this.arr = arr;
        this.dp = new int[arr.length][((sum-diff)/2) + 1];
        for(int[] i: dp)
            Arrays.fill(i,-1);
        return solve(0,(sum-diff)/2);
    }
    
    int solve(int index,int diff){
        if(index>=arr.length)
            return diff==0?1:0;
        
        if(dp[index][diff]!=-1)
            return dp[index][diff];
        
        return dp[index][diff] = solve(index+1,diff) + 
            ((diff-arr[index])>=0?solve(index+1,diff-arr[index]):0);
    }
}
