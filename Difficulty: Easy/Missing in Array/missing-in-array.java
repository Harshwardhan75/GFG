//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().missingNum(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int missingNum(int arr[]) {
        // code here
        // int n=arr.length;
        // int xor = n+1;
        // for(int i=0;i<n;i++){
        //     xor^=arr[i]^(i+1);
        // }
        // return xor;
        
        int n=arr.length+1;
        
        return (int)((long)n*(n+1)/2)-Arrays.stream(arr).sum();
    }
}