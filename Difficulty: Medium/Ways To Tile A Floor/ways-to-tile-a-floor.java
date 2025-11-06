class Solution {
    public int numberOfWays(int n) {
        // code here
        int prev2 = 1, prev1 = 2;
        
        if(n<=2)
            return n;
        
        for(int i=3;i<=n;i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        
        return prev1;
    }
};