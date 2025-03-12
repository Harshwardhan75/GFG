//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {
            // Read capacity
            int capacity = Integer.parseInt(br.readLine());

            // Read values
            String[] valInput = br.readLine().split(" ");
            int[] val = new int[valInput.length];
            for (int i = 0; i < valInput.length; i++) {
                val[i] = Integer.parseInt(valInput[i]);
            }

            // Read weights
            String[] wtInput = br.readLine().split(" ");
            int[] wt = new int[wtInput.length];
            for (int i = 0; i < wtInput.length; i++) {
                wt[i] = Integer.parseInt(wtInput[i]);
            }

            // Call the knapSack function and print the result
            System.out.println(Solution.knapSack(capacity, val, wt));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends

class Solution {
    // Function to return max value that can be put in knapsack of capacity.
    static int knapSack(int capacity, int val[], int wt[]) {
        // code here
        int n=val.length;
        int[][] dp=new int[n][capacity+1];
        
        for(int[] i: dp)    Arrays.fill(i,-1);
        
        return solve(val,wt,dp,n-1,capacity);
    }
    
    static int solve(int[] val,int[] wt,int[][] dp,int index,int W){
        if(index==0){
            if(wt[0]<=W)
                return val[0];
            return 0;
        }
        
        if(dp[index][W]!=-1) 
            return dp[index][W];
        
        int notsteal=solve(val,wt,dp,index-1,W);
        int steal = Integer.MIN_VALUE;
        if(wt[index]<=W)
            steal=val[index]+solve(val,wt,dp,index-1,W-wt[index]);
        
        return dp[index][W]=Math.max(steal,notsteal);
    }
}
