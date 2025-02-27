//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);

            int[] ans = new Solution().printKClosest(arr, n, k, x);
            for (int xx : ans) {
                System.out.print(xx + " ");
            }
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int[] printKClosest(int[] arr, int n, int k, int x) {
        // code here
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            int v=b[0]-a[0];
            
            if(v==0){
                v=b[1]-a[1];
            }
            return v;
        });
        
        for(int i: arr){
            if(i==x)    continue;
            
            pq.offer(new int[]{Math.abs(x-i),i});
            if(pq.size()>k) 
                pq.poll();
        }
        
        int[] result=new int[pq.size()];
        
        for(int i=result.length-1;i>=0;i--)
            result[i]=pq.poll()[1];
        
        return result;
    }
}
