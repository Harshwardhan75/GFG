class Solution {
    Boolean[][] dp;
    public boolean wildCard(String txt, String pat) {
        // code here
        dp = new Boolean[txt.length()][pat.length()];
        return solve(txt,pat,txt.length()-1,pat.length()-1);
    }
    
    boolean solve(String t,String p,int i,int j){
        if(i<0 && j<0)
            return true;
        
        if(i<0 && j>=0){
            while(j>=0 && p.charAt(j)=='*')
                j--;
                
            return j<0;
        }
        
        if(j<0 && i>=0)
            return false;
        
        if(dp[i][j]!=null)
            return dp[i][j];
        
        if(p.charAt(j)=='?' || (t.charAt(i) == p.charAt(j)))
            return dp[i][j] = solve(t,p,i-1,j-1);
        
        
        if(p.charAt(j)=='*')
            return dp[i][j] = solve(t,p,i-1,j) | solve(t,p,i,j-1);
        
        return dp[i][j] = false;
    }
}