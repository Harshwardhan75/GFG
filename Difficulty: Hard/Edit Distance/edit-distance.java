//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String s2 = br.readLine();

            Solution ob = new Solution();
            int ans = ob.editDistance(s1, s2);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    
    int solve(String a,String b,int i,int j,int[][] dp){
        if(i==a.length())   return b.length()-j;
        if(j==b.length())   return a.length()-i;
        
        if(dp[i][j]!=-1)    return dp[i][j];
        
        if(a.charAt(i)==b.charAt(j))
            return dp[i][j]=solve(a,b,i+1,j+1,dp);
        else{
            int in=1+solve(a,b,i,j+1,dp);
            int d=1+solve(a,b,i+1,j,dp);
            int u=1+solve(a,b,i+1,j+1,dp);
            
            return dp[i][j]=Math.min(in,Math.min(u,d));
        }
    }
    
    public int editDistance(String s1, String s2) {
        // Code here
        int[][] dp=new int[s1.length()][s2.length()];
        for(int[] i: dp)    Arrays.fill(i,-1);
        
        return solve(s1,s2,0,0,dp);
    }
}