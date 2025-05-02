//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findMaximum(arr);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        // code here
        int n=arr.length;
        
        if(arr[0]>arr[1])
            return arr[0];
        
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i])
                return arr[i-1];
        }
        
        return arr[n-1];
    }
}