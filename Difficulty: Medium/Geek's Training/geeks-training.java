//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int[][] arr = new int[N][3];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            Solution obj = new Solution();
            int res = obj.maximumPoints(arr);
            System.out.println(res);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maximumPoints(int arr[][]) {
        // code here
        int n=arr.length;
        int[][] dp=new int[n][3];
        
        dp[n-1][0]=arr[n-1][0];
        dp[n-1][1]=arr[n-1][1];
        dp[n-1][2]=arr[n-1][2];
        
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(j!=k){
                        dp[i][j]=Math.max(dp[i][j],dp[i+1][k]+arr[i][j]);
                    }
                }
            }
        }
        
        return Math.max(dp[0][0],Math.max(dp[0][1],dp[0][2]));
    }
    
    int find(int[][] arr,int sum,int selected,int index,int[][] dp){
        if(index==arr.length)   
            return sum;
        
        if(dp[index][selected]!=-1)
            return dp[index][selected];
        
        int max = sum;
        
        if(selected==0){
            max=Math.max(max,find(arr,sum+arr[index][0],1,index+1,dp));
            max=Math.max(max,find(arr,sum+arr[index][0],2,index+1,dp));
        }
        if(selected==1){
            max=Math.max(max,find(arr,sum+arr[index][1],0,index+1,dp));
            max=Math.max(max,find(arr,sum+arr[index][1],2,index+1,dp));
        }
        if(selected==2){
            max=Math.max(max,find(arr,sum+arr[index][2],0,index+1,dp));
            max=Math.max(max,find(arr,sum+arr[index][2],1,index+1,dp));
        }
    
        return dp[index][selected]=max;
    }
}