// User function Template for Java

class Solution {
    // Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String s1, String s2) {
        // Your code here
        int n=s1.length();int m=s2.length();
        int[][] dp=new int[n+1][m+1];
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                int a=i-1;
                int b=j-1;
                
                if(s1.charAt(a)==s2.charAt(b)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        StringBuilder result=new StringBuilder();
        int i=n,j=m;
        
        while(i>0 && j>0){
            int a=i-1;
            int b=j-1;
            
            if(s1.charAt(a)==s2.charAt(b)){
                result.append(s1.charAt(a));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                result.append(s1.charAt(a));
                i--;
            }
            else{
                result.append(s2.charAt(b));
                j--;
            }
        }
        
        while(i>0){
            result.append(s1.charAt(i-1));
            i--;
        }
        
        while(j>0){
            result.append(s2.charAt(j-1));
            j--;
        }
        
        return result.length();
    }
}