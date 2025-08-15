class Solution {
    int findMinInsertions(String s) {
        // code here
        int n = s.length();
        int[][] dp = new int[n+1][n+1];
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int index1=i-1;
                int index2=n-j;
                
                if(s.charAt(index1)==s.charAt(index2)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return n - dp[n][n];
    }
}