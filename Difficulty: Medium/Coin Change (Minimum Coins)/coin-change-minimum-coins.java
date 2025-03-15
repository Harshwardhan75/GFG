//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

class Solution {

    public int minCoins(int coins[], int sum) {
        // code here
        int n=coins.length;
        int[][] dp=new int[n][sum+1];
        for(int[] i: dp)    Arrays.fill(i,-1);
    
        int ans = solve(coins,n-1,sum,dp);
        
        return ans>=(int)1e8?-1:ans;
    }
    
    int solve(int[] coin,int index,int sum,int[][] dp){
        if(index==0){
            if(sum%coin[0]==0)
                return sum/coin[0];
            
            return (int)1e8;
        }
        
        if(dp[index][sum]!=-1)
            return dp[index][sum];
        
        int nottake = solve(coin,index-1,sum,dp);
        int take = Integer.MAX_VALUE;
        if(coin[index]<=sum)
            take = 1+solve(coin,index,sum-coin[index],dp);
        
        return dp[index][sum]=Math.min(take,nottake);
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.minCoins(arr, k);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends