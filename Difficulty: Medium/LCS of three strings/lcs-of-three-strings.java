class Solution {
    int[][][] dp;
    int lcsOf3(String s1, String s2, String s3) {
        // code here
        int n1=s1.length();
        int n2=s2.length();
        int n3=s3.length();
        dp=new int[n1][n2][n3];
        
        for(int[][] i: dp)
            for(int[] j: i)
                Arrays.fill(j,-1);
                
        
        return solve(s1,n1-1,s2,n2-1,s3,n3-1);
    }
    
    int solve(String s1,int i,String s2,int j,String s3,int k){
        if(i<0 || j<0 || k<0)
            return 0;
        
        if(dp[i][j][k]!=-1)
            return dp[i][j][k];
        
        if(s1.charAt(i)==s2.charAt(j) && s2.charAt(j)==s3.charAt(k))
            return dp[i][j][k]= 1+solve(s1,i-1,s2,j-1,s3,k-1);
        else
        {
            return dp[i][j][k]=Math.max(
                solve(s1,i-1,s2,j,s3,k),
                Math.max(
                    solve(s1,i,s2,j-1,s3,k),
                    solve(s1,i,s2,j,s3,k-1)
                    )
                );
        }
    }
}