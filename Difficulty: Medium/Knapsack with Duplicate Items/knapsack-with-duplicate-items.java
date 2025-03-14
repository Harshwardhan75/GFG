//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int W = Integer.parseInt(in.readLine().trim());
            String line2[] = in.readLine().trim().split(" ");
            int N = line2.length;
            int val[] = new int[N];
            for (int i = 0; i < N; i++) val[i] = Integer.parseInt(line2[i]);
            String line3[] = in.readLine().trim().split(" ");
            int wt[] = new int[N];
            for (int i = 0; i < N; i++) wt[i] = Integer.parseInt(line3[i]);

            Solution ob = new Solution();
            System.out.println(ob.knapSack(val, wt, W));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int knapSack(int val[], int wt[], int capacity) {
        // code here
        int n=val.length;
        int[][] dp=new int[n][capacity+1];
        for(int[] i: dp)    Arrays.fill(i,-1);
        
        return find(val,wt,n-1,capacity,dp);
    }
    
    static int find(int[] val,int[] wt,int index,int W,int[][] dp){
        if(index==0){
            return (W/wt[0])*val[0];
        }
    
        // if(index==-1)   return 0;
        
        if(dp[index][W]!=-1)
            return dp[index][W];
        
        int notpick = find(val,wt,index-1,W,dp);
        int pick =0;
        if(wt[index]<=W)
            pick = val[index]+find(val,wt,index,W-wt[index],dp);
        
        return dp[index][W]=Math.max(pick,notpick);
    }
}