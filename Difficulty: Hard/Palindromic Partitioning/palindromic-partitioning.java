// User function Template for Java

class Solution {
    static int palPartition(String s) {
        // code here
        char[] c=s.toCharArray();
        int[] dp=new int[c.length];
        Arrays.fill(dp,-1);
        return solve(c,0,dp)-1;
    }
    
    static int solve(char[] c,int index,int[] dp){
        if(index>=c.length)
            return 0;
        
        if(dp[index]!=-1)
            return dp[index];
        
        int count = Integer.MAX_VALUE;
        for(int i=index;i<c.length;i++){
            if(isPalindrome(c,index,i))
                count=Math.min(count,1+solve(c,i+1,dp));
        }
        
        return dp[index] = count;
    }
    
    static boolean isPalindrome(char[] c,int start,int end){
        while(start<=end && c[start]==c[end]){
            start++;
            end--;
        }
        
        return start>=end;
    }
}