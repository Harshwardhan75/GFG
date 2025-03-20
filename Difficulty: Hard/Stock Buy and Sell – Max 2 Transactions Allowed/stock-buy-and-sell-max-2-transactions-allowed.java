//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().maxProfit(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public static int maxProfit(int[] prices) {
        // code here
        int n=prices.length;
        int[][] dp=new int[n][4];
        for(int[] i: dp)    Arrays.fill(i,-1);
        
        return solve(prices,0,0,dp);
    }
    
    static int solve(int[] price,int ind,int transaction,int[][] dp){
        if(transaction==4)
            return 0;
        
        if(ind==price.length)
            return 0;
        
        if(dp[ind][transaction]!=-1)
            return dp[ind][transaction];
        
        if(transaction%2==0){
            int take = -price[ind]+solve(price,ind+1,transaction+1,dp);
            int nottake = solve(price,ind+1,transaction,dp);
            
            return dp[ind][transaction]=Math.max(take,nottake);
        }
        else{
            int take = price[ind]+solve(price,ind+1,transaction+1,dp);
            int nottake = solve(price,ind+1,transaction,dp);
            
            return dp[ind][transaction]=Math.max(take,nottake);
        }
    }
}
