//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

class GFG {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.countWays(s));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int countWays(String s) {
        // code here
        int n=s.length();
        int[][][] dp=new int[n][n][2];
        for(int[][] i: dp)  for(int[] j: i) Arrays.fill(j,-1);
        return solve(s.toCharArray(),0,n-1,1,dp);
    }
    
    static int solve(char[] s,int i,int j,int isTrue,int[][][] dp){
        if(i>j)
            return 0;
        
        if(i==j){
            if(isTrue==1)
                return s[i]=='T'?1:0;
            else
                return s[i]=='F'?1:0;
        }
        
        if(dp[i][j][isTrue]!=-1)
            return dp[i][j][isTrue];
        
        int ways = 0;
        
        for(int ind=i+1;ind<=j-1;ind+=2){
            int lt=solve(s,i,ind-1,1,dp);
            int lf=solve(s,i,ind-1,0,dp);
            int rt=solve(s,ind+1,j,1,dp);
            int rf=solve(s,ind+1,j,0,dp);
                
            if(s[ind]=='&'){
                if(isTrue==1){
                    ways+=lt*rt;
                }
                else{
                    ways+=(lt*rf)+(lf*rt)+(lf*rf);
                }
            }
            else if(s[ind]=='|'){
                if(isTrue==1){
                    ways+=(lt*rt)+(lt*rf)+(lf*rt);
                }
                else{
                    ways+=(lf*rf);
                }
            }
            else{
                if(isTrue==1){
                    ways+=(lt*rf)+(lf*rt);
                }
                else{
                    ways+=(lt*rt)+(lf*rf);
                }
            }
        }
        return dp[i][j][isTrue] = ways;
    }
    
    static int add(int a,int b){
        return a+b;
    }
}