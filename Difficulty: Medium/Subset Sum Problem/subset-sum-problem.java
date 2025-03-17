//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String input_line[] = read.readLine().trim().split("\\s+");
            int N = input_line.length;
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if (ob.isSubsetSum(arr, sum))
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n=arr.length;
        int[][] dp=new int[n][sum+1];
        for(int[] i: dp)    Arrays.fill(i,-1);
        
        return solve(arr,n-1,sum,dp)==1;
    }
    
    static int solve(int[] arr,int index,int sum,int[][] dp){
        if(sum==0)  return 1;
        
        if(index==0)
            return sum==arr[0]?1:0;
        
        
        
        if(dp[index][sum]!=-1)
            return dp[index][sum];
        
        int notpick = solve(arr,index-1,sum,dp);
        int pick = 0;
        
        if(sum>=arr[index])
            pick = solve(arr,index-1,sum-arr[index],dp);
        
        return dp[index][sum]=pick | notpick;
    }
}