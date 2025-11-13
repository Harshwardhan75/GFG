class Solution {
    
    int n1,n2,m;
    Boolean[][] dp;
    public boolean isInterleave(String s1, String s2, String s3) {
        // code here
        int i=0,j=0,k=0;
        
        n1=s1.length();
        n2=s2.length();
        m = s3.length();
        
        if(n1+n2!=s3.length())
            return false;
        dp = new Boolean[n1+1][n2+1];
        
        return solve(s1,0,s2,0,s3);
    }
    
    
    // Why k is not used for memoization???
    // Because K is a derived value and can be derieved as a sum of i,j so 
    // no need to memoize k as it will just explode your states by 600 times
    boolean solve(String s1,int i,String s2,int j,String s3){
        int k = i + j;
        
        if(dp[i][j]!=null)   return dp[i][j];
        
        if(i==n1){
            while(j<n2 && s2.charAt(j)==s3.charAt(k)){
                j++;
                k++;
            }
            
            return dp[i][j] = j==n2;
        }
        
        if(j==n2){
            while(i<n1 && s1.charAt(i)==s3.charAt(k)){
                i++;
                k++;
            }
            
            return dp[i][j] = i==n1;
        }
        
        
        boolean status = false;
        
        if(s1.charAt(i)==s3.charAt(k)){
            status |= solve(s1,i+1,s2,j,s3);
        }
        
        if(status)
            return dp[i][j] = status;
        
        if(s2.charAt(j)==s3.charAt(k)){
            status |= solve(s1,i,s2,j+1,s3);
        }
        
        return dp[i][j] = status;
        
    }
}