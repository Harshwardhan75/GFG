class Solution {
    int distinctSubseq(String s) {
        // code here
        int n = s.length();
        int MOD = 1_000_000_000+7;
        int[] dp = new int[n+1];
        dp[0]=1;
        int[] last = new int[26];
        Arrays.fill(last,-1);
        
        for(int i=1;i<=n;i++){
            dp[i] = (2*dp[i-1])%MOD;
            
            if(last[s.charAt(i-1)-'a']!=-1){
                dp[i] = (dp[i]-dp[last[s.charAt(i-1)-'a']-1]+MOD)%MOD;
            }
            
            last[s.charAt(i-1)-'a'] = i;
        }
        
        return dp[n];
    }
}