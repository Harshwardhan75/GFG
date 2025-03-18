//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution ob = new Solution();

            if (ob.equalPartition(arr))
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static boolean equalPartition(int arr[]) {
        // code here
        int sum = Arrays.stream(arr).sum();
        
        if(sum%2==1)    return false;
        
        return isSubsetSum(arr,sum/2);
    }
    
    static boolean isSubsetSum(int[] arr,int sum){
        int n=arr.length;
        int[][] dp=new int[n][sum+1];
        
        for(int[] i: dp)    Arrays.fill(i,-1);
        
        return solve(arr,n-1,sum,dp)==1;
    }
    
    static int solve(int[] arr,int index,int sum,int[][] dp){
        if(index==0)
            return arr[0]==sum?1:0;
        
        if(dp[index][sum]!=-1)
            return dp[index][sum];
        
        int notpick = solve(arr,index-1,sum,dp);
        int pick = 0;
        if(arr[index]<=sum)
            pick = solve(arr,index-1,sum-arr[index],dp);
        
        return dp[index][sum]=pick|notpick;
    }
}