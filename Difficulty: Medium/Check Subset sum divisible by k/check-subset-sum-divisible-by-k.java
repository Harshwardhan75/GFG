class Solution {
    public boolean divisibleByK(int[] arr, int k) {
        // Mod will keep the sum [0, k-1]
        boolean[] dp = new boolean[k];
        
        for(int val: arr) {
            int rem = val % k;
            
            // Early stop
            if(rem == 0) {
                return true;
            }
            
            // In next marking all, curr and its sums as true
            boolean[] next = dp.clone();
            next[rem] = true;
            
            // Adding to others
            for(int i = 0; i < k; i++) {
                if(dp[i]) {
                    int rem2 = (rem + i) % k;
                    
                    // Early stop
                    if(rem2 == 0) {
                        return true;
                    }
                    
                    next[rem2] = true;
                }
            }
            
            // Updation
            dp = next;
        }
        
        return dp[0];
    }
}