//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String digits = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.countWays(digits);
            out.println(ans);

            out.println("~");
        }
        out.close();
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public int countWays(String digits) {
        // code here
        int n=digits.length();
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(digits,0,dp);
    }
    
    int solve(String digit,int index,int[] dp){
        if(index==digit.length())
            return 1;
        
        if(dp[index]!=-1)
            return dp[index];
        
        int count = 0;
        
        for(int i=index+1;i<=digit.length();i++){
            String s=digit.substring(index,i);
            if(s.length()<3)
            if(Integer.parseInt(s)>=1 && Integer.parseInt(s)<=26){
                if(s.charAt(0)!='0'){
                    count+=solve(digit,i,dp);
                }
            }
        }
        
        return dp[index]=count;
    }
}