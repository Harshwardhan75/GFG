//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            int[] ans = new int[n];
            ans = ob.productExceptSelf(arr);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            System.out.println("~");
            t--;
        }
    }
}

// } Driver Code Ends




// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int product=1;
        int zero=0;
        for(int i: arr){
            if(i==0)
                zero++;
            else
                product*=i;
        }
        
        int n=arr.length;
        if(zero>1)
            return new int[n];
            
        int[] result=new int[n];
        if(zero==1){
            for(int i=0;i<n;i++){
                if(arr[i]==0)
                    result[i]=product;
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(arr[i]==0)
                    result[i]=product;
                else
                    result[i]=product/arr[i];
            }
        }        
        return result;
    }
}
