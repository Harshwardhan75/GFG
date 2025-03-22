//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int n = s.length;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int[] arr = IntArray.input(br);

            Solution obj = new Solution();
            int res = obj.maxValue(arr);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    int maxValue(int[] arr) {
        // code here
        int n=arr.length;
        int[] arr1=new int[n-1];
        int[] arr2=new int[n-1];
        
        for(int i=1;i<n;i++){
            arr1[i-1]=arr[i-1];
            arr2[i-1]=arr[i];
        }
        
        return Math.max(findMaxSum(arr1),findMaxSum(arr2));
    }
    
    public int findMaxSum(int arr[]) {
        // code here
        int n=arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(arr,n-1,dp);
    }
    
    int solve(int[] arr,int ind,int[] dp){
        if(ind<0)
            return 0;
        if(ind==0)
            return arr[0];
            
        if(dp[ind]!=-1)
            return dp[ind];
        
        int nottake = solve(arr,ind-1,dp);
        int take = arr[ind]+solve(arr,ind-2,dp);
        
        return dp[ind]=Math.max(take,nottake);
    }
}
