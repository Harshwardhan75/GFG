//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        Solution solution = new Solution();
        while (t-- > 0) {
            String input = reader.readLine().trim();
            String[] parts = input.split("\\s+");
            int[] arr = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();

            System.out.println(solution.findMissing(arr));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    
    int find(int[] arr,int d){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(Math.abs(arr[i]-arr[i+1])!=d)
                return i+2;
        }
        return n+1;
    }
    public int findMissing(int[] arr) {
        // code here
        // int d=Math.abs(arr[0]-arr[1]);
        
        // System.out.println(d);
        
        int n=arr.length+1;
        double t=(n)/2.0;
        double val=2*(double)arr[0];
        double val2=Math.abs(arr[0]-arr[1])*(n-1);
        val=val+val2;
        t=t*val;
        
        // System.out.println(t);
        long sum=0;
        for(int i=0;i<n-1;i++)
            sum+=arr[i];
        
        return (int)((long)t-sum);
    }
}
