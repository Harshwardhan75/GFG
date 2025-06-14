class Solution {
    int[][] dp;
    public boolean isInterLeave(String s1, String s2, String s3) {
        // code here
        
        if(s1.length()+s2.length()!=s3.length())
            return false;
        int n=s1.length();
        int m=s2.length();
        int o=s3.length();
        // dp=new int[n+1][m+1][o+1];
        dp=new int[n+1][m+1];
        
        for(int[] i: dp)
            // for(int[] j: i)
                Arrays.fill(i,-1);
                
        return solve(s1.toCharArray(),n,
                        s2.toCharArray(),m,
                            s3.toCharArray(),o
                )==1;
    }
    
    int solve(char[] s1,int i,
                            char[] s2,int j,
                                char[] s3,int k){
        
        if(i==0 && j==0 && k==0)
            return 1;
        
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        int status = 0;
        
        if(i-1>=0 && s1[i-1]==s3[k-1]){
            status|=solve(s1,i-1,s2,j,s3,k-1);
        }
        
        if(j-1>=0 && s2[j-1]==s3[k-1]){
            status|=solve(s1,i,s2,j-1,s3,k-1);
        }
    
    
        return dp[i][j] = status;
    }
}