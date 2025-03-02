//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize BufferedReader for efficient input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the number of test cases
        String str = br.readLine();
        int t = Integer.parseInt(str.trim());

        // Process each test case
        while (t-- > 0) {
            // Read the next line containing the array elements
            str = br.readLine();
            String[] tokens = str.trim().split("\\s+");

            // Convert the input strings to integers and store in an array
            ArrayList<Integer> list = new ArrayList<>();
            for (String token : tokens) {
                if (!token.isEmpty()) { // Ensure that the token is not empty
                    list.add(Integer.parseInt(token));
                }
            }

            // Convert ArrayList to int[] for processing
            int[] arr = list.stream().mapToInt(Integer::intValue).toArray();

            // Create an instance of Solution and compute the minimum energy
            Solution ob = new Solution();
            int result = ob.minCost(arr);

            // Output the result followed by a tilde as per the original C++ code
            System.out.println(result);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends

// User function Template for Java
class Solution {
    int minCost(int[] height) {
        // code here
        int[] dp=new int[height.length+1];
        Arrays.fill(dp,-1);
        return find(height,height.length-1,dp);
    }
    static int find(int[] arr,int index,int[] dp){
        if(index==0)
            return 0;
        
        if(dp[index]!=-1)   return dp[index];
        
        int left = find(arr,index-1,dp)+Math.abs(arr[index]-arr[index-1]);
        int right = index>1?find(arr,index-2,dp)+Math.abs(arr[index]-arr[index-2]):Integer.MAX_VALUE;

        return dp[index]=Math.min(left,right);
    }
}


//{ Driver Code Starts.

// } Driver Code Ends