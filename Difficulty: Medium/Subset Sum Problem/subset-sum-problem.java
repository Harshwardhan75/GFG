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


// User function Template for Java

class Solution {

    static Boolean isSubsetSum(int arr[], int target) {
        // code here
        int n=arr.length;
        int[][] dp=new int[n][target+1];
        for(int[] i: dp)    Arrays.fill(i,-1);
        
        return find(arr,n-1,target,dp)==1;
    }
    
    static int find(int[] arr,int index,int target,int[][] dp){
        if(target==0)   return 1;
        if(target<0)    return 0;
        if(index<0) return 0;
        
        if(dp[index][target]!=-1)   return dp[index][target];
        
        int pick = find(arr,index-1,target-arr[index],dp);
        int notpick = find(arr,index-1,target,dp);
        
        return dp[index][target]=pick|notpick;
    }
}