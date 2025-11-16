class Solution {
    public int LCIS(int[] a, int[] b) {
        // code here
        int n = a.length;
        int m = b.length;
        
        int[] dp = new int[m];
        
        for(int i=0;i<n;i++){
            int max = 0;
            for(int j=0;j<m;j++){
                if(b[j]==a[i]){
                    dp[j] = Math.max(dp[j], 1 + max);
                }
                
                if(a[i]>b[j])
                    max = Math.max(max,dp[j]);
            }
        }
        
        return Arrays.stream(dp).max().orElse(0);
    }
    
}