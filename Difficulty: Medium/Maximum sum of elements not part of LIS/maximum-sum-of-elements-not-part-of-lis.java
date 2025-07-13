class Solution {
    public int nonLisMaxSum(int[] arr) {
        // code here
        int suma = Arrays.stream(arr).sum();
        int n=arr.length;
        int[] dp = new int[n];
        int[] sum = new int[n];
        Arrays.fill(dp, 1);
        System.arraycopy(arr, 0, sum, 0, n);
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        sum[i] = sum[j] + arr[i];
                    } else if (dp[j] + 1 == dp[i]) {
                        sum[i] = Math.min(sum[i], sum[j] + arr[i]);
                    }
                }
            }
        }
        
        int maxLen = 0;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                minSum = sum[i];
            } else if (dp[i] == maxLen) {
                minSum = Math.min(minSum, sum[i]);
            }
        }

        
        return suma - minSum;
    }
    
    int solve(int[] arr,int index,int prev){
        if(index==arr.length-1)
            return prev == -1 || arr[index]>arr[prev] ? arr[index] : 1_000_000_00;
        
        int nottake = solve(arr,index+1,prev);
        
        int take = 1_00_00_00_00;
        if(prev == -1 || arr[index]>arr[prev])
            take = arr[index] + solve(arr,index+1,index);
        
        return Math.min(take,nottake);
    }
    

}