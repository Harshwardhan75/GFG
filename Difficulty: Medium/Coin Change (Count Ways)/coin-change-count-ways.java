//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String inputLine[] = read.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int sum = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.count(arr, sum));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int count(int coins[], int sum) {
        // code here.
        int n=coins.length;
        int[][] dp=new int[n][sum+1];
        
        for(int[] i: dp)    Arrays.fill(i,-1);
        
        return find(coins,n-1,sum,dp);
    }
    
    int find(int[] coin,int index,int sum,int[][] dp){
        if(index==0)
            return sum%coin[0]==0?1:0;
        
        if(dp[index][sum]!=-1)
            return dp[index][sum];
        
        int notpick = find(coin,index-1,sum,dp);
        int pick = 0;
        
        if(coin[index]<=sum)
            pick = find(coin,index,sum-coin[index],dp);
        
        return dp[index][sum]=pick + notpick;
    }
}