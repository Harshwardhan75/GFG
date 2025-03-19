//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int t = 0; t < tc; t++) {
            String[] input = br.readLine().split(" ");
            int arr[] = new int[input.length];

            for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(input[i]);

            // Read the integer k
            int k = Integer.parseInt(br.readLine());

            // Call the solution function
            Solution obj = new Solution();
            System.out.println(obj.maxProfit(arr, k));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static int max = 0;
    static int maxProfit(int prices[], int k) {
        int n=prices.length;
        int[][][] dp=new int[n][k][2];
        max= k;
        for(int[][] i: dp)  for(int[] j: i) Arrays.fill(j,-1);

        return solve(prices,0,1,0,dp);
    }
    
    static int solve(int[] prices,int ind,int buy,int day,int[][][] dp){
        if(ind==prices.length)
            return 0;
        
        if(day>=max)  return 0;
        
        if(dp[ind][day][buy]!=-1)    return dp[ind][day][buy];

        int profit = 0;
        if(buy==1){
            int take = -prices[ind]+solve(prices,ind+1,0,day,dp);
            int nottake = solve(prices,ind+1,1,day,dp);
            profit=Math.max(take,nottake);
        }
        else{
            int take = prices[ind]+solve(prices,ind+1,1,day+1,dp);
            int nottake = solve(prices,ind+1,0,day ,dp);
            profit=Math.max(take,nottake);
        }

        return dp[ind][day][buy]=profit;
    }
    
}