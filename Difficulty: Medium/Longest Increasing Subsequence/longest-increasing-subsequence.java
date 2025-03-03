//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine())
                               .trim()
                               .split(" "); // Read the input for the current test case
            int arr[] = new int[str.length];
            // Convert input string into an integer array
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            // Call the solution method and print the result
            System.out.println(new Solution().lis(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static int lis(int arr[]) {
        // code here
        int n=arr.length;
        int[] dp=new int[n];
        dp[n-1]=1;
        
        for(int i=n-2;i>=0;i--){
            dp[i]=1;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i])
                    dp[i]=Math.max(dp[i],dp[j]+1);
            }
        }
        
        return Arrays.stream(dp).max().orElseThrow();
    }
}