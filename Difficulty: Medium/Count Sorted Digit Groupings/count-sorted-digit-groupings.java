class Solution {
    public int validGroups(String s) {
        // code here
        int[][] dp = new int[s.length()][901];
        for(int[] i: dp)
            Arrays.fill(i,-1);
            
        return solve(s,0,0,dp);
    }
    
    int solve(String s,int index,int sum,int[][] dp){
        if(index>=s.length())
            return 1;
        
        if(dp[index][sum]!=-1)
            return dp[index][sum];
        
        int count = 0;
        int sum2 = 0;
        for(int i=index;i<s.length();i++){
            sum2+=s.charAt(i)-'0';
            
            if(sum<=sum2)
                count += solve(s,i+1,sum2,dp);
        }
        
        return dp[index][sum] = count;
    }
}