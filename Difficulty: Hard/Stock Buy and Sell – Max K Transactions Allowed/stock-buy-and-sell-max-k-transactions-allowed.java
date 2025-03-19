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
    //No
    static int f(int ind, int buy, int arr[], int k, int dp[][][]){
        if(k<0)return 0;
        if(ind==arr.length)return 0;
        
        if(dp[ind][buy][k]!=-1)return dp[ind][buy][k];
        
        int profit=0;
        if(buy==1){
            profit=Math.max(-arr[ind]+f(ind+1, 0,arr, k-1,dp), f(ind+1, 1, arr, k,dp));
        }else {
            profit=Math.max(arr[ind]+f(ind+1, 1,arr, k,dp), f(ind+1, 0, arr, k,dp));
        }
        
        return dp[ind][buy][k]=profit;
    }
    
    
    
    static int maxProfit(int arr[], int k) {
        int dp[][][]=new int[arr.length][2][k+1];
        for(int a[][]: dp){
            for(int b[]: a){
                Arrays.fill(b,-1);
            }
        }
        return f(0, 1, arr, k,dp);
        
    }
}